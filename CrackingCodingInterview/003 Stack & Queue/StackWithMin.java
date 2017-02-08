class StackWithMin {
	Node top;
	Stack s;
	
	public StackWithMin() {
		s = new Stack();
	}
	
	public static void main(String[] arg) {
		StackWithMin stack = new StackWithMin();
		stack.push(20);
		stack.push(15);
		stack.push(30);
		System.out.println("Min value is " + stack.min());
		stack.push(10);
		System.out.println("Min value is " + stack.min());
		stack.push(40);
		stack.push(5);
		System.out.println("Min value is " + stack.min());
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println("Min value is " + stack.min());
	}
	
	Node pop() {
		if(top != null) {
			Node item = top;
			top = top.next;
			if(item.data == s.top.data) {
				s.pop();
			}
			return item;
		} 
		return null;
	}
	
	void push(int item) {
		Node t = new Node(item);
		t.next = top;
		top = t;
		if(s.top == null) {
			s.push(item);
		} else if(item < s.top.data) {
			s.push(item);
		}
	}
	
	Object min() {
		return s.top.data;
	} 
}