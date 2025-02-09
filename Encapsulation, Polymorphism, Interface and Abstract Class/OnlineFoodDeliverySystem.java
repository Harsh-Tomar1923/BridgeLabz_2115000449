package oops;

import java.util.ArrayList;
import java.util.List;

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            throw new IllegalArgumentException("Quantity must be positive.");
        }
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity);
    }
}

interface Discountable {
    double applyDiscount(double percentage);
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount(double percentage) {
        return calculateTotalPrice() * (1 - percentage / 100);
    }

    @Override
    public String getDiscountDetails() {
        return "Veg item discount available.";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private double nonVegCharge = 1.1;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() * nonVegCharge;
    }

    @Override
    public double applyDiscount(double percentage) {
        return calculateTotalPrice() * (1 - percentage / 100);
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg item includes additional charges.";
    }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        List<FoodItem> orderList = new ArrayList<>();

        VegItem vegBurger = new VegItem("Veg Burger", 100, 2);
        NonVegItem chickenPizza = new NonVegItem("Chicken Pizza", 200, 1);

        orderList.add(vegBurger);
        orderList.add(chickenPizza);

        double discountPercentage = 10;

        for (FoodItem item : orderList) {
            item.getItemDetails();
            System.out.println("Total Price: " + item.calculateTotalPrice());

            if (item instanceof Discountable) {
                System.out.println(((Discountable) item).getDiscountDetails());
                System.out.println("Price after " + discountPercentage + "% discount: " +
                        ((Discountable) item).applyDiscount(discountPercentage));
            }
            System.out.println();
        }
    }
}
