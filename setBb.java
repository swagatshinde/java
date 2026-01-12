package Ass1;
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
