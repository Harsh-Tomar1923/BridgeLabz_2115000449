import java.util.*;
class CircularLinkedList{
	
	class Node{
	
		int ticketId;
		String customerName;
		String movieName;
		String seatNumber;
		int bookingTime;
		
		Node next;
	
		Node(int ticketId, String customerName, String movieName,  String seatNumber, int bookingTime){
		
			this.ticketId = ticketId;
			this.customerName = customerName;
			this.movieName = movieName;
			this.seatNumber = seatNumber;
			this.bookingTime = bookingTime;
		
			this.next = this;
		}
		
		public void display(){
			System.out.println("Ticket Id is : "+this.ticketId);
			System.out.println("Customer Name is : "+this.customerName);
			System.out.println("Movie Name is : "+this.movieName);
			System.out.println("Seat Number is : "+this.seatNumber);
			System.out.println("Booking time is : "+this.bookingTime);
		}
		

	}
	
	Node head;
	Node tail;
	int size;
	
	CircularLinkedList(){
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	public void addLast(int ticketId, String customerName, String movieName,  String seatNumber, int bookingTime){
		
		Node nn = new Node(ticketId, customerName, movieName, seatNumber, bookingTime);
		
		if(tail == null)
			tail = nn;
		else{
			tail.next = nn;
			tail = nn;
		}
		
		if(head == null)
			head = nn;
			
		tail.next = head;
		
		size++;
		
		System.out.println("Node is added at Last");
	}
	
	public void delete(int ticketId){
		//if at first place
		if(head.ticketId == ticketId){
			head = head.next;
			tail.next = head;
			size--;
			return;
		}
		
		Node prev = null;
		Node temp = head;
		
		do{
			if(temp.ticketId == ticketId){
				prev.next = temp.next;
				if(temp.next == null) //if at last place
					tail = prev;
			}
				
			prev = temp;
			temp = temp.next;
		}while(temp != head);
		size--;
		
	}
	
	public void search(String str){
		Node temp = head;
		boolean found = false;
		do{
			if(temp.customerName.equals(str) || temp.movieName.equals(str)){
				temp.display();
				found = true;
			}
			temp = temp.next;
		}while(temp != head);
		
		if(!found)
			System.out.println("Cannot find the Ticket with given Details: ");
	}
	
	public void displayAll(){
		
		Node temp = head;
		
		do{
			temp.display();
			System.out.println();
			temp = temp.next;
		}while(temp != head);
	}
	
	public void calculateTotalTickets(){
		
		System.out.println("Total number of tickets are : "+this.size);
		
	}
	
}