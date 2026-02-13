package Ass2;
//Write a program to calculate the sum and average of an array of 1000 integers (generated randomly) using 10 threads.
//Each thread calculates the sum of 100 integers. Use these values to calculate average. [Use join method ]. 
import java.util.*;

class thread implements Runnable
{	
	Thread t;
	int i,no,sum;
	int a[]=new int[1000];
	thread(String s,int n)
	{
		Random rs=new Random();
		t=new Thread(this,s);
		no=n;
		int j=0;
		for(int i=1;i<=1000;i++)
		{
			a[j]=rs.nextInt(100);
			j++;
		}
		t.start();
	}
	@Override
	public void run()
	{
		for(i=0;i<100;i++)
		{
			sum=sum+a[no];
			no++;
		}
		System.out.println("Sum = "+sum);
		System.out.println("Avg "+sum/100);	
	}
 }

public class setBa 
{
	public static void main(String[] args) throws InterruptedException
	{
	thread t1=new thread("g",1);
	t1.t.join();
	thread t2=new thread("r",100);
	t2.t.join();
	thread t3=new thread("s",200);
	t3.t.join();
	thread t4=new thread("t",300);
	t4.t.join();
	thread t5=new thread("p",400);
	t5.t.join();
	thread t6=new thread("p",500);
	t6.t.join();
	thread t7=new thread("r",600);
	t7.t.join();
	thread t8=new thread("h",700);
	t8.t.join();
	thread t9=new thread("k",800);
	t9.t.join();
	thread t10=new thread("l",900);
	t10.t.join();
	int totalSum = t1.sum + t2.sum + t3.sum + t4.sum + t5.sum + 
            t6.sum + t7.sum + t8.sum + t9.sum + t10.sum;

System.out.println("Total Sum: " + totalSum);
System.out.println("Overall Average: " + (totalSum / 1000.0));
	}
}
