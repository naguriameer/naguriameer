class solution1 {
	
	public String missingChar(String s, int n) {
		String str = new String("");
		str = s.substring(0,n); 
		str += s.substring(n+1);
		return str;	
	}
}
class Test17a
{
public static void main(String []ameer)
{
solution1 s=new solution1();
String str=s.missingChar("Java",2);
System.out.println(str);
}
}
