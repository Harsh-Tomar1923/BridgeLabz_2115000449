import java.util.*;
class LinkedList {
    
    int size;
    Node tail;
    Node head;
    
    class Node {
        int price;
        int quantity;
        int itemId;
        String name;
        Node next;
        
        Node(int itemId, String name, int quantity, int price) {
            this.itemId = itemId;
            this.name = name;
            this.quantity = quantity;
            this.price = price;
            this.next = null;
        }
        
        Node(Node n) {
            this.itemId = n.itemId;
            this.name = n.name;
            this.quantity = n.quantity;
            this.price = n.price;
            this.next = null;
        }
        
        public void display() {
            System.out.println("Item price is : " + this.price);
            System.out.println("Item quantity is : " + this.quantity);
            System.out.println("Item id is : " + this.itemId);
            System.out.println("Item name is : " + this.name);
        }
    }
    
    LinkedList() {
        this.size = 0;
        this.tail = null;
        this.head = null;
    }
    
    public void totalValue() {
        Node temp = head;
        int sum = 0;
        while (temp != null) {
            sum += temp.price * temp.quantity;
            temp = temp.next;
        }
        System.out.println("Total Inventory value is : " + sum);
    }
    
    public void displayAll() {
        Node temp = head;
        while (temp != null) {
            temp.display();
            System.out.println();
            temp = temp.next;
        }
    }
    
    public void search(int itemId) {
        Node temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                temp.display();
                return;
            }
            temp = temp.next;
        }
        System.out.println("Cannot find the Item with Item Id : " + itemId);
    }
    
    public void search(String name) {
        Node temp = head;
        while (temp != null) {
            if (temp.name.equals(name)) {
                temp.display();
                return;
            }
            temp = temp.next;
        }
        System.out.println("Cannot find the Item with name : " + name);
    }
	 private Node getMid(Node head) {
        if (head == null || head.next == null)
            return head;
        Node temp1 = head;
        Node temp2 = head;
        while (temp1.next != null && temp1.next.next != null) {
            temp1 = temp1.next.next;
            temp2 = temp2.next;
        }
        return temp2;
    }
    
    public void addLast(int itemId, String name, int quantity, int price) {
        Node nn = new Node(itemId, name, quantity, price);
        if (tail == null)
            tail = nn;
        else {
            tail.next = nn;
            tail = nn;
        }
        if (head == null)
            head = nn;
        size++;
        System.out.println("Node is added at Last");
    }
	private Node merge(Node left, Node right) {
        if (left == null)
            return right;
        if (right == null)
            return left;
        Node curr = new Node(1, "null", 2, 3);
        Node newHead = curr;
        while (left != null && right != null) {
            if (left.name.compareTo(right.name) <= 0) {
                curr.next = left;
                left = left.next;
            } else {
                curr.next = right;
                right = right.next;
            }
            curr = curr.next;
        }
        if (left != null)
            curr.next = left;
        if (right != null)
            curr.next = right;
        return newHead.next;
    }
    
    public void updateQuantity(int itemId, int quantity) {
        Node temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                temp.quantity = quantity;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Cannot find Item with item id : " + itemId);
    }
    
    public void sortName() {
        head = mergeSort(head);
    }
    
    private Node mergeSort(Node head) {
        if (head == null || head.next == null)
            return head;
        Node mid = getMid(head);
        Node nextToMid = mid.next;
        mid.next = null;
        Node left = mergeSort(head);
        Node right = mergeSort(nextToMid);
        return merge(left, right);
    }
    
   
    
    
}
