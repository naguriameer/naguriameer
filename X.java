import java.util.*;
public class X{
public static void main(String [] args)
{
int i=0,n;
System.out.println("enter the no. of values");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
System.out.println("enter the values of array");

	int a[]=new int[n];
	a[i]=sc.nextInt();

for(i=0;i<=n;i++)
{
	a[i]=0;
}
n=a.length*2;
for(i=0;i<=n;i++)
{
System.out.println(a[i]);
}
}
}
