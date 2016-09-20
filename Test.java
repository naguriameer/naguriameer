import java.io.*;
 class Solution1 {
		public int sumDigits(String s) {
		int sum=0;
		String cs=new String();
		for(int i=0; i < s.length(); i++) 
		{
			char c = s.charAt(i);
			
			if(Character. isDigit(c)) 
			{
				cs=Character.toString(c);
					
				sum = sum + Integer.parseInt(cs);
				
			}
		}
		return sum; 
		 
	}
	
}
class Test
{
	public static void main(String args[])
		{
			Solution1 sol=new Solution1();
			int i= sol.sumDigits("ameer74afsa");
			System.out.println(i);
		}
	}
