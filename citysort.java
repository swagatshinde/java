
import java.util.Arrays;
import java.util.Scanner;

public class citysort {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		String city []=new String[n];
		System.out.println("enter "+n+"cities");
		for(int i=0; i<n; i++)
		{
			city[i]=sc.next();
		}
		Arrays.sort(city);
		System.out.println("cities in sorted order");
		for(String a:city)
			System.out.println(a);
		// TODO Auto-generated method stub

	}

}

