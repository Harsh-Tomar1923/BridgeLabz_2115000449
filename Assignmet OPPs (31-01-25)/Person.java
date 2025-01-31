package oops2;

public class Person {
    private String name;
    private int age;

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Display person details
    public void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        // Creating a Person object
        Person person1 = new Person("Harsh", 21);
        person1.displayPerson();

        // Creating a clone using the copy constructor
        Person person2 = new Person(person1);
        person2.displayPerson();
    }
}
