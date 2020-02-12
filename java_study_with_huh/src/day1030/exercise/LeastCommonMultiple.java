package day1030.exercise;

public class LeastCommonMultiple {
	public static void main(String[] args) {
		leastCommonMultiple1();
		leastCommonMultiple2();
	}
	
	public static void leastCommonMultiple1() {
		int num = 1;
		boolean search = false;

		// 처음 만나는 5의 배수이자 7의 배수인 수를 찾는 반복문
		while (num < 100) {
			if ((num % 5) == 0 && (num % 7 == 0)) {
				search = true;
				break;
				// 맨 처음 찾은 값만 쓰고 싶을때 쓰는 방법!!!
			}
			num++;
		}
		if (search)
			System.out.println("최소공배수: " + num);
		else
			System.out.println("5와 7의 최소공배수를 찾지 못했습니다.");		
	}

	public static void leastCommonMultiple2() {
		int num = 0;
		int count = 0;

		// 최소공배수 출력, 찾은 개수도 출력
		while ((num++) < 100) {
			if ((num % 5) != 0 || (num % 7 != 0))
				continue;
			// 맨 처음 찾은 값만 쓰고 싶을때 쓰는 방법!!!
			count++;
			System.out.println(num);
		}
		System.out.println("count :" + count);

	}

}
