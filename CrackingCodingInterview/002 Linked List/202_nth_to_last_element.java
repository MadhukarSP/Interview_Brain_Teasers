import java.util.*;

class UnsortedLinkedList  {
	
	public static void main(String[] arg) {
		Node head = new Node(10);
		head.insertNodeAtEnd(30);
		head.insertNodeAtEnd(40);
		head.insertNodeAtEnd(60);
		head.insertNodeAtEnd(10);
		head.insertNodeAtEnd(40);
		head.insertNodeAtEnd(70);
		
		head.printNodes();		
		System.out.println();
		findNthToLast(head,6);
	}
	
	private static void findNthToLast(Node node, int n) {
		Node first = node;
		Node second = node;
		
		for(int i=0; i < n; i++) {
			second = second.next;
		}
		
		while(second != null) {
			first = first.next;
			second = second.next;
		}
		
		System.out.println("The "+ n + " element from last is " + first.data);
	}
}
