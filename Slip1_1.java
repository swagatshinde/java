package Slip1;
//1, 2 ,3 ,5 ,6 ,7,8 ,9 ,10 ,11 ,12 ,13 ,14, 15 ,18 ,19 ,20,21 ,29
import java.util.Scanner;

public class Slip1_1 {

	public static void main(String[] args) {
//		System.out.println("enter total values");
//		Scanner sc = new Scanner(System.in);
		int n=args.length;
		int arr[]=new int[n];
//		System.out.println("enter elemets cmd");
		for(int i=0; i<n; i++)
		{
			arr[i]=Integer.parseInt(args[i]);
		}
		for(int i=0; i<n; i++)
		{
			if(isPrime(arr[i]))
			{
				System.out.println(arr[i]);
			}
		}
		


	}
	public static boolean isPrime(int n) {
		for(int i=2;i<=Math.sqrt(n); i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}

}
