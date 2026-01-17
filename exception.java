// write a java program to raise an exception and calculate its factorial.
import java.util.Scanner;

class NumberZeroException extends Exception{
	NumberZeroException(String msg){
		super(msg);
	}
}
public class exception {

	public static void main(String[] args) {
		
 
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


