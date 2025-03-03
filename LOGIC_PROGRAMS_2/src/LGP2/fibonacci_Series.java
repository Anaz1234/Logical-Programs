package LGP2;

import java.util.Scanner;

public class fibonacci_Series {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the No.Of terms");
		int count=sc.nextInt();
		
		int first=0,second=1;
		
		for(int i=0;i<=count;i++) {
			System.out.println(first);
			int nextTerm=first+second;
			first=second;
			second=nextTerm;
			
		}

	}

}
