// Q.create the hash table that will maintain the mobile number and student name.Display the contact list. 
// created hashtable object.
//In Java, the put() method is used to store data in a Map.
// put is method of map.
//Purpose of put() method: It is used to insert or update a key-value pair in a Map.

import java.util.*;
public class setAd
{
public static void main(String[] args)
{
	Hashtable<String,String>hashtable=new Hashtable<String,String>();
	hashtable.put("om","7584759304");
	hashtable.put("sai","8504751312");
	hashtable.put("ram","9384219304");
	System.out.println("The contact list is : "+hashtable);	
}
}


