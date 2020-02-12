package day1030.example;

public class realtionalOp {

	public static void main(String[] args) {
		System.out.println("3 >= 2 : " + (3 >= 2));
		System.out.println("3 <= 2 : " + (3 <= 2));
		System.out.println("7.0 == 7 : " + (7.0 == 7));
		System.out.println("7.0 != 7 : " + (7.0 != 7));
		// == 나 !=도 결국 비교연산자야!!!!~
		// 연산을 하면 자동 형변환(implicit conversion)이 일어난다!!
		// 그럼 double 7.0 과 int 7을 연산하니까 결과가 double이 된다!
		// 그래서 둘 다 double형이므로 true인것!!!!
	}

}
