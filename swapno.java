import java.io.*;
import java.util.*;
import java.util.Scanner;
public class swapno
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String str1;
String str2;
System.out.println("enter a b values");
str1=s.next();
str2=s.next();
System.out.println("before swaping\n"+str1+"\t"+str2);


str1 = str1 + str2;
str2 = str1.substring(0, (str1.length() - str2.length()));
str1= str1.substring(str2.length());
System.out.println("AFTER swaping\n"+str1+"\t"+str2);


}
}
