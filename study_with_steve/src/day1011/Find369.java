package day1011;
//셤문제이다
//1~100까지 숫자중 369게임 출력하는 코드 짜기

public class Find369 {
	//자릿수를 알 수 없는 큰 숫자에서 숫자 하나하나를 다룰 때 알아야 하는 코드
	//자릿수를 알수없다는 것은 제일 큰자리 숫자가 무엇인지 모른다는 것
	//그렇기에 가장 작은 자릿수부터 처리해야한다.
	public static int find369(int number) {
		int count = 0;
		//while문 내부는 어떤 수를 한자리씩 분리하여 처리 하기 위한 코드들
		while (number > 0) {
			//while문의 조건의 의미: 더 이상 비교할 자리수가 없다.
			//number가 0이 될때까지 숫자를 끝에서부터 하나씩 추출
			int temp = number % 10;
			if (temp == 3 || temp == 6 || temp == 9)
				count++;
			number /= 10;
			//자리수를 한자리씩 줄이는 것
		}
		return count;		
	}
	
	public static void main(String[] args) {
		for (Integer i = 1; i <= 100; i++) {
			//Integer 말고 int 써도 상관없어
			int count = find369(i);
			//i는 int number이고 즉, primitive type이기 때문에
			//Call by value이다. 
			//값이 복사되어 전달되는 것이기에 i라는 변수는 중요치않아
			System.out.format("%d :", i);
			for (int j = 0; j < count; j++) {
				System.out.print("짝");
			}
		System.out.println("");
			
		}
	}
	
}