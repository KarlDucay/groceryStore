package store.constructor;

public class ScannedItem {
    private Product product;
    private double quantity; 
    private double discountedPrice;

    public ScannedItem(Product product, double quantity,double discountedPrice) {
        this.product = product;
        this.quantity = quantity;
        this.discountedPrice=discountedPrice;
    }

    public Product getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getProductTotalPrice() {
        return product.getPrice() * quantity;
    }
    public double getOriginalPrice(){
        return product.getPrice() ;
    }
    public double getDiscountedPrice(){
        return discountedPrice;
    }
}
