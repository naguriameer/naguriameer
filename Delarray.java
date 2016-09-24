import java.io.*;
import java.util.Scanner;
public class Delarray
{
public static void main(String args[])throws IOException
{
//StringBuffer s=new StringBuffer("abcd");
//s.delete(1,3);
int[] a={2,3,4,5,6,7,554,454};
Scanner ss=new Scanner(System.in);
System.out.println("enter position");
int pos=ss.nextInt();
for(int i=0;i<a.length;i++){
    if(pos!=i)
    System.out.println("\t"+a[i]);
}
}
}
