import java.io.*;
import java.util.Scanner;
class desc
{
public static void main(String agrs[])
{
	int n;
	String temp;
	  Scanner s1 = new Scanner(System.in);
		System.out.println("enter no of names");
		n=s1.nextInt();

        String names[] = new String[n];

          
		System.out.println("enter the names:");

			for(int i=0;i<n;i++)
				{
					names[i]=s1.next();
				}	
					for(int i=0;i<n;i++)
						{
							for(int j=i+1;j<n;j++)
								{
									
									if (names[j].compareTo(names[i])>0) 

									{
										temp=names[i];
										names[i]=names[j];
										names[j]=temp;
										
							
									}
								}
							}
							
					System.out.println("AFTER SORTING NAMES ARE:");
					for(int i=0;i<n;i++)
					{
						System.out.println(names[i]);
					}
								
}
}

