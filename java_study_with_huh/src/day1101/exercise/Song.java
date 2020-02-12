package day1101.exercise;

/*
노래 한 곡을 나타내는 Song 클래스 작성! 
- Song의 필드들: title, artist, year, country
- 생성자 2개: 기본 생성자와 매개변수로 모든 필드를 초기화하는 생성자
- 메소드: 노래정보 출력하는 show()
- main(): 1978년, 스웨덴 국적의 ABBA가 부른 "Dancing Queen"을 
		song 객체로 생성하고 show() 이용하여 노래의 정보를 다음과 같이
		출력하라.
		=> 출력: "1978년 스웨덴 국적의 ABBA가 부른 Dancing Queen"
*/

class Song {
	String title;
	String artist;
	int year;
	String country;	
		
	Song() {
		
	}
	
	Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	void show() {
		System.out.printf("%d년 %s 국적의 %s가 부른 %s", year, country, artist, title);
	}
	
	
}











