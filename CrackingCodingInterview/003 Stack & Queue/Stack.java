class Stack {
	Node top;
	
	void push(int item) {
		Node t = new Node(item);
		t.next = top;
		top = t;
	}
	
	Node pop() {
		if(top != null) {
			Node item = top;
			top = top.next;
			return item;
		}
		return null;
	}
}