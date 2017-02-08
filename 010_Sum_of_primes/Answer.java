class Answer {
	
	public static void main(String[] arg) {
		int max;
		
		if(arg.length > 0) {
			max = Integer.parseInt(arg[0]);
		} else {
			max = 20;
		}
		
		long sum = 5;
		long startTime = System.nanoTime();
		
		if(max == 2) {
			sum = 2;
		} else if(max == 3) {
			sum = 5;
		} else {
			sum = sumOfPrime(max);
		}
		System.out.println("Time taken: " + (System.nanoTime() - startTime));
		System.out.println("Sum of primes is " + sum);
	}
	
	private static long sumOfPrime(int max) {
		boolean isPrime; 
		long sum = 5;
		int sqrt;
		int j;
		for(int i=5; i< max; i=i+2) {
			isPrime = true; 
			sqrt = (int)Math.sqrt(i);
			for(j=3; j<=sqrt; j=j+2) {
				if(i%j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				sum = sum + i;					
			}
		}
		return sum;
	}
	
	private static long sumOfPrime2(int max) {
		boolean isPrime; 
		long sum = 5;
		int sqrt;
		for(int i=5; i< max; i=i+4) {
			isPrime = true; 
			sqrt = (int)Math.sqrt(i);
			for(int j=3; j<=sqrt; j=j+2) {
				if(i%j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				sum = sum + i;					
			}
			i=i+2;
			isPrime = true;
			sqrt = (int)Math.sqrt(i);
			for(int j=3; j<=sqrt; j=j+2) {
				if(i%j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				sum = sum + i;					
			}
		}
		return sum;
	}
}