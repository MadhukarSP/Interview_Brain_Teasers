public class Node {
	
	int data;
	Node next;
	
	public Node(int d) {
		data = d;
		next = null;
	}
	
	Node insertNodeAtEnd(int d) {
		Node node = new Node(d);
		Node n = this;
		while(n.next != null) 
			n = n.next;
		n.next = node;
		
		return node;
	} 
	
	void printNodes() {
		Node node = this;
		int i=1;
		while(node != null) {
			System.out.println("Node " + i++ + ": " + node.data);
			node = node.next;
		}			
	}
	
	Node deleteNode(int d) {
		Node head = this;
		if(head.data == d) {
			return head.next;
		}
		
		while(head.next != null) {
			if(head.next.data == d) {
				head.next = head.next.next;
				return this;
			}
			head = head.next;
		}
		return this;
	}
}