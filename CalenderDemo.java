import java.util.*;
public class CalenderDemo{
	
	
		
	
public static void main(String rakesh[])
		{
			String  months[]={"jan","Feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
			

	GregorianCalendar gcalender=new GregorianCalendar();
	System.out.print("Date:");
	System.out.print(""+gcalender.get(Calendar.DATE)+"-");
	System.out.print(months[gcalender.get(Calendar.MONTH)]+"-");
	System.out.print(gcalender.get(Calendar.YEAR)+"\n");
	
	System.out.print("Time::");
	System.out.print(gcalender.get(Calendar.HOUR)+"-");
	System.out.print(gcalender.get(Calendar.MINUTE)+"-");
	System.out.print(gcalender.get(Calendar.SECOND)+"\n");
if(gcalender.isLeapYear(gcalender.get(Calendar.YEAR)))
System.out.println("leap year");
	else
	System.out.println("not a leap year");
	}
	
	
	}
