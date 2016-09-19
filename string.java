import java.io.*;
class Solution1 {
	public static void main(String []args)
	public String missingChar(String s, int n) {
		String str = new String("");
		str = s.substring(0,n); 
		str += s.substring(n+1);
		return str;	
	}
}

   

