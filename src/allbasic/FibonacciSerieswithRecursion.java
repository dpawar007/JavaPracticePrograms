package allbasic;

import java.util.Scanner;

public class FibonacciSerieswithRecursion {
	static int n1 = 0, n2 = 1, n3 = 0;	
	static void fiboseries(int fn) {			 
		 if(fn>0) {
			 n3=n1+n2;
			 System.out.print(" "+n3);
			 n1=n2;
			 n2=n3;
			 fiboseries(fn-1);
		 }
	}
	public static void main(String[] args) {		
		System.out.println("enter the fibo number");
		Scanner obj = new Scanner(System.in);		
		int fnum= obj.nextInt();
		System.out.print(n1+" "+n2);
		fiboseries(fnum-2);
	}

}
