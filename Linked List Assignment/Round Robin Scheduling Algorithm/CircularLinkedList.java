class CircularLinkedList {
    
    int size;
    Node tail;
    Node head;
    
    class Node {
        int priority;
        int burstTime;
        int processId;
        Node next;
        
        Node(int processId, int burstTime, int priority) {
            this.processId = processId;
            this.burstTime = burstTime;
            this.priority = priority;
            this.next = this;
        }
        
        public void display() {
            System.out.println("Process Priority is : " + this.priority);
            System.out.println("Process Burst Time is : " + this.burstTime);
            System.out.println("Process Id is : " + this.processId);
            System.out.println();
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
            temp = temp.next;
        } while (temp != head);
    }
	
	 public void simulateRoundRobin(int timeQuantum) {
        Node temp = head;
        int cycles = 1;
        int avgWaitingTime = 0;
        int avgTurnAroundTime = 0;
        boolean processRemaining;
        do {
            processRemaining = false;
            temp = head;
            System.out.println("Processes in cycle " + cycles + " are:");
            System.out.println();
            do {
                if (temp.burstTime > 0) {
                    processRemaining = true;
                    int timeUsed = Math.min(temp.burstTime, timeQuantum);
                    temp.burstTime -= timeUsed;
                    avgTurnAroundTime += timeUsed;
                    temp.display();
                }
                temp = temp.next;
            } while (temp != head);
            cycles++;
        } while (processRemaining);
        
        System.out.println("No more processes remaining to execute");
        System.out.println();
        
        temp = head;
        int arrivalTime = 0;
        do {
            avgWaitingTime += arrivalTime * timeQuantum - arrivalTime;
            temp = temp.next;
            arrivalTime++;
        } while (temp != head);
        
        avgTurnAroundTime -= avgWaitingTime;
        avgTurnAroundTime /= size;
        avgWaitingTime /= size;
        
        System.out.println("Average Waiting time for all processes is: " + avgWaitingTime);
        System.out.println("Average Turn-Around time for all processes is: " + avgTurnAroundTime);
    }
    
    public void delete(int processId) {
        if (head.processId == processId) {
            head = head.next;
            tail.next = head;
            return;
        }
        Node prev = null;
        Node temp = head;
        do {
            if (temp.processId == processId) {
                prev.next = temp.next;
                if (temp.next == null)
                    tail = prev;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }
    
    public void addLast(int processId, int burstTime, int priority) {
        Node nn = new Node(processId, burstTime, priority);
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
    
   
}
