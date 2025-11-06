package store;

import java.util.List;
import store.helper.ScannedItem;

public class ReceiptPrinter {

    public void printReceipt(List<ScannedItem> items, double total) {
        System.out.println("====================================");
        System.out.println("             RECEIPT                ");
        System.out.println("====================================");
        System.out.printf("%-20s %5s %10s%n", "Item", "Qty", "Total");
        System.out.println("------------------------------------");

        for (ScannedItem item : items) {
            String name = item.getProduct().getName();
            double price = item.getProduct().getPrice();
            double qty = item.getQuantity();
            double discountedPrice = item.getDiscountedPrice();
            double lineTotal = item.getProductTotalPrice();

            System.out.printf("%-20s %5.2f %10.2f%n", name, qty, lineTotal);

            if (discountedPrice < lineTotal) {
                System.out.printf("   @%.2f each | Discounted: %.2f%n", price, discountedPrice);
            } 
            else {
                System.out.printf("   @%.2f each%n", price);
            }

            System.out.println();
        }

        System.out.println("------------------------------------");
        System.out.printf("%-20s %5s %10.2f%n", "TOTAL", "", total);
        System.out.println("====================================");
    }
}
