// Q.write a java program to create a new tree set,add some colors (string) and print out the tree set. 
// created treeset object.
// Purpose of add() method: Adds a single value to a group.
// add is a method of collection

import java.util.Set;
import java.util.TreeSet;
public class setAc
{
public static void main(String[] args)
{
	Set <String>ts=new TreeSet<>();
	ts.add("Red");
	ts.add("Pink");
	ts.add("Yellow");
	ts.add("Blue");
	System.out.println("The tree set is : "+ts);
}
}


