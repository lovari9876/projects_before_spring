package day1119.exercise_Vector;

import java.util.*;

// Vector 컬렉션을 이용하여 강수량의 평균을 유지 관리하는 프로그램을 작성하라.
// 강수량을 입력하면 벡터에 추가하고, 현재 입력된 모든 강수량과 평균을 출력한다.

class Precipitation {
	int precipitation; // 강수량

	void averageOfPrecipitation() { // 강수량 평균 유지,관리
		Scanner sc = new Scanner(System.in);
		Vector<Integer> pr = new Vector<>();
		while (true) {
			System.out.print("강수량 입력 (0 입력시 종료) >> ");
			precipitation = sc.nextInt();
			if (precipitation == 0) {
				break;
			}
			pr.addElement(precipitation);
			System.out.println();

			// 모든 요소 출력
			for (Enumeration<Integer> e = pr.elements(); e.hasMoreElements();)
				System.out.printf("%d ", e.nextElement());
			System.out.println();
			
			// 평균 출력
			int sum = 0;
			for (Integer e : pr)
				sum += e;
			int avg = sum / pr.size();
			System.out.printf("현재 평균 %d\n", avg);
			System.out.println();
		}
		sc.close();
	}
}
