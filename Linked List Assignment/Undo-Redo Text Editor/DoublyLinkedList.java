import java.util.*;
class DoublyLinkedList{
	
	Node head;
	Node tail;
	Node curr;
	int size;
	int undoes;
	int limit;
	
	class Node{
		String text;
		Node prev;
		Node next;
		
		Node(String text){
			this.text = text;
			this.prev = null;
			this.next = null;
		}
		
		public void display(){
			System.out.print(this.text+" ");
		}
	}
	
	DoublyLinkedList(int limit){
		this.head = null;
		this.tail = null;
		this.curr = null;
		this.size = 0;
		this.undoes = 0;
		this.limit = limit;
	}
	
	public void delete(String text){
		if(head == null) return;
		if(head.text.equals(text)){
			head = head.next;
			if(head != null)
				head.prev = null;
			size--;
			return;
		}
		Node temp = head;
		while(temp != null){
			if(temp.text.equals(text)){
				temp.prev.next = temp.next;
				if(temp.next != null)
					temp.next.prev = temp.prev;
				if(temp == tail)
					tail = temp.prev;
				size--;
				return;
			}
			temp = temp.next;
		}
	}
	
	public void redo(){
		if(curr == null || curr.next == null){
			System.out.println("Cannot Redo anymore");
			return;
		}
		curr = curr.next;
		undoes--;
	}
	
	public void displayAll(){
		Node temp = head;
		while(temp != null && temp != curr.next){
			temp.display();
			temp = temp.next;
		}
		System.out.println();
	}
	
	public void undo(){
		if(undoes >= limit){
			System.out.println("Cannot undo more than "+limit+" times");
			return;
		}
		if(curr != null)
			curr = curr.prev;
		undoes++;
	}
	
	
	
	public void add(String text){
		Node nn = new Node(text);
		if(curr == null){
			head = nn;
			tail = nn;
			curr = nn;
		}else{
			curr.next = nn;
			nn.prev = curr;
			curr = nn;
			tail = curr;
		}
		undoes = 0;
		size++;
		System.out.println("Node is added at Last");
	}
}
