package day1101.exercise;

public class TV {
	String company;
	int releasedYear;
	int displaySize;
	
	public TV(String company, int releasedYear, int displaySize) {
		this.company = company;
		this.releasedYear = releasedYear;
		this.displaySize = displaySize;
	}
	
	public void show() {
		System.out.printf("%s에서 만든 %d년형 %d인치 TV", company, releasedYear, displaySize);
	}
}
