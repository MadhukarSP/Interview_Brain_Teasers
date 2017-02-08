import java.util.*;
import java.math.*;

class Answer {
	
	public static void main(String[] arg) {
		int max;
		if (arg.length > 0) {
			max = Integer.parseInt(arg[0]);
		} else {
			max = 20;
		}
				
		List<Integer> primes = findPrimes(max);	
		List<Integer> power = new ArrayList<Integer>();
		
		long lcm = 1;
		
		for(int i=0; i< primes.size(); i++) {
			power.add((int)Math.floor(Math.log(max) / Math.log(primes.get(i))));
			double d = Math.pow(primes.get(i), power.get(i));
			lcm = lcm * (long)d;
		}
		
		System.out.println("The LCM: " + lcm);		
	}
	
	private static List<Integer> findPrimes(int num) {
		List<Integer> primes = new ArrayList<Integer>();
		
		if(num >= 4) {
			primes.add(2);
			primes.add(3);
			boolean isPrime;
			for(int i=5; i<=num; i=i+2) {
				isPrime = true;
				for(int j=3; j<i; j=j+2){
					if(i%j == 0) {
						isPrime = false;
						break;
					}
				}
				if(isPrime) {
					primes.add(i);
				}
			}
		} else if(num == 2) {
			primes.add(2);
		} else if(num == 3) {
			primes.add(2);
			primes.add(3);
		}
		return primes;
	}
}
