class Answer {
	
	public static void main(String[] arg) {
		int[] fibSeries = new int[3];
		long startTime = System.currentTimeMillis();
		fibSeries[0] = 1;
		fibSeries[1] = 2;
		fibSeries[2] = 3;
		
		int index = 0;
		long sumOfEvenNum = 2;
		long previousNum = 1;
		
		while(sumOfEvenNum < 4000000) {
			fibSeries[index] = fibSeries[(index+1)%3] + fibSeries[(index+2)%3];
			if(index == 1)
				sumOfEvenNum = sumOfEvenNum + fibSeries[index];
			index = (index+1) % 3;
		}
		long timeTake = System.currentTimeMillis() - startTime;
		System.out.println("Sum of even numbers till 4 million: " + sumOfEvenNum);
		System.out.println("Time taken: " + timeTake);
		
		startTime = System.nanoTime();
		int sum  = 0;
		int f_n0 = 0;
		int f_n1 = 1;
		int f_n2;

		while ((f_n2 = f_n0 + f_n1) < 4000000)
		{
			if (f_n2 % 2 == 0)
				sum += f_n2;
			f_n0 = f_n1;
			f_n1 = f_n2;
		}
		timeTake = System.nanoTime() - startTime;
		System.out.println("Sum of even numbers till 4 million: " + sum);
		System.out.println("Time taken: " + timeTake);
		
		startTime = System.nanoTime();
		sum=0;
		int a=1;
		int b=1;
		int c=a+b;
		while(c<4000000) {
			sum=sum+c;
			a=b+c;
			b=c+a;
			c=a+b;
		}
		timeTake = System.nanoTime() - startTime;
		System.out.println("Sum of even numbers below 4 million: " + sum + ", last num: "+ b);
		System.out.println("Time taken: " + timeTake);
	}
}