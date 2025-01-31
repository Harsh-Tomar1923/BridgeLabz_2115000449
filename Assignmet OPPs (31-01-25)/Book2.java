package oops2;
public class Book2 {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Parameterized constructor
    public Book2(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true; // Default to available
    }

    // Method to borrow a book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is currently unavailable.");
        }
    }

    // Display book details
    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

    public static void main(String[] args) {
        // Creating a Book2 object
        Book2 book1 = new Book2("The Great Gatsby", "F. Scott Fitzgerald", 12.99);

        // Calling methods on book1
        book1.displayBook(); // Display book details
        book1.borrowBook();  // Borrow the book
        book1.displayBook(); // Display book details again
        book1.borrowBook();  // Attempt to borrow again
    }
}
