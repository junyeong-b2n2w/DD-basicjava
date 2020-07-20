package h_api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		
		Date today = new Date();
		
		System.out.println(today);
		
		SimpleDateFormat sdf1  = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2  = new SimpleDateFormat("HH:mm:ss.SSS");
		SimpleDateFormat sdf3  = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat sdf4  = new SimpleDateFormat("yy-MM-dd(E) hh:mm:ss a");

		
		System.out.println(sdf1.format(today));
		System.out.println(sdf2.format(today));
		System.out.println(sdf3.format(today));
		System.out.println(sdf4.format(today));
		
//		Mon Jul 20 09:18:21 KST 2020
//		2020-07-20
//		09:18:21.406
//		2020-07-20 09:18:21
//		20-07-20(월) 09:18:21 오전
		
		
		String str = "1987년 05월 01일";
		SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy년 MM월 dd일");
		try {
			Date dateStr = sdf5.parse(str);
			System.out.println(dateStr);
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
	
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(new Date());
		cal.set(2020, 6, 19); // 2020 07 19 (월은 0부터시작)
		
		System.out.println(cal.getTime());
		
		cal.add(Calendar.YEAR, 50);
		System.out.println(cal.getTime());
		cal.add(Calendar.MONTH, -10);
		
		System.out.println(sdf3.format(cal.getTime()));
		
		cal.add(Calendar.MONTH, -10);
		cal.add(Calendar.DAY_OF_MONTH, -10);
		cal.add(Calendar.HOUR, -10);
		cal.add(Calendar.MINUTE, -10);
		cal.add(Calendar.SECOND, -10);
		
		
		System.out.println(sdf3.format(cal.getTime()));
		
	}
	
	
	

}
