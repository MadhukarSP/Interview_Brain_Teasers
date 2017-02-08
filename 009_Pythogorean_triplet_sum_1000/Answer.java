import java.math.*;

class Answer {

	public static void main(String[] arg) {
		
		int sum = 1000;
		int a=0, b=0, c=0;
		
		long startTime = System.nanoTime();
		for(a=1; a<sum/3; a++) {
			for(b = a+1; b <sum/2;b++) {
				c = 1000 - b - a;
				
				if(a*a + b*b == c*c) {
					System.out.println("The product of "+ a +" * "+ b +" * "+ c +" = " + (a*b*c)); 
					System.out.println("Time taken: "+ (System.nanoTime() - startTime));
					break;
				}
			}
		}
		
		startTime = System.nanoTime();
		for ( b = 1; b < 1000; b += 1) {
			a = (int)Math.floor((500000 - 1000 * b) / (1000 - b)) ;
			c = 1000 - a - b;
			if ((a*a + b * b) == c*c) {
				System.out.println("The product of "+ a +" * "+ b +" * "+ c +" = " + (a*b*c)); 
				System.out.println("Time taken: "+ (System.nanoTime() - startTime));
				break;
			}
		}

		
	}
}
