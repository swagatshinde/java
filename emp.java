//Question: Write a Java program to create an Employee class containing attributes id, name, deptname, and salary.
//Use a static variable to count the number of objects created and display this count along with employee details 
//every time an object is initialized using a parameterized constructor.
//Implement constructor chaining to handle default values.
import java.util.Scanner;
import java.io.*;
public class emp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String fl1="C:\\Users\\sai\\OneDrive\\Desktop\\abc.txt";
			String fl2="C:\\Users\\sai\\OneDrive\\Desktop\\pqr.txt";
			RandomAccessFile f1=new RandomAccessFile(fl1,"r");
			RandomAccessFile f2=new RandomAccessFile(fl2,"rw");
			long n=f1.length()-1;
			int ch;
			while(n>=0) {
				f1.seek(n);
				
				ch=f1.read();
				if(Character.isUpperCase(ch))
					ch=Character.toLowerCase(ch);
				else if(Character.isLowerCase(ch))
					ch=Character.toUpperCase(ch);
				f2.write(ch);
				n--;
			}
			
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}

