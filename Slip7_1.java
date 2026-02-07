package Slip1;

import java.util.Scanner;

class Bank{
	float balance=10000;
	float widraw;
	float depo;
	void deposite()
	{ Scanner sc = new Scanner(System.in);
		System.out.println("enter amount to deposite");
		depo=sc.nextFloat();
		balance+=depo;
	}
	void widrawal()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter amount to deposite");
		widraw=sc.nextFloat();
		balance-=widraw;
	}
	void display()
	{
		System.out.println("Balance :"+balance);
	}
	
}
public class Slip7_1 {
	public static void main(String[] args) {
	
 Bank b=new Bank();
 b.deposite();
 b.widrawal();
 b.display();
	}
}
