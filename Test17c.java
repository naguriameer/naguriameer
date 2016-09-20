class solution3 {
	int count = 0;
	String str = new String();
	public boolean containE(String s) {
		this.str = s;
		StringBuilder sb = new StringBuilder(str);
		
		for(int i=0; i<sb.length(); i++)
		{
			if(sb.charAt(i) == 'e')
				count++;
		}
		
		if(count >= 1 && count <=3)
			return true;
		else 
			return false;
		
	}
}
 public class Test17c
{
public static void main(String ameer[])
{
solution3 s=new solution3();

System.out.println(s.containE("Hello"));
System.out.println(s.containE("Helloeee"));
System.out.println(s.containE("world"));
}
}

    
