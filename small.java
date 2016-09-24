class Solution {
	public boolean sameLast(int a, int b) {
		if(a%10 == b%10)
			return true;
		
		return false;
	}
}
public class small{
	public static void main(String args[]) {
		Solution s1 = new Solution();
		
		if(s1.sameLast(25, 35))
			System.out.println("true");
		else
			System.out.println("false");
		if(s1.sameLast(21, 39))
			System.out.println("true");
		else
			System.out.println("false");
	}
}
