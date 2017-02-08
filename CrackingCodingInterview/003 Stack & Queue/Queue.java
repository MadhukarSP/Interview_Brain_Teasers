class Queue {
	Node front, back;
	
	void enqueue(Object Item) {
		if(front == null) {
			back = new Node(item);
			front = back;
		} else {
			back.next = new Node(item);
			back = back.next;
		}
	}
	
	Node dequeue() {
		if(front != null) {
			Object item = front.data;
			front = front.next;
			return item;
		}
		return null;
	}
}