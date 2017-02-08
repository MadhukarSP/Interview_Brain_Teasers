import java.util.*;

class FindLoopInLinkedList {
	
	public static void main(String[] arg) {
		Node head = new Node(20);
		head.insertNodeAtEnd(10);
		head.insertNodeAtEnd(40);
		head.insertNodeAtEnd(60);
		head.insertNodeAtEnd(10);
		
		head.printNodes();		
		System.out.println();
		deleteNodeInMiddle(head.next.next.next);
		head.printNodes();
	}
	
	private static void deleteNodeInMiddle(Node n) {
		if(n == null || n.next == null) {
			return;
		}
		n.data = n.next.data;
		n.next = n.next.next;
	}
}