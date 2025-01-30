package Class_Assignment;

public class Book {
    private String title;
    private String author;
    private int price;

    //constructor
    public Book(String title,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;
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

    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }

    //method
    public void displayDetails(){
        System.out.println("Title of the book is: "+this.title);
        System.out.println("Author of the book is: "+this.author);
        System.out.println("Price of the book is: "+this.price);
    }
}
