package practicle;
import java.util.Scanner;

 class prime
{
	public static void main(String[] args)
	{
		int i,j,c=0,k=0,cnt=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		System.out.println("enter actual number : ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("\n prime m=numbers ");
		for(i=0;i<n;i++)
		{
			c=0;
			for(j=2;j<a[i];j++)
			{
				if(a[i]%j==0)
				{
					c++;
				}
			}
			if(c==0)
			{
				System.out.println(a[i]+" ");
			}
		}
	}
	
}

		
