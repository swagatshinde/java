// Q.write a java program to accept names of 'n' cities,insert same into array list collection and display contents of same array list,also remove all these elements
// created arraylist object.
// // Purpose of add() method: Adds a single value to a group.
// using clear method all elements are remove.
  
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
public class setAa
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
ArrayList al=new ArrayList();
System.out.println("Enter how many cities : ");
int n=sc.nextInt();
System.out.println("Enter actual cities : ");
for(int i=0;i<n;i++)
{
String city=sc.next();
al.add(city);
}
System.out.println("cities are : "+al);
al.clear();
System.out.println("The cities Are clear : "+al);
}
}


