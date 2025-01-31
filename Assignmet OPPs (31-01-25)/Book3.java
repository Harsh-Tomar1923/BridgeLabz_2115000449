package oops2;

public class Book3 {
    public String ISBN;
    protected String title;
    private String author;

    public Book3(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class EBook extends Book3 {
    private double fileSize;

    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    public void displayEBookDetails() {
        System.out.println("ISBN: " + ISBN); // Accessing public field from superclass
        System.out.println("Title: " + title); // Accessing protected field from superclass
        System.out.println("File Size: " + fileSize + " MB");
    }

    public static void main(String[] args) {
        Book3 book = new Book3("978-3-16-148410-0", "Java Programming", "John Smith");
        book.displayBookDetails();

        EBook eBook = new EBook("978-1-23-456789-0", "Learning Java", "Jane Doe", 15.2);
        eBook.displayEBookDetails();
    }
}
