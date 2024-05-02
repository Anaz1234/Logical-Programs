package Logic_Programs2;

public class SumOF_array {

	public static void main(String[] args) {
		int number=110,reminder,sum=0;
		 while(number<0) {
			 reminder=number%10;
			 sum=sum+reminder*10;
			 
			 number=number/10;
		 }
		 System.out.println(sum);

	}

}
