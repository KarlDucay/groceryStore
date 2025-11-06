package store.enums;

public enum SaleTypes {
    NONE("No sale"),
    REGULAR("Regular price"),
    DISCOUNTED("Discounted item"),
    BUY_ONE_TAKE_ONE("Buy 1 Take 1"),
    BUY_TWO_TAKE_ONE("Buy 2 Take 1"),
    BULK("Bulk sale"),
    SEASONAL("Seasonal promo");

    private final String description;

    SaleTypes(String description) {
        this.description = description;
    }
}
