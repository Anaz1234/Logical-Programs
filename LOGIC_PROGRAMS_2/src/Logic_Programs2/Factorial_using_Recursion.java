package Logic_Programs2;

import java.util.Scanner;

public class Factorial_using_Recursion {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find the factorial");
		int number =sc.nextInt();
		
		int output=calfactorial(number);
		System.out.println(output);
	}
		public static int calfactorial(int n) {
			if(n==0) {
		   return 1;	
		}else {
			return n*calfactorial(n-1);		}
		
		}
}


