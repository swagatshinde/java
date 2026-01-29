//Write a Java program that accepts an integer from the user.
//If the user enters 0, the program should throw a user-defined exception named NumberZeroException with the message "Number is zero". Otherwise, if the number is valid, calculate and display its factorial.
import java.util.Scanner;

class NumberZeroException extends Exception{
	NumberZeroException(String msg){
		super(msg);
	}
}
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
	
	try 
		{
			if(n==0)
				throw new NumberZeroException("Number is zero");
			else
			{
				int fact=1;
				for(int i=1; i<=n; i++)
				{
					fact*=i;
					
				}
				System.out.println("factorial of "+n+"is"+fact);
			}
		}catch(NumberZeroException e)
		{
			System.out.println(e);
		}
		
	}

}

