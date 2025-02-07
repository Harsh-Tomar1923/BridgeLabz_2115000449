package Inheritence;

class Book {
    protected String title;
    protected int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Publication Year: " + publicationYear);
    }
}

class Author extends Book {
    private String name;
    private String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + name + ", Bio: " + bio);
    }
}

public class LibraryTest {
    public static void main(String[] args) {
        Author book1 = new Author("Java Programming", 2020, "Harsh Tomar", "Expert in Java and Software Development");
        Author book2 = new Author("Data Structures", 2018, "Ayush Agrawal", "Professor of Computer Science");

        book1.displayInfo();
        System.out.println();
        book2.displayInfo();
    }
}

