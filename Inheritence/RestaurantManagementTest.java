package Inheritence;

interface Worker {
    void performDuties();
}

class Person1 {
    protected String name;
    protected int id;

    public Person1(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

class Chef extends Person1 implements Worker {
    private String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println("Role: Chef");
        displayDetails();
        System.out.println("Specialty: " + specialty);
        System.out.println("Duties: Preparing dishes");
    }
}

class Waiter extends Person1 implements Worker {
    private int tablesAssigned;

    public Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    @Override
    public void performDuties() {
        System.out.println("Role: Waiter");
        displayDetails();
        System.out.println("Tables Assigned: " + tablesAssigned);
        System.out.println("Duties: Serving customers");
    }
}

public class RestaurantManagementTest {
    public static void main(String[] args) {
        Chef chef1 = new Chef("Vishal", 101, "Samosa");
        Waiter waiter1 = new Waiter("Shivam", 202, 5);

        chef1.performDuties();
        System.out.println();

        waiter1.performDuties();
    }
}
