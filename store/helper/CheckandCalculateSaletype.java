package store.helper;

import store.ProductOnSale;
import store.enums.SaleTypes;
import store.interfaces.SalesPromotion;

public class CheckandCalculateSaletype {
    public SaleResult checkandCalculateSaletype (SaleTypes saleTypes,double price, double quantity,double discount){
        SalesPromotion promotion= new ProductOnSale();
        double discountedPrice;

        switch (saleTypes) {
                case BUY_ONE_TAKE_ONE:
                    discountedPrice =promotion.buyOneTakeOne(price, quantity);
                    return new SaleResult(discountedPrice, true);
                case DISCOUNTED:
                    discountedPrice =promotion.applyDiscount(price, discount,quantity);
                    return new SaleResult(discountedPrice, true);
                case BUY_TWO_TAKE_ONE:
                    discountedPrice =promotion.buyTwoTakeOne(price, quantity);
                    return new SaleResult(discountedPrice, true);
                default:
                    return new SaleResult(price, false);
            }
    }
}
