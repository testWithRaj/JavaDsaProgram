package collections_practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// List is an interface
		List<String> names = new ArrayList<>();
		names.add("Raj");
		names.add("Rohan");
		names.add("Aarti");
		names.add("Raj");
		
		System.out.println(names);
		
		System.out.println("total names a"
				+ "re :" + names.size());
		
		System.out.println("First Name is :" + names.get(0));
		//Remove the data
		
		names.remove(0);
		System.out.println(names);
		
		names.add("Aaradhaya");
		System.out.println(names);
		
		names.set(0, "Papa");
		
		System.out.println(names);
		
		
		//Iterate through the array list
		
		for(String name:names)
		{
			System.out.println(name);
		}
		
		//using for loop
		
		for(int i=0;i<names.size();i++)
		{
			System.out.println(names.get(i));
		}
		
		
		Collections.sort(names);
		
		System.out.println(names);
		
		//validate that Raj is in the list
		
	if(	names.contains("Raj"))
	{
		System.out.println("Present");
	}
		
	else {
		System.out.println("Not Present");
	}

	}

}
