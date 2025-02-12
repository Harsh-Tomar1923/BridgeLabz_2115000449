class LinkedList {
    
    int size;
    Node tail;
    Node head;
    
    class Node {
        String grade;
        int rollNumber;
        int age;
        String name;
        Node next;
        
        Node(int rollNumber, String name, int age, String grade) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.age = age;
            this.grade = grade;
            this.next = null;
        }
        
        public void display() {
            System.out.println("Student Grade is : " + this.grade);
            System.out.println("Student Roll Number is : " + this.rollNumber);
            System.out.println("Student Age is : " + this.age);
            System.out.println("Student Name is : " + this.name);
        }
    }
    
    LinkedList() {
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
    
    public void search(int rollNumber) {
        Node temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                temp.display();
                return;
            }
            temp = temp.next;
        }
        System.out.println("Cannot find the student with Roll Number : " + rollNumber);
    }
    
    public void addLast(int rollNumber, String name, int age, String grade) {
        Node nn = new Node(rollNumber, name, age, grade);
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
    
	public void delete(int rollNumber) {
        if (head.rollNumber == rollNumber) {
            head = head.next;
            return;
        }
        Node prev = null;
        Node temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                prev.next = temp.next;
                if (temp.next == null)
                    tail = prev;
            }
            prev = temp;
            temp = temp.next;
        }
    }
	
    
    public void addAt(int rollNumber, String name, int age, String grade, int place) {
        if (place > (size + 1) || place <= 0) {
            System.out.println("Cannot add at this position");
            return;
        }
        if (place == 1) {
            addFirst(rollNumber, name, age, grade);
            return;
        }
        if (place == (size + 1)) {
            addLast(rollNumber, name, age, grade);
            return;
        }
        Node temp = head;
        for (int c = 1; c < place - 1; c++)
            temp = temp.next;
        Node nn = new Node(rollNumber, name, age, grade);
        nn.next = temp.next;
        temp.next = nn;
        size++;
        System.out.println("Node has been added to the place " + place);
    }
    
    public void updateGrade(int rollNumber, String grade) {
        Node temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                temp.grade = grade;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Cannot find Student with Roll Number : " + rollNumber);
    }
    
    public void addFirst(int rollNumber, String name, int age, String grade) {
        Node nn = new Node(rollNumber, name, age, grade);
        nn.next = head;
        head = nn;
        if (tail == null)
            tail = nn;
        size++;
        System.out.println("Node is added at First");
    }
}