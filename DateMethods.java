import java.util.*;
import java.text.*;
public class DateMethods{
//Simple date format class used for formatting and parsing dates in a
public static void main(String args[])
{
	
Date date=new Date();
SimpleDateFormat ft=new SimpleDateFormat("yyyy-MM-dd 'current time::'hh:mm:ss a ");
System.out.println("current date::"+ft.format(date));

}
}
