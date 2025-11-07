package store.constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import store.enums.SaleTypes;

public class TestProducts {

    // Single products (no quantity)
    Product milk = new Product("Milk", 50, SaleTypes.DISCOUNTED, 10);           // 10% off
    Product bread = new Product("Bread", 30, SaleTypes.REGULAR);
    Product eggs = new Product("Eggs", 70, SaleTypes.REGULAR);
    Product butter = new Product("Butter", 85, SaleTypes.REGULAR);
    Product cheese = new Product("Cheese", 120, SaleTypes.DISCOUNTED, 15);     // 15% off
    Product shampoo = new Product("Shampoo Sachet", 10, SaleTypes.BUY_TWO_TAKE_ONE);
    Product soap = new Product("Bath Soap", 25, SaleTypes.BUY_ONE_TAKE_ONE);
    Product toothpaste = new Product("Toothpaste", 65, SaleTypes.DISCOUNTED, 5); // 5% off
    Product coffee = new Product("Coffee 3-in-1", 8, SaleTypes.BULK);
    Product cannedTuna = new Product("Canned Tuna", 55, SaleTypes.REGULAR);

    // Bulk or quantity-based products
    Product surfPowder = new Product("Surf Powder", 7, 12, SaleTypes.BUY_TWO_TAKE_ONE);
    Product rice = new Product("Rice", 50, 10, SaleTypes.BULK);
    Product sugar = new Product("Sugar", 45, 5, SaleTypes.REGULAR);
    Product cookingOil = new Product("Cooking Oil", 120, 3, SaleTypes.DISCOUNTED, 10); // 10% off
    Product soySauce = new Product("Soy Sauce", 25, 4, SaleTypes.REGULAR);
    Product vinegar = new Product("Vinegar", 22, 4, SaleTypes.REGULAR);
    Product detergent = new Product("Detergent Powder", 9, 10, SaleTypes.BUY_ONE_TAKE_ONE);
    Product tissue = new Product("Tissue Roll", 15, 6, SaleTypes.REGULAR);
    Product bottledWater = new Product("Bottled Water", 20, 12, SaleTypes.BULK);
    Product softdrinks = new Product("Softdrinks", 35, 6, SaleTypes.SEASONAL);

    private List<Product> products;

    public TestProducts() {
        products = new ArrayList<>();
        products.add(milk);
        products.add(bread);
        products.add(eggs);
        products.add(butter);
        products.add(cheese);
        products.add(shampoo);
        products.add(soap);
        products.add(toothpaste);
        products.add(coffee);
        products.add(cannedTuna);
        products.add(surfPowder);
        products.add(rice);
        products.add(sugar);
        products.add(cookingOil);
        products.add(soySauce);
        products.add(vinegar);
        products.add(detergent);
        products.add(tissue);
        products.add(bottledWater);
        products.add(softdrinks);
    }

    public Product getRandomProduct() {
        Random random = new Random();
        int index = random.nextInt(products.size());
        return products.get(index);
    }

    public List<Product> getAllProducts() {
        return products;
    }
}
