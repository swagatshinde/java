package Ass1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class setBc
{
public static void main(String[] args)
{
HashMap <String,String>phoneBook=new HashMap<>();
try
{
BufferedReader br=new BufferedReader(new FileReader("contact.txt"));
String line;
while((line=br.readLine())!=null)
{
String parts[]=line.split("\\s+");
if(parts.length>=2)
{
phoneBook.put(parts[0], parts[1]);
phoneBook.put(parts[1], parts[0]);
}
}
br.close();
}
catch(IOException e)
{
System.out.println("Enter reading file.");
return;
}
Scanner sc=new Scanner(System.in);
System.out.println("Enter name or phone number : ");
String input=sc.nextLine().trim();
if(phoneBook.containsKey(input))
{
System.out.println("Result : "+phoneBook.get(input));
}
else
{
System.out.println("Result not found.");
}
sc.close();
}
}