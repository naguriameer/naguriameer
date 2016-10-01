import java.io.*;
import java.util.Scanner;
public class swapno
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a;
int b;
System.out.println("enter a b values");
a=s.nextInt();
b=s.nextInt();
System.out.println("before swaping\n"+a+"\t"+b);
a=a+b;

a=a-b;b=a-b;
System.out.println("AFTER swaping\n"+a+"\t"+b);


}
}
