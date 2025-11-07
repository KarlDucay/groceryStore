package store.interfaces;

public interface SalesPromotion {
    double applyDiscount(double unitPrice, double discountPercent, double quantity);
    double buyOneTakeOne(double price, double quantity );
    double buyTwoTakeOne(double price, double quantity);
}
