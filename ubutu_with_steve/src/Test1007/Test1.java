import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
    //inputStream의 객체를 인자로 받는다.
	int number;
	number = scanner.nextInt();
    //Blocked IO vs Non-Blocked IO
    //interaction 가능? 불가능? 함수 미완료시 멈춰져있거나(블럭드), 상관없이 가동 가능(NIO).
    //Synchronous IO vs Asynchronous IO
    //싱크(시간상 동기)가 맞아야 데이터 갖구와.. 싱크 안맞아두 갖구와
	System.out.println(number % 2 == 0 ? "짝수" : "홀수");
    //아래것도 같은데 위의 것이 훨 좋아. 중복제거~~
    //number % 2 == 0 ? System.out.println("짝수") : System.out.println("홀수");
    
	if (number % 2 == 0)
	    System.out.println("짝수");
	else
	    System.out.println("홀수");
    }
}

