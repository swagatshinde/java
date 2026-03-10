
import java.util.*;

public class LinkedHashSetDemo
{
public static void main(String[] args) 
{
LinkedHashSet<String> set=new LinkedHashSet<String>();
set.add("Java");
set.add("ML");
set.add("Python");
set.add("AI");
Iterator<String>itr=set.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());	
}
}
}
