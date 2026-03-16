import java.util.Set;
import java.util.TreeSet;

class TreeSetDemo{
	public static void main(String args[])
	{
		Set ts=new TreeSet();
		ts.add("one");
		ts.add("four");
		ts.add("three");
		ts.add("two");
		ts.add("five");
		System.out.println("Members From TreeSet"+ts);
		
		Set ts1=new TreeSet();
		ts1.add(3);
		ts1.add(2);
		ts1.add(5);
		ts1.add(1);
		ts1.add(4);
		System.out.println("Members From TreeSet"+ts1);
		
		
		
	}
}
