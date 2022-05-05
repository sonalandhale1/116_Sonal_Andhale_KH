import java.util.*;
class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
class LinkedList{
	Node head;
	
	void insertnode(int value){
		Node newNode = new Node(value);
		if(head == null){
			head = newNode;
			return;
		}
		
		Node temp = head;
		
		while(temp.next != null){
			temp = temp.next;
		}
		
		temp.next = newNode;
	}
	
	void reverse(){
		reverse(head);
	}
	
	void reverse(Node head){
		if(head == null)
			return;
		
		reverse(head.next);
		System.out.print(head.data+ " ");
	}
	
	void display(){
		if(head == null){
			System.out.println("Empty Linkedlist");
			return;
		}
		
		Node temp = head;
		
		while(temp != null){
			System.out.print(temp.data+" ");
			temp =temp.next;
		}
		System.out.println();
		
	}
}

public class ReverseLL{
	public static void main(String args[]){
		LinkedList ls = new LinkedList();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Elements in linkedlist");
		int n = sc.nextInt();
		
		System.out.println("Enter the Elements of linkedlist");
		for(int i =0; i<n; i++){
			ls.insertnode(sc.nextInt());
		}
		
		System.out.println("List before : ");
		ls.display();
		
		System.out.println("List after reversal : ");
		ls.reverse();	
	}
}
	
	
