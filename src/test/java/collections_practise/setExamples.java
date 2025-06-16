package collections_practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class setExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> numbers = new HashSet<>();
		numbers.add(10);
		numbers.add(23);
		numbers.add(89);
		numbers.add(25);
		
		System.out.println(numbers);
		
	//	Try adding 25 again
		
		numbers.add(25);
		System.out.println(numbers);
		
		//its just ignored above line
		
		//set cannot be directly sort
		//we need to convert set into list then we can sort
		
		
		//convert set into list
		List<Integer> numberlist = new ArrayList<>(numbers);
		Collections.sort(numberlist);
		
		System.out.println(numberlist);
		
		

	}

}
