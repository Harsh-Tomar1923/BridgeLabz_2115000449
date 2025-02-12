import java.util.*;
class DoublyLinkedList {
    
    int size;
    Node tail;
    Node head;
    
    class Node {
        double rating;
        int yearOfRelease;
        String title;
        String director;
        Node prev;
        Node next;
        
        Node(String title, String director, int yearOfRelease, double rating) {
            this.title = title;
            this.director = director;
            this.yearOfRelease = yearOfRelease;
            this.rating = rating;
            this.prev = null;
            this.next = null;
        }
        
        public void display() {
            System.out.println("Movie Rating is : " + this.rating);
            System.out.println("Movie Year of Release is : " + this.yearOfRelease);
            System.out.println("Movie Title is : " + this.title);
            System.out.println("Movie Director is : " + this.director);
        }
    }
    
    DoublyLinkedList() {
        this.size = 0;
        this.tail = null;
        this.head = null;
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
    
    public void search(String director) {
        Node temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.director.equals(director)) {
                temp.display();
                found = true;
            }
            temp = temp.next;
        }
        if (!found)
            System.out.println("Cannot find the Movie with Director : " + director);
    }
    
    public void search(double rating) {
        Node temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.rating == rating) {
                temp.display();
                found = true;
            }
            temp = temp.next;
        }
        if (!found)
            System.out.println("Cannot find the Movie with Rating : " + rating);
    }
    
    public void addLast(String title, String director, int yearOfRelease, double rating) {
        Node nn = new Node(title, director, yearOfRelease, rating);
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
    
    public void delete(String title) {
        if (head.title.equals(title)) {
            head = head.next;
            if (head != null)
                head.prev = null;
            return;
        }
        Node temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                temp.prev.next = temp.next;
                if (temp.next != null)
                    temp.next.prev = temp.prev;
                else
                    tail = temp.prev;
                return;
            }
            temp = temp.next;
        }
    }
    
    public void updateRating(String title, double rating) {
        Node temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                temp.rating = rating;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Cannot find Movie with title : " + title);
    }
}