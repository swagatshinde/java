// Q.write a java program to read 'n' nams of your friend,store it into linked list,also display contents of same.
// created linkedlist object.
// // Purpose of add() method: Adds a single value to a group.

import java.util.*;
import java.util.Scanner;
import java.util.LinkedList;
public class setAb
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
LinkedList<String> al=new LinkedList<String>();
System.out.println(" how many friends : ");
int n=sc.nextInt();
System.out.println("Enter friend names : ");
for(int i=0;i<n;i++)
{
String f=sc.next();
al.add(f);
}
System.out.println("Friend names are : "+al);
}
}


