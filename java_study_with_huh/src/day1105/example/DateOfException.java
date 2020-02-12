package day1105.example;

import java.time.LocalDate;

public class DateOfException {
	static String date;
	
	static {
		LocalDate nDate = LocalDate.now();
		date = nDate.toString();		
	}
	
	public static void main(String[] args) {
		System.out.println(date);

	}

}
