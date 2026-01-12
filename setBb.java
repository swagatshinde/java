//Q.write a program to sort HashMap by keys and display the detail before sorting and after sorting.
//LinkedHash Map object is created.
//The entrySet() method returns a Set of all key-value pairs in a Map, allowing you to access both keys and values simultaneously during iteration.
//Inside the loop, getKey() gets the ID and getValue() gets the Name so you can print them together.

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class setBb 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> hm=new LinkedHashMap<>();
		hm.put(3,"mumbai");
		hm.put(1,"pune");
		hm.put(4,"nagar");
		hm.put(2,"sambhaji nagar");
		System.out.println("Before sorting the elements : ");
		for(Map.Entry<Integer,String>entry:hm.entrySet())
		{
			System.out.println(entry.getKey() +" : " + entry.getValue());
		}
		
		TreeMap<Integer,String>sortedMap=new TreeMap<>(hm);
		
		System.out.println("After sorting the elements : ");
		for(Map.Entry<Integer,String>entry:sortedMap.entrySet())
		{
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}	
	}
}

