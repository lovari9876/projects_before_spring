package day1030.exercise;
// 설계부터 하고서 그 다음 코딩하기!!!!
// 손 가는대로 하는 거 아니야...!!!
// 순서) 1. 요구사항 분석  2. 변수 정의
// => 변수 설정 ; 일단 국어, 수학, 영어, 총점, 평균, 평점 6개 선언하고!
// 메소드 뭐뭐 만들것인지 정하기!!!

public class Grade {
	int kor = 0;
	int math = 0;
	int eng = 0;
	int total = 0; 	
	double avg = 0.0; 
	String grade = null;
	
	public void setOperands(int kor, int math, int eng) {
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	
	public int sum() {
		return total = kor + math + eng;
	}
	
	public double avg( ) {
		return avg = total / 3.0;
	}
	
	public String grade() {
		if (avg >= 90) 
			grade = "수";
		else if (avg >= 80) 
			grade = "우";
		else if (avg >= 70) 
			grade = "미";
		else if (avg >= 60) 
			grade = "양";		
		else
			grade = "가";
		return grade;
	}
}	
