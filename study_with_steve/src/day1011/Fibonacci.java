package day1011;

public class Fibonacci {
	
	public static int fibonacci(int n) throws IndexOutOfBoundsException {
		if (n < 0) {
			throw new IndexOutOfBoundsException(String.format("Out of bounds : %d", n));
		}
		//재귀함수는 꼭 종료조건을 이렇게 기술해줘야 함
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return fibonacci(n-2) + fibonacci(n-1); 
			//재귀 호출: 어떤 함수가 자기 자신을 다시 호출하는것
			//for문 쓰지 않아도 반복이 가능
			//재귀호출 함수 작성시 주의점!!! 꼭 예외 처리해줄것
			//재귀호출은 지수승(2^(n-2))으로 연산을 해줘야 해서(어떤 항을 계산시 2승씩 더 계산해줘야해)
			//욘나뤼 느리다ㅠ
		}
		/*
		Switch(n) {
		case 0:
		case 1:
			return 1;
		default:
			return fibonacci(n-2) + fibonacci(n-1);
		}
		//if문을 이렇게 Switch로 써도 동일하다.
		*/
	}
	
	//memoization 기법
	//재귀 호출 보다 훨씬 더 빨라진다.
	public static long fibonacci2(int n) {
		if (n < 0 || n > 80)
			throw new IndexOutOfBoundsException(String.format("Out of bounds : %d", n));
		
		if (n == 0 || n == 1)
			return 1L;
		
		long[] array = new long[n];
		array[0] = 1;
		array[1] = 1;
		for (int i = 2; i < n; i++) {
			array[i] = array[i - 2] + array[i - 1];
		}
		return array[n-2] + array[n-1];
		//빠른 이유: 선형 알고리즘 이라서!!
	}
	
	//함수 작성의 예시
	//왜 함수 작성? 반복되는 것이 있다면 재사용성을 높이기 위해 함수로 작성해두어야 함. 
	public static boolean isAllowed(int height, int age) {
		return height >= 170 || age >= 20;
	}
		
	public static void main(String[] args) throws Exception {
		for (int i = 0; i <= 70; i++) {
			System.out.format("fibonacci2(%d) = %d\n", i, fibonacci2(i));
		}			
	}
	
}
