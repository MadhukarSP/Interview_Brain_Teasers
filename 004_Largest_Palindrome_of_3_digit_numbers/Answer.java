class Answer {
	private static boolean isPalindrome(String str) {
		return str.equals(new StringBuffer(str).reverse().toString());
	}

    public static void main(String[] args)
    {		
		int max = 1001;
		int num1=10, num2=10;
		long startTime = System.nanoTime();
		
		for ( int i = 99 ; i >= 10 ; i--) {
			for (int j = 99 ; j >= i ; j-- ) {             
				int p = i * j;
				if ( p > max && isPalindrome(String.valueOf(p))) {
					max = p;
					num1 = i;
					num2 = j;
				}
			}
		}    
		
		System.out.printf("%d * %d = %d", num1, num2, max);
		System.out.println("\nTime taken: " + (long)(System.nanoTime() - startTime));		
    }
}