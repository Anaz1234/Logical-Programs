package Logic_Programs2;

import java.util.Scanner;

public class Find_largest_Number {

	public static void main(String[] args) {
		int [] array = {1000,22,11,33,44};
		
		int largest=array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]>largest) {
				largest=array[i];
			}
			
		}
System.out.println(largest);
	}

}
