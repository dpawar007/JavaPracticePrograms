package test;

public class PrintzerotoHundreadOddAddition {

	public static void main(String[] args) {
		int sum= 0;
		for (int i = 1; i<=100; i++) {
			if(i % 2 != 0) {
				sum = sum+i;
			}		
		}	System.out.println("Total Sum of 1 to 100 Odd Number  = "+sum);
	}

}
