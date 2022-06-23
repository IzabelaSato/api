package apis;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(List.of(5,3,4,2,1));
	
		Comparator<Integer> comparator = (o1, o2) -> -o1.compareTo(o2);
		numbers.sort(comparator);
	
		System.out.println(numbers);
	}
}