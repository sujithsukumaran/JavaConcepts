package coreJava;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d = new Date();
		System.out.println(d.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("M/dd/YYYY");
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getWeekYear());
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));

	}

}
