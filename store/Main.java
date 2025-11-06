package store;

import store.helper.TestProducts;

public class Main {

    public static void main(String[] args) {
        TestProducts testProducts=new TestProducts();
        CheckoutCounter counter = new CheckoutCounter();
        // Simulate scanning  products from test products 
        for (int i=0 ; i<5 ;i++)
        {
        counter.scanProduct(testProducts.getRandomProduct());

        }
        // Compute total
        double finalTotal = counter.getTotalPrice();
        // Print receipt
        ReceiptPrinter printer = new ReceiptPrinter();
        printer.printReceipt(counter.getItems(), finalTotal);
    }
}
