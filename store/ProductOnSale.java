package store;
import store.interfaces.SalesPromotion;

public class ProductOnSale implements SalesPromotion {

    // Apply percentage discount to total purchase (unitPrice * quantity)
    public double applyDiscount(double unitPrice, double discountPercent, double quantity) {
        return (unitPrice * (1 - discountPercent / 100.0)) * quantity;
    }

    // Buy 1 Take 1: pay for every 2nd item? No — pay only for half (rounded up)
    public double buyOneTakeOne(double price, double quantity) {
        double payableQty = Math.ceil(quantity / 2.0);
        return payableQty * price;
    }

    // Buy 2 Take 1: every 3 items, pay for 2
    public double buyTwoTakeOne(double price, double quantity) {
        double payableQty = Math.ceil(quantity * 2.0 / 3.0);
        return payableQty * price;
    }
}