package day1030.exercise;

public class GradeByTeacher {
	public static void main(String[] args) {
		int kor = 60;
		int math = 70;
		int eng = 100;
		int total;
		double avg;
		char grade;

		total =kor + math + eng;
		avg=total/3.0;

		if(avg>=90) {
			grade = '수';
		}else if(avg>=80) {
			grade = '우';
		}else if(avg>=70) {
			grade = '미';
		}else if(avg>=60) {
			grade = '양';
		}else {
			grade = '가';
		}
	
		System.out.println("당신 의 성적은 " + "\'" + grade + "\'" + "입니다.");
	}
}
