class Answer {
	
	public static void main(String[] arg) {
		long n = 190; //600851475143l;		
		long factor = 2;
		long lastFactor = 1;
		
		while (n>1) {
			if(n%factor == 0) {
				lastFactor = factor;
				n = n / factor;
				while(n%factor == 0) {
					n = n / factor;
				}
			}
			factor = factor + 1;
		}
		
		System.out.println("Largest factor: " + lastFactor);
	}
}