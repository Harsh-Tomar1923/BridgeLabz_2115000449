package Inheritence;

class Order {
    protected String orderId;
    protected String orderDate;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order Placed";
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId + ", Order Date: " + orderDate);
    }
}

class ShippedOrder extends Order {
    protected String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order Shipped";
    }

    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order Delivered";
    }

    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

public class OrderManagementTest {
    public static void main(String[] args) {
        Order order1 = new Order("ORD123", "2025-02-07");
        ShippedOrder order2 = new ShippedOrder("ORD124", "2025-02-06", "TRK567");
        DeliveredOrder order3 = new DeliveredOrder("ORD125", "2025-02-05", "TRK890", "2025-02-07");

        order1.displayOrderDetails();
        System.out.println("Status: " + order1.getOrderStatus());
        System.out.println();

        order2.displayOrderDetails();
        System.out.println("Status: " + order2.getOrderStatus());
        System.out.println();

        order3.displayOrderDetails();
        System.out.println("Status: " + order3.getOrderStatus());
    }
}
