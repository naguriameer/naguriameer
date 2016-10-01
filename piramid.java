import java.util.*;
class Piramid
{
	public static void main(String pavan[])
	{
		int n,a;
		System.out.println("enter number of levels");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int x[]=new int[n];
		int b[]=new int[n];
		x[0]=1;
		for(int k=n;k>=1;k--)
		{
			System.out.print(" ");
		}
		System.out.print(" "+x[0]+"\n");
		for(int j=1;j<n;j++)
		{
			for(int k=n-j;k>0;k--)
			{
				System.out.print(" ");
			}
			for(int i=0;i<j;i++)
			{
				System.out.print(" "+x[i]+"");
				if(i!=j-1)
				b[i+1]=x[i]+x[i+1];
				else
				b[i+1]=x[i]+x[0];
			}
			System.out.print(" "+x[0]+"\n");
			for(int i=0;i<j;i++)
			{
				x[i+1]=b[i+1];
			}
		}
	}
}
