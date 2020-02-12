package scheduler;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Time2 {
	public static void main(String[] args) throws ParseException {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
		cal.setTime(sdf.parse("Mon Mar 14 16:02:37 GMT 2011"));
		System.out.println(cal);
		
	}
	
	private static String whenToCal(Scanner scan) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		do {
			System.out.println("시간을 yyyy-MM-dd HH:mm:ss 으로 입력해주세요 ");
			System.out.println("> ");
			String str = scan.nextLine();
			try {
				Date dayAndTime = new Date(sdf.parse(str).getTime());
				sdf = new SimpleDateFormat("yyyy년 M월 d일 / H시 m분 s초");
				// String dt = sdf.format(dayAndTime);

				ArrayList<Calendar> seperatedDate = new ArrayList<>();
				Calendar cal = Calendar.getInstance();
				seperatedDate.add(cal);
				cal.setTime(dayAndTime);
				cal.get(Calendar.YEAR);
				cal.get(Calendar.MONTH);
				cal.get(Calendar.DAY_OF_MONTH);

				cal.get(Calendar.HOUR);
				cal.get(Calendar.MINUTE);
				cal.get(Calendar.SECOND);

			} catch (ParseException e) {
				System.out.println("잘못 입력하셨습니다. ");
				continue;
			}

		} while (true);

	}
}
