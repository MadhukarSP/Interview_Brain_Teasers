import java.math.*;

class Answer {

	public static void main(String[] arg) {
		int max;
		if (arg.length > 0) {
			max = Integer.parseInt(arg[0]);
		} else {
			max = 20;
		}
		
		int finalPrime = 1;
		int count = 2;
		if(max >= 3) {			
			for(int i=1; count < max; i++ ) {
				if(isPrime(6*i-1)){
					count++;
					finalPrime = 6*i-1;
				}
				if(isPrime(6*i+1)){
					count++;
					finalPrime = 6*i+1;
				}
			}
		} else if(max == 1) {
			finalPrime = 2;
			count = 1;
		} else if(max == 2) {
			finalPrime = 3;
			count = 2;
		} 
		
		if(count == max)
			System.out.println("Prime number: " + finalPrime);
		else 
			System.out.println("Prime number: " + (finalPrime-2));
	}
	
	private static boolean isPrime(int num) {
		int sqrt = (int)Math.sqrt(num);
		System.out.println("Sqrt: "+ sqrt);
		for(int j=3; j<sqrt; j=j+2){
			if(num%j == 0)
				return false;
		}
		return true;
	}
}
