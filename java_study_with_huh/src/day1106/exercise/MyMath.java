package day1106.exercise;

//다음의 클래스 함수를 만드시오.
//클래스 명은 MyMath 이며 아래의 두 함수를 static 으로 만드시오.
//
//함수명: myMin
//파라미터: int 배열
//리턴값: 배열의 값 중 최소값
//
//함수명: myMax
//파라미터: int 배열
//리턴값: 배열의 값 중 최소값
//
//테스트 클래스 MyMathTest 를 만든 후
//int 배열의 구성 요솟값 5개를 키보드 입력으로 받아서 
//myMin, myMax 함수 호출할것.

public class MyMath {
	static int myMin(int[] intArray) {
		// 일단 4바이트 int 공간을 잡아두고 비교하는 것이 핵심!
		// min을 비교대상으로 삼는것!!
		// swap할때 int temp 하듯이~~~
		int min = intArray[0];
//		int min = Integer.MAX_VALUE;
//		해서 초기화 해도 된다~~~ 정 모르겠다면~~~ 
		for(int i : intArray) {
			if (min > i)
				min = i;
		}
		return min;
	}
	
	static int myMax(int[] intArray) {
		int max = intArray[0];
		for(int i : intArray) {			
			if (max < i)
				max = i;
		}
		return max;		
	}
}
