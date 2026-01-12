package Ass1;
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
