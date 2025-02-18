package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
	public static void main(String[] args) {
		
		Supplier<String> supplier = new Supplier<String>() {
			
			@Override
			public String get() {
				return "hello";
			}
		};
 		Stream<String> strm = Stream.generate(supplier);
// 		strm.forEach(t -> System.out.println(t));
 		

 		Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
 		stream.forEach(p -> System.out.println(p));
 		// OR 
// 		stream.forEach(System.out::println);
 		
 		System.out.println("------------------------");
 		
 		Integer[] arr= {1,2,3,4,5,6,7,8,9};
 		Stream<Integer>  streamOfInt = Arrays.stream(arr);

 		streamOfInt
 				.filter(integer ->  integer > 5)
 				.forEach(num -> System.out.println(num));

 		System.out.println("------------------------");
 		
        List<String> names = Arrays.asList(
                "Reflection", "Collection", "Stream",
                "Structure", "Sorting", "State"
            );

            // forEach: Print each name
            System.out.println("\nforEach:");
            names.stream().forEach(System.out::println);

            // collect: Collect names starting with 'S' into a list
            List<String> sNames = names.stream()
                                       .filter(name -> name.startsWith("S"))
                                       .collect(Collectors.toList());
            System.out.println("\ncollect (names starting with 'S'):");
            sNames.forEach(System.out::println);

	}
} 