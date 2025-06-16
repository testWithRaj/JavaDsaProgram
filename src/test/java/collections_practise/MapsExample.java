package collections_practise;

import java.util.HashMap;
import java.util.Map;

public class MapsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> ministers= new HashMap<>();
		ministers.put("FM", "Niramala");
		ministers.put("HM", "Amit");
		ministers.put("PM", "Modi");
		
		//here key should be unique, but values can be duplicate
		//insertion order is not maintained
		
		System.out.println(ministers);
		//fetch the data from Map
		System.out.println("FM is "+ministers.get("FM"));
		ministers.remove("HM");
		
		System.out.println(ministers);
		
		//update the data in map
		
		ministers.put("FM", "new FM name");
		System.out.println(ministers);
		
		//Print all the keys in Map
		System.out.println(ministers.keySet()); //keySet
		
		if(ministers.keySet().contains("HM"))
			{
			
			System.out.println("HM is present");
		
			}
		
		else {
			
			System.out.println("HM is not present");
			
		}
		
		
		//iterate through the map
		
		ministers.put("HM", "AMIT");
		
		for(String minister:ministers.keySet())
		{
			System.out.println("Mi");
		}
		

	}

}
