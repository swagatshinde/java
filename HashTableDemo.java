
import java.util.*;

public class HashTableDemo 
{
	public static void main(String[] args) 
	{
		Hashtable<String,Integer>hashtable=new Hashtable<String,Integer>();
		hashtable.put("a", 100);
		hashtable.put("b", 200);	
		hashtable.put("c", 300);
		hashtable.put("d", 400);
		System.out.println(hashtable);
		Boolean val =hashtable.contains(400);
        System.out.println("is 400 present : "+val);
        val =hashtable.containsKey("d");
    	System.out.println("is d present: "+val);
	}
}
