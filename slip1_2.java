package Slip1;

import java.util.Scanner;

abstract class Staff{
	protected int id;
	protected String name;
	Staff(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
}
class OfficeStaff extends Staff{

	String Department;
	OfficeStaff(int id,String name,String Department)
	{
		super(id,name);
		this.Department=Department;
	}
	void display()
	{
		System.out.println("ID:"+super.id +" Name=" +super.name+" department="+Department);
	}
	
	
}

public class slip1_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of emp");
		int n=sc.nextInt();
		OfficeStaff s1[]=new OfficeStaff[n];
		for(int i=0; i<n; i++)
		{     System.out.println("employee : "+(i+1));
			System.out.println("enter id");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("enter name");
			String name=sc.nextLine();
			System.out.println("enter Dept");
			String Dept=sc.nextLine();
			
			s1[i]=new OfficeStaff(id,name,Dept);
		}
		for(OfficeStaff i :s1) {
			i.display();
			
		}
		
		
		

	}

}
