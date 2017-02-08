import java.math.*;

class Answer {
	
	public static void main(String[] arg) {
		int number;
		if(arg.length > 0) {
			number = Integer.parseInt(arg[0]);
		} else {
			number = 10;
		}
		
		long sumOfSquare = 0l;
		
		for (int i=1; i <= number; i++) {
			sumOfSquare = sumOfSquare + (long)Math.pow(i,2);
		}
		
		long squareOfSum = (long)Math.pow(number*(number+1)/2, 2);
		
		System.out.println("The difference is " + (squareOfSum - sumOfSquare));
	}
}