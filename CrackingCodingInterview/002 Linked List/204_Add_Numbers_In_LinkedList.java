import java.util.*;

class AddNumbersInLinkedList {
	
	public static void main(String[] arg) {
		Node head1 = new Node(3);
		head1.insertNodeAtEnd(1);
		head1.insertNodeAtEnd(5);
		
		Node head2 = new Node(5);
		head2.insertNodeAtEnd(9);
		head2.insertNodeAtEnd(4);
		
		head1.printNodes();		
		System.out.println();
		head2.printNodes();		
		System.out.println();
		Node finalList = addLists(head1, head2, 0);
		finalList.printNodes();
	}
	
	private static Node addLists(Node l1, Node l2, int carry) {
		if(l1 == null && l2 == null) {			
			if(carry == 1) {
				Node finalNode = new Node(1);
				return finalNode;
			} else {
				return null;
			}
		}
		
		Node result = new Node(0);
		
		int value = carry;
		if(l1 != null) value += l1.data;
		if(l2 != null) value += l2.data;
		
		result.data = value % 10;
		
		Node node = addLists(l1 == null? null: l1.next,
								l2 == null? null: l2.next,
								value >= 10 ? 1:0);		
		result.next = node;
		return result;
	}
	
	/*
	private static void addNumbers(Node num1, Node num2) {
		Node addedNode; 
		if( num1!= null) return num2;
		if( num2!= null) return num1;
		
		int num = 0;
		int carry = 0;
		
		while(num1 != null && num2 != null) {
			num = num + num1.data + num2.data;
			carry = 0;
			if(num >= 10) {
				num = num % 10;
				carry = 1;
			} 
			addedNode = new Node(num);
			num = carry;
			num1 = num1.next;
			num2 = num2.next;
		}

		if(num1 != null) {
			while(num1 != null) {
				num = num + num1.data;
				if(num >= 10) {
					num = num % 10;
					carry = 1;
				} 
				addedNode = new Node(num);
			}
		}	
	}
	*/
}