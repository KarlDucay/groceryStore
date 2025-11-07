package store;

import java.util.ArrayList;
import java.util.List;

import store.constructor.Product;
import store.constructor.ScannedItem;
import store.enums.SaleTypes;
import store.helper.CheckandCalculateSaletype;
import store.helper.SaleResult;

public class CheckoutCounter {
    
    private List<ScannedItem> scannedProducts = new ArrayList<>();
    private double totalPrice = 0.0;
    private CheckandCalculateSaletype sale= new CheckandCalculateSaletype();

    public void scanProduct(Product product) {
        double price = product.getPrice();
        Double quantity =product.getQuantity()!=null? product.getQuantity(): 1;
        double discount = product.getDiscount();
        SaleTypes saleTypes= product.getSaletype();

        SaleResult result = sale.checkandCalculateSaletype(saleTypes, price, quantity, discount);

        price=result.discountedPrice();
        
        scannedProducts.add(new ScannedItem(product, quantity,price));
        totalPrice += price;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
    
    public List<ScannedItem> getItems() {
        return scannedProducts;
    }

}
