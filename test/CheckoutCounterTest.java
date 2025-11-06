package test;

import org.junit.Test;
import store.*;
import store.constructor.Product;
import store.enums.SaleTypes;

import static org.junit.Assert.*;

public class CheckoutCounterTest {

    @Test
    public void testCalculatePriceSoldByPiece() {
        CheckoutCounter counter = new CheckoutCounter();
        counter.scanProduct(new Product("Chips", 35, SaleTypes.REGULAR)); // defaults to qty 1
        counter.scanProduct(new Product("Soda", 20, SaleTypes.REGULAR));
        assertEquals(55, counter.getTotalPrice(), 0.001);
    }

    @Test
    public void testCalculatePriceSoldInBulk() {
        CheckoutCounter counter = new CheckoutCounter();
        counter.scanProduct(new Product("Rice", 45, 2.5, SaleTypes.BULK)); // qty = 2.5
        // Bulk items could have small discount depending on your CheckandCalculateSaletype logic
        // For now assume regular pricing (no discount applied)
        assertEquals(112.5, counter.getTotalPrice(), 0.001);
    }

    @Test
    public void testProductOnDiscountedSale() {
        CheckoutCounter counter = new CheckoutCounter();
        // Bulk sale: 50 * 20 = 1000, 10% off -> 900
        counter.scanProduct(new Product("Milk", 50, 20, SaleTypes.DISCOUNTED,10));
        // Single product sale: 50 * 1 = 50, 10% off -> 45
        counter.scanProduct(new Product("Milk", 50, SaleTypes.DISCOUNTED,10));
        // Assuming your DISCOUNTED logic gives 10% off
        assertEquals(945, counter.getTotalPrice(), 0.001);
    }

    @Test
    public void testBuyOneTakeOnePromo() {
        CheckoutCounter counter = new CheckoutCounter();
        // Example: Buy 1 Take 1, pay for half (rounded up)
        counter.scanProduct(new Product("Soap", 25, 5, SaleTypes.BUY_ONE_TAKE_ONE));
        // 5 items → pay for 3 → total = 3 * 25 = 75
        assertEquals(75, counter.getTotalPrice(), 0.001);
    }

    @Test
    public void testBuyTwoTakeOnePromo() {
        CheckoutCounter counter = new CheckoutCounter();
        // Example: Buy 2 Take 1, every 3rd is free
        counter.scanProduct(new Product("Shampoo Sachet", 10, 7, SaleTypes.BUY_TWO_TAKE_ONE));
        // Pay for ceil((7 * 2)/3) = ceil(4.66) = 5 * 10 = 50
        assertEquals(50, counter.getTotalPrice(), 0.001);
    }

    @Test
    public void testMultipleProductsMixedTypes() {
        CheckoutCounter counter = new CheckoutCounter();
        counter.scanProduct(new Product("Eggs", 70, SaleTypes.REGULAR));      // 70
        counter.scanProduct(new Product("Rice", 40, 1.5, SaleTypes.REGULAR)); // 40 * 1.5 = 60
        assertEquals(130, counter.getTotalPrice(), 0.001);
    }
}
