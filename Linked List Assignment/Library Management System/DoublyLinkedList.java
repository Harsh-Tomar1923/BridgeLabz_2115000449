import java.util.*;
class DoublyLinkedList {
    
    int size;
    Node tail;
    Node head;
    
    class Node {
        boolean availabilityStatus;
        int bookId;
        String title;
        String author;
        String genre;
        Node prev;
        Node next;
        
        Node(String title, String author, String genre, int bookId) {
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.bookId = bookId;
            this.availabilityStatus = true;
            this.prev = null;
            this.next = null;
        }
        
        public void display() {
            System.out.println("Book Id is : " + this.bookId);
            System.out.println("Book Title is : " + this.title);
            System.out.println("Book Author is : " + this.author);
            System.out.println("Book Genre is : " + this.genre);
            System.out.println("Availability of Book is : " + this.availabilityStatus);
        }
    }
    
    DoublyLinkedList() {
        this.size = 0;
        this.tail = null;
        this.head = null;
    }
    
    public void countBooks() {
        System.out.println("The number of Books in the library are : " + this.size);
    }
    
    public void displayAll() {
        Node temp = head;
        while (temp != null) {
            temp.display();
            System.out.println();
            temp = temp.next;
        }
    }
    
    public void displayAllReverse() {
        Node temp = tail;
        while (temp != null) {
            temp.display();
            System.out.println();
            temp = temp.prev;
        }
    }
    
    public void addLast(String title, String author, String genre, int bookId) {
        Node nn = new Node(title, author, genre, bookId);
        if (tail == null)
            tail = nn;
        else {
            tail.next = nn;
            nn.prev = tail;
            tail = nn;
        }
        if (head == null)
            head = nn;
        size++;
        System.out.println("Node is added at Last");
    }
    
    public void addFirst(String title, String author, String genre, int bookId) {
        Node nn = new Node(title, author, genre, bookId);
        nn.next = head;
        if (head != null)
            head.prev = nn;
        head = nn;
        if (tail == null)
            tail = nn;
        size++;
        System.out.println("Node is added at First");
    }
    
    public void addAt(String title, String author, String genre, int bookId, int place) {
        if (place > (size + 1) || place <= 0) {
            System.out.println("Cannot add at this position");
            return;
        }
        if (place == 1) {
            addFirst(title, author, genre, bookId);
            return;
        }
        if (place == (size + 1)) {
            addLast(title, author, genre, bookId);
            return;
        }
        Node temp = head;
        for (int c = 1; c < place - 1; c++)
            temp = temp.next;
        Node nn = new Node(title, author, genre, bookId);
        nn.next = temp.next;
        temp.next.prev = nn;
        temp.next = nn;
        nn.prev = temp;
        size++;
        System.out.println("Node has been added to the place " + place);
    }
	
	public void updateAvailability(String title, boolean availabilityStatus) {
        Node temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                temp.availabilityStatus = availabilityStatus;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Cannot find Book with title : " + title);
    }
    
    public void delete(int bookId) {
        if (head == null) return;
        if (head.bookId == bookId) {
            head = head.next;
            if (head != null)
                head.prev = null;
            size--;
            return;
        }
        Node temp = head;
        while (temp != null) {
            if (temp.bookId == bookId) {
                temp.prev.next = temp.next;
                if (temp.next != null)
                    temp.next.prev = temp.prev;
                else
                    tail = temp.prev;
                size--;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Cannot find the Book with book Id : " + bookId);
    }
    
    public void search(String match) {
        Node temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.title.equals(match) || temp.author.equals(match)) {
                temp.display();
                found = true;
            }
            temp = temp.next;
        }
        if (!found)
            System.out.println("Cannot find the Book with the given input");
    }
    
    
}