package day1119.exercise_ArrayList;

// 하나의 학생 정보를 나타내는 Student 클래스에는 이름, 학과, 학번, 학점 평균을 저장하는 필드가 있다.
// 학생마다 Student 객체를 생성하고 4명의 학생 정보를 ArrayList<Student> 컬렉션에 저장한 후에, 
// ArrayList<Student>의 모든 학생정보를 출력하고 학생이름을 입력받아 
// 해당 학생의 학점 평균을 출력하는 프로그램을 작성하여라.

class Student {
	private String name;
	private String major;
	private String studentId;
	private double gpa; // 평점(grade point average)

	Student(String name, String major, String studentId, double gpa) {
		this.name = name;
		this.major = major;
		this.studentId = studentId;
		this.gpa = gpa;
	}
	
	String getName() {
		return name;
	}
	
	double getGpa() {
		return gpa;
	}
	
	void sPrint() {
		System.out.println("------------------------");
		System.out.println("이름: " + name);
		System.out.println("학과: " + major);
		System.out.println("학번: " + studentId);
		System.out.println("학점평균: " + gpa);
	}
}