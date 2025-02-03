package Assignment0302;

class Product {
    private static double discount = 10.0;
    private String productName;
    private final int productID;
    private double price;
    private int quantity;

    public Product(String productName, int productID, double price, int quantity) {
        this.productName = productName;
        this.productID = productID;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product Name: " + productName);
            System.out.println("Product ID: " + productID);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        }
    }

    public static void main(String[] args) {
        Product prod1 = new Product("Laptop", 201, 50000.0, 2);
        Product prod2 = new Product("Phone", 202, 30000.0, 1);

        prod1.displayProductDetails();
        System.out.println();
        prod2.displayProductDetails();

        updateDiscount(15.0);
        System.out.println("\nUpdated Discount: " + discount + "%");
    }
}
