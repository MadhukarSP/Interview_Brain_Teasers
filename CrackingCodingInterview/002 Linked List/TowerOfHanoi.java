class TowerOfHanoi {

	public static void main(String[] arg) {
		TowerOfHanoi t = new TowerOfHanoi();
		t.move(2, "A", "B", "C");
	}
	
	void move(int n, String start, String auxillary. String end) {
		if(n == 1) {
			System.out.println(start + " -> " + end);
		}
		
		move(n-1, start, end, auxillary);
		System.out.println(start + " -> " + end);
		move(n-1, auxillary, start, end);
	}	
}