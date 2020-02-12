package day1119.exercise_ArrayList;

import java.util.*;

// 스캐너 오류 없애려면 메인에서 스캐너 객체 하나만 만들고
// 호출할 메소드의 파라미터로 스캐너 넣을 것

class ArrayListOfStudent {
	List<Student> sList = new ArrayList<>();
	
	void printArrayListOfStudent(Scanner sc) {
		
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");

		while (sList.size() < 4) {
			System.out.print(">> ");
			String str = sc.nextLine();
			StringTokenizer st = new StringTokenizer(str, ","); // 구별자 지정
			String name = st.nextToken().trim();
			String major = st.nextToken().trim();
			String studentId = st.nextToken().trim();
			double gpa = Double.parseDouble(st.nextToken().trim());

			sList.add(new Student(name, major, studentId, gpa));
		}

		for (Student s : sList)
			s.sPrint();
		System.out.println("------------------------");
	}

	void gpaOfStudent(List<Student> sList, Scanner sc) {
		System.out.print("학생 이름 >> ");		
		String name = sc.next();
		for (int i = 0; i < sList.size(); i++) {
			if (name.equals(sList.get(i).getName())) {
				System.out.printf("%s의 학점평균은 %f\n", name, sList.get(i).getGpa());
			}
		}
		System.out.println("종료합니다.");
	}
}
