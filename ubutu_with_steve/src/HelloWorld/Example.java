import java.util.Scanner;

class Example {

    public static void main(String[] args) {
	/*
	try {
	  Scanner sc = null;
	    //예외, 오류가 날 껏 깥으면 널 처리 고고

	*/
	Scanner scanner = new Scanner(System.in);
	int kor, eng, math;	
	
	System.out.print("국어 점수를 입력하세요.: ");
	kor = scanner.nextInt();

	System.out.print("영어 점수를 입력하세요.: ");
	eng = scanner.nextInt();

	System.out.print("수학 점수를 입력하세요.: ");
	math = scanner.nextInt();

	int sum = kor + eng + math;
	double avg = sum / 3.0;    

	System.out.println("총점은: " + sum);
	System.out.println("평균은: " + avg);

	int avg2 = (int)(sum / 3.0 * 100 + 0.5);
	System.out.println("평균2는: " + avg2 / 100.0);
	//밑의 포맷함수 몰랐을때 위처럼 int로 바꾸고 소수점 자르고, 다시 double로 바꿔서
	//소수점 밑 2자리까지 나타내는 힘든 방법을 택할 수 있다.
	System.out.format("평균3은: %.2f\n", sum / 3.0);

	//단순히 잔머리 굴려서 더블을 인트로 바꾸는 방법
	//깔끔하게 하고 싶으면 함수 배우쇼

    }
}





