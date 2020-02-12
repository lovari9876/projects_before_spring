package scheduler;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Time {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
//		
//		쌤이 하신 코드이다!
//		Calendar c = Calendar.getInstance();
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
//		System.out.println(sdf.format(c.getTime()));
//		c.set(Calendar.DAY_OF_YEAR, c.get(Calendar.DAY_OF_YEAR) + 3);
//		System.out.println(sdf.format(c.getTime()));
//		Date d = new Date(c.getTimeInMillis());
//				
//	   
//		
		System.out.println("날짜와 시간을 yyyy.MM.dd / HH:mm:ss 의 형식으로 입력하세요");
		String date = scan.nextLine();
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd / HH:mm:ss");
		try {
			Date d = sdf2.parse(date);
			Calendar cal = Calendar.getInstance();
			cal.setTime(d);
			System.out.println("연: "+cal.get(Calendar.YEAR));
			System.out.println("월: "+cal.get(Calendar.MONTH));
			System.out.println("일: "+cal.get(Calendar.DAY_OF_MONTH));
			
			System.out.println("시: "+cal.get(Calendar.HOUR));
			System.out.println("분: "+cal.get(Calendar.MINUTE));
			System.out.println("초: "+cal.get(Calendar.SECOND));
			
			scan.close();
		} catch (Exception e) {
			System.out.println("포맷이 맞지 않습니다.");
		}
		
		// "Mon Mar 14 16:02:37 GMT 2011"
		// "EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH
	}

}
