package Assignment0302;

class Book {
    private static String libraryName = "GLA Central Library";
    private String title;
    private String author;
    private final String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }

    public static void main(String[] args) {
        Book.displayLibraryName();

        Book book1 = new Book("xyz", "F. abc", "9780743273565");
        Book book2 = new Book("abc", "xyz", "9780451524935");

        book1.displayBookDetails();
        System.out.println();
        book2.displayBookDetails();
    }
}

