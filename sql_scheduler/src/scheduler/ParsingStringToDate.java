package scheduler;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;

//검사해서 데이터형이면 문자형을 데이터로 바꾸는 것!!
public class ParsingStringToDate {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("시간을 yyyy-MM-dd HH:mm:ss 으로 입력해주세요 ");
		String str = scan.nextLine();

		try {
			Date convertedDate = new Date(sdf.parse(str).getTime());
			sdf = new SimpleDateFormat("yyyy년 M월 d일 H시 m분 s초");
			System.out.println(sdf.format(convertedDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		scan.close();
	}
}
