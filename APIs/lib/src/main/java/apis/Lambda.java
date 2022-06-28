package apis;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(List.of(5,3,4,2,1));
	
		Comparator<Integer> comparator = (o1, o2) -> -o1.compareTo(o2);
		numbers.sort(comparator);
	
		System.out.println(numbers);
		
		//__________________________________________________________________
		
		Operator op = (x, y) -> x * y;
		System.out.println(op.execute(5, 3));
		
		//__________________________________________________________________
	
		List<String> words = List.of("CARLOS", "JOSE", "JOAO", "JOANA", "MARIA");
		
		List <String> filtereWords = words
			.stream()
			.filter(w -> w.startsWith ("J"))
			//.map(w -> w.toLowerCase())
			.map(String::toLowerCase)
			//.forEach(w -> System.out.println(w));
			.collect(Collectors.toList());
		
		//System.out.println(filtereWords);
	//	filtereWords.stream().forEach(w -> System.out.println (w));
		filtereWords.forEach(System.out::println);

	}
}
