// Q: Write a Java program to demonstrate Single Level Inheritance.
// Create a base class College with members cno, cname, and caddr.
// Create a derived class Department with members dno and dname.
// Implement methods to accept and display details for both classes using the derived class object.
//Department.java

import java.util.Scanner;

class Department extends College {
 private int dno;
 private String dname;

 public void acceptDetails() {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter College No: ");
     cno = sc.nextInt();
     sc.nextLine(); // consume newline

     System.out.print("Enter College Name: ");
     cname = sc.nextLine();

     System.out.print("Enter College Address: ");
     caddr = sc.nextLine();

     System.out.print("Enter Department No: ");
     dno = sc.nextInt();
     sc.nextLine();

     System.out.print("Enter Department Name: ");
     dname = sc.nextLine();
 }

 public void displayDetails() {
     displayCollegeDetails();
     System.out.println("--- Department Details ---");
     System.out.println("Department No: " + dno);
     System.out.println("Department Name: " + dname);
 }
}


public class department {

	public static void main(String[] args) 
	{
		 Department dept = new Department();
	        dept.acceptDetails();
	        dept.displayDetails();
	}

}
//College.java
class College {
 protected int cno;
 protected String cname;
 protected String caddr;

 public void setCollegeDetails(int cno, String cname, String caddr) {
     this.cno = cno;
     this.cname = cname;
     this.caddr = caddr;
 }

 public void displayCollegeDetails() {
     System.out.println("\n--- College Details ---");
     System.out.println("College No: " + cno);
     System.out.println("College Name: " + cname);
     System.out.println("College Address: " + caddr);
 }
}



