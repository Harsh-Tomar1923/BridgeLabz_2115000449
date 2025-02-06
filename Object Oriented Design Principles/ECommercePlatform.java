package Assignment0402;

import java.util.ArrayList;
import java.util.List;

// Product class
class Product {
    private String productName;
    private double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}

// Order class (Aggregation: Contains multiple products)
class Order {
    private int orderId;
    private Customer1 customer;
    private List<Product> products;
    private double totalAmount;

    public Order(int orderId, Customer1 customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
        this.totalAmount = 0.0;
    }

    public void addProduct(Product product) {
        products.add(product);
        totalAmount += product.getPrice();
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getCustomerName());
        System.out.println("Products:");
        for (Product product : products) {
            System.out.println("- " + product.getProductName() + " ($" + product.getPrice() + ")");
        }
        System.out.println("Total Amount: " + totalAmount);
    }
}

// Customer class (Association: Can place multiple orders)
class Customer1 {
    private String customerName;
    private List<Order> orders;

    public Customer1(String customerName) {
        this.customerName = customerName;
        this.orders = new ArrayList<>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public void showOrders() {
        System.out.println(customerName + "'s Orders:");
        for (Order order : orders) {
            order.showOrderDetails();
            System.out.println("----------------------");
        }
    }
}

// E-commerce platform class
class ECommercePlatform {
    public static void main(String[] args) {
        // Creating products
        Product product1 = new Product("Laptop", 1200.50);
        Product product2 = new Product("Smartphone", 699.99);
        Product product3 = new Product("Headphones", 149.99);

        // Creating a customer
        Customer1 customer1 = new Customer1("Harsh");

        // Creating an order
        Order order1 = new Order(101, customer1);
        order1.addProduct(product1);
        order1.addProduct(product2);

        // Creating another order
        Order order2 = new Order(102, customer1);
        order2.addProduct(product3);

        // Customer places orders
        customer1.placeOrder(order1);
        customer1.placeOrder(order2);

        // Display customer orders
        customer1.showOrders();
    }
}
