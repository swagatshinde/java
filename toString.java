// use of two string method
// It converts an object's data into readable text for printing.
//write a java program to create employee class and the elements of employee are(eid,name,desg,sal)

import java.util.Scanner;
public class Employee
{
	int eid;
	String name;
	String desg;
	float sal;
	void accept()
	{ Scanner sc = new Scanner(System.in);
		System.out.println("Enter details");
		eid=sc.nextInt();
		name=sc.next();
		desg=sc.next();
		sal=sc.nextFloat();
	}
	 @Override
	    public String toString() {
	        return "Employee [ID=" + eid + ", Name=" + name + 
	               ", Designation=" + desg + ", Salary=" + sal + "]";
	    }

public static void main(String[] args) {


	Employee e=new Employee();
	e.accept();
	System.out.println(e.toString());
	
}
}

