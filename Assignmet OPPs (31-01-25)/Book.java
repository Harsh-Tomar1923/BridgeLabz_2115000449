package oops2;

public class Book {
    private String title;
    private String author;
    private double price;

    // Default constructor
    public Book() {
        this("Unknown Title", "Unknown Author", 0.0);
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    //getter and setter methods
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }

    public String getAuthor(){
        return author;
    }
    public void setAuthor(String auth){
        this.author=auth;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }

    // Display book details
    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        // Using default constructor
        Book book1 = new Book();
        book1.displayBook();

        // Using parameterized constructor
        Book book2 = new Book("The Alchemist", "Paulo Coelho", 10.99);
        book2.displayBook();
    }
}
