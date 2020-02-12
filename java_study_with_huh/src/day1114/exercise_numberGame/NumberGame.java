package day1114.exercise_numberGame;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NumberGame implements IRandomNum {
	int cNum;
	int uNum;

	public void correctNum() {
		Random r = new Random();
		int count = 0;
		cNum = r.nextInt(100) + 1; // 컴터의 랜덤숫자

		while (uNum != cNum) {
			Scanner sc = new Scanner(System.in);
			count++;
			System.out.print("1 과 100 사이의 값을 입력하세요: ");
			try {
				uNum = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("유효하지 않은 값입니다. 다시 값을 입력해주세요 .");
				continue;
			}
			if (uNum <= 100 && uNum > 0) {
				if (uNum > cNum) {
					System.out.println("더 작은 수를 입력하세요.");
				} else if (uNum < cNum) {
					System.out.println("더 큰 수를 입력하세요.");
				} else {
					System.out.println("맞추었습니다.");
					System.out.println("시도횟수는 " + count + "번 입니다.");
					sc.close();
					return;
				}
			} else {
				System.out.println("유효하지 않은 값입니다. 다시 값을 입력해주세요 .");
				continue;
			}
			sc.close();
		}
	}
}
