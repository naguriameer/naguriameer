import java.io.*;
import java.util.Scanner;
public class string
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String str;
System.out.println("Enter the string");
str=s.nextLine(); 
System.out.println("string is"+str);
int length=str.length();
System.out.println("String length is"+length);
}
}
