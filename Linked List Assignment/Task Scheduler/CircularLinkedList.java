class CircularLinkedList {
    
    int size;
    Node tail;
    Node head;
    
    class Node {
        int priority;
        int taskId;
        String name;
        String dueDate;
        Node next;
        
        Node(int taskId, String name, int priority, String dueDate) {
            this.taskId = taskId;
            this.name = name;
            this.priority = priority;
            this.dueDate = dueDate;
            this.next = this;
        }
        
        public void display() {
            System.out.println("Task Priority is : " + this.priority);
            System.out.println("Task Id is : " + this.taskId);
            System.out.println("Task Name is : " + this.name);
            System.out.println("Task Due Date is : " + this.dueDate);
        }
    }
    
    CircularLinkedList() {
        this.size = 0;
        this.tail = null;
        this.head = null;
    }
    
    public void displayAll() {
        Node temp = head;
        do {
            temp.display();
            System.out.println();
            temp = temp.next;
        } while (temp != head);
    }
    
    public void search(int priority) {
        Node temp = head;
        boolean found = false;
        do {
            if (temp.priority == priority) {
                temp.display();
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        if (!found)
            System.out.println("Cannot find the Task with Priority : " + priority);
    }
    
    public void updateDueDate(int taskId, String dueDate) {
        Node temp = head;
        do {
            if (temp.taskId == taskId) {
                temp.dueDate = dueDate;
                return;
            }
            temp = temp.next;
        } while (temp != head);
        System.out.println("Cannot find Task with Due Date : " + dueDate);
    }
    
    public void addLast(int taskId, String name, int priority, String dueDate) {
        Node nn = new Node(taskId, name, priority, dueDate);
        if (tail == null) {
            tail = nn;
        } else {
            tail.next = nn;
            tail = nn;
        }
        if (head == null) {
            head = nn;
        }
        tail.next = head;
        size++;
        System.out.println("Node is added at Last");
    }
    
    public void delete(int taskId) {
        if (head.taskId == taskId) {
            head = head.next;
            tail.next = head;
            return;
        }
        Node prev = null;
        Node temp = head;
        do {
            if (temp.taskId == taskId) {
                prev.next = temp.next;
                if (temp.next == null)
                    tail = prev;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }
}
