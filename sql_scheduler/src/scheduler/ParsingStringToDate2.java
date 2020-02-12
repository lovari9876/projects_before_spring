package scheduler;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;

//검사해서 데이터형이면 문자형을 데이터로 바꾸는 것!!
//+ 잘못 입력시 다시입력 무한 루프 고고
public class ParsingStringToDate2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		do {
			System.out.println("시간을 yyyy-MM-dd HH:mm:ss 으로 입력해주세요 ");
			String str = scan.nextLine();

			try {
				Date convertedDate = new Date(sdf.parse(str).getTime());
				sdf = new SimpleDateFormat("yyyy년 M월 d일 / H시 m분 s초");
				System.out.println(sdf.format(convertedDate));
				break;
			} catch (ParseException e) {
				System.out.println("잘못 입력");
				continue;
			}

		} while (true);
		scan.close();
		
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dayAndTime = new Date(sdf.parse(date).getTime());
		Calendar cal = Calendar.getInstance();
		cal.setTime(dayAndTime);
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		String ymd = Integer.toString(year-month-day);
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date onlyYMD = new Date(sdf.parse(ymd).getTime());
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setDate(1, onlyYMD);
		ResultSet rs = pstmt.executeQuery(sql);
	}
}
