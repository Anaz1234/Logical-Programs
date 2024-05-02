package Logic_Programs2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Remove_Dupelicates_elements8 {

	public static void main(String[] args) {
		List<Integer> l1=Arrays.asList(11,22,11,4,2,11,22,2,2,6,5,4,3);
		System.out.println(l1);
		List<Integer> Result=l1.stream().distinct().collect(Collectors.toList());
		System.out.println(Result);
		

	}

}
