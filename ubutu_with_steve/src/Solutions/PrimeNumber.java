import java.util.Scanner;
//스캐너 클래스를 이용한다.
public class PrimeNumber {
    //퍼블릭 클래스 PrimeNumber를 기술한다.
    public static void main(String[] args) throws Exception {
    //메인 메소드에서 시작한다.

	//1부터 100사이의 소수 구하기.
	//소수는 1과 자기 자신만을 약수로 가지는 수
	//어떤 수 n이 다른 소수로 나누어 지지 않는 다면 소수다.
    
        int[] numbers = new int[100];
	//int형 배열인 numbers를 선언하면서, 동시에 index를 100이라 지정하여
	//배열의 길이가 100임을 알려주고있다. 초기화한 상태
	//1부터 100까지의 소수를 구할것이기에 배열 크기를 100으로 한 것.
	int count= 0;
	//int형 변수 count의 값을 0이라고 지정하여 초기화하고 있다.
	boolean isPrime;
	//boolean형 변수 isPrime을 선언하고 있다.
	//소수냐 아니냐는 참/거짓의 문제이기 때문에 boolean사용

	for (int n = 2; n <= 100; n++) {
	    //n이라는 int형 변수를 2부터 시작하게 하여 초기화하고 있다. 
	    //소수는 2부터 시작하기 때문.
	    //n의 종료조건은 '100이하'이다. n++하여 1씩 커진다.
	    isPrime = true;
	    //for문의 실행블럭이다. isPrime에 true를 대입하는 것으로 시작.
	    for (int i = 0; i < count; i++) {
		//inner for문이다. int형 변수 i에 0을 초기화하는 것으로 시작.
		//i는 count보다 작을 때가 종료조건이고, 1씩 커진다.
		if (n % numbers[i] == 0) {
		    //n나누기 
		    isPrime = false;
		    break;
		}
	    }

	    if (isPrime) {
		numbers[count] = n;
		count++;
	    }
       	}
	for (int i = 0; i < count; i++) {
	System.out.format("%d is a prime number\n", numbers[i]);
	}
    }

}
