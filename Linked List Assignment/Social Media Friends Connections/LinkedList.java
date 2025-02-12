import java.util.*;
class LinkedList{
	
	int size;
	Node tail;
	Node head;
	
	class Node{
		int userId;
		int age;
		String name;
		Node next;
		List<Node> friends;
		
		Node(int userId, String name, int age){
			this.userId = userId;
			this.name = name;
			this.age = age;
			this.next = null;
			this.friends = new ArrayList<>();
		}
		
		public void display(){
			System.out.println("User Id is : "+this.userId);
			System.out.println("User name is : "+this.name);
			System.out.println("User age is : "+this.age);
			System.out.println();
		}
	}
	
	LinkedList(){
		this.size = 0;
		this.tail = null;
		this.head = null;
	}
	
	public void displayAll(){
		Node temp = head;
		while(temp != null){
			temp.display();
			temp = temp.next;
		}
	}
	
	public void search(int userId){
		Node temp = head;
		while(temp != null){
			if(temp.userId == userId){
				temp.display();
				return;
			}
			temp = temp.next;
		}
		System.out.println("Cannot find the User with user Id : "+userId);
	}
	
	public void search(String name){
		Node temp = head;
		while(temp != null){
			if(temp.name.equals(name)){
				temp.display();
				return;
			}
			temp = temp.next;
		}
		System.out.println("Cannot find the User with user name : "+name);
	}
	
	public void addLast(int userId, String name, int age){
		Node nn = new Node(userId, name, age);
		if(tail == null)
			tail = nn;
		else{
			tail.next = nn;
			tail = nn;
		}
		if(head == null)
			head = nn;
		size++;
		System.out.println("Node is added at Last");
	}
	
	public void delete(int userId){
		if(head == null) return;
		if(head.userId == userId){
			head = head.next;
			return;
		}
		Node prev = null;
		Node temp = head;
		while(temp != null){
			if(temp.userId == userId){
				prev.next = temp.next;
				if(temp.next == null)
					tail = prev;
				return;
			}
			prev = temp;
			temp = temp.next;
		}
	}
	
	public void addFriend(int userId1, int userId2){
		Node user1 = null;
		Node user2 = null;
		Node temp = head;
		while(temp != null){
			if(temp.userId == userId1) user1 = temp;
			if(temp.userId == userId2) user2 = temp;
			temp = temp.next;
		}
		if(user1 != null && user2 != null){
			user1.friends.add(user2);
			user2.friends.add(user1);
		}
	}
	
	public void removeFriend(int userId1, int userId2){
		Node user1 = null;
		Node user2 = null;
		Node temp = head;
		while(temp != null){
			if(temp.userId == userId1) user1 = temp;
			if(temp.userId == userId2) user2 = temp;
			temp = temp.next;
		}
		if(user1 != null && user2 != null){
			user1.friends.remove(user2);
			user2.friends.remove(user1);
		}
	}
	
	public void allFriends(int userId){
		Node temp = head;
		while(temp != null){
			if(temp.userId == userId){
				System.out.println("All friends of "+temp.name+" are : ");
				for(Node friend : temp.friends){
					friend.display();
				}
			}
			temp = temp.next;
		}
	}
}
