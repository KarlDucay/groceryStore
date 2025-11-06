package store.constructor;

import store.enums.SaleTypes;

public class Product {
    private String name;
    private double price;
    private Double quantity;
    private double discount; 
    private SaleTypes saletype;


     public Product(String name, double price,SaleTypes saletype) {
        this.name = name;
        this.price = price;
        this.saletype = saletype;
    }
    
     public Product(String name, double price, double quantity, SaleTypes saletype) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.saletype = saletype;
     }
     //discounted sale type 
     public Product(String name, double price, double quantity, SaleTypes saletype,double discount) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.saletype = saletype;
        this.discount=discount;
    }
     public Product(String name, double price, SaleTypes saletype,double discount) {
        this.name = name;
        this.price = price;
        this.saletype = saletype;
        this.discount=discount;

    }
    
    
    // Getters
    public String getName() { return name; }
    public double getPrice() { return price; }
    public Double getQuantity() { return quantity; }
    public Double getDiscount() { return discount; }
    public SaleTypes getSaletype (){return saletype ;}
}
