class solution2 {
	public String backAround(String s) {
		 
		 int len;
		 len = s.length();
		 char lc = s.charAt(len-1);
		 StringBuilder sb = new StringBuilder("");
		 sb.append(lc);
		 sb.append(s);
		 sb.append(lc);
		 
		 return sb.toString();
		 
	}
}
class Test17b
{
public static void main(String []ameer)
{
solution2 s=new solution2();
String str=s.backAround("Hello") ;
System.out.println(str);
}
}
