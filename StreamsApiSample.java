import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsApiSample {

	public static void main(String[] args) {

		// to find minimum value
		/*int[] num = {10,4,23,54,2,45,1,90};
		
		IntStream.of(num)
		          .min()
		          .ifPresent(System.out::println);
		*/
      // to find distinct numbers
      int[] num = {10,4,10,90,2,4,1,90};
		
		IntStream.of(num)
		          .distinct()
		          .sorted()
		          .limit(3)
		          //.boxed()
		          .forEach(System.out::println);
		
		
		//streams for objects
		List<Employee> empList = getAllEmployees();
		
		List<Employee> names = empList.stream()
		                     .limit(2)
		                     .collect(Collectors.toList());
		
	}
	
	public static List<Employee> getAllEmployees(){
		
		List<Employee> elist = new ArrayList<Employee>();
		elist.add((Employee) Arrays.asList(101,"abc","science","bangalore"));
		elist.add((Employee) Arrays.asList(102,"xyz","history","mangalore"));
		
		return elist;
		
	}

}

