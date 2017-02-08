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
		deleteDups(head);
		
		System.out.println();		
		head.printNodes();		
	}
	
	private static void deleteDups(Node n) {
		Hashtable<Integer, Boolean> table = new Hashtable<Integer, Boolean>();
		Node previous = null;
		
		while(n != null) {
			if(table.containsKey(n.data)) previous.next = n.next;
			else {
				table.put(n.data, true);
				previous = n;
			}
			n = n.next;
		}
	}
}
