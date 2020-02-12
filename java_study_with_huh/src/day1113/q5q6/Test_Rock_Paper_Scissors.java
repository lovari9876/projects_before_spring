package day1113.q5q6;

import java.util.Scanner;
import java.util.Random;

//가위바위보 게임 만들기

public class Test_Rock_Paper_Scissors {
	public static void main(String[] args) {		

		int userRPS = 0;
		Rock_Paper_Scissors user = new Rock_Paper_Scissors(userRPS);

		int comRPS = 0;
		Rock_Paper_Scissors com = new Rock_Paper_Scissors(comRPS);

		while (true) {
			Scanner sc = new Scanner(System.in);
			Random r = new Random();
			
			System.out.println("======<가위바위보 대!격!돌!>======");
			System.out.println("1.가위	2.바위	3.보      0.종료");
			System.out.print("번호를 입력하세요: ");
			
			int temp = 0;
			
			try {
				temp = sc.nextInt();
			} catch (Exception e) {
				System.out.println("잘못 입력했자나!! \n");
				continue;
			}
			if (temp == 0) {
				System.out.println("와~ 재밌었다.");
				break;
			} else if (0 < temp && temp <= 3) {
				comRPS = 1 + r.nextInt(3);
				user = new Rock_Paper_Scissors(userRPS);
				com = new Rock_Paper_Scissors(comRPS);

				userRPS = temp;
				user.rockPaperScissors(com);
			} else {
				System.out.println("잘못 입력했자나!! \n");
				continue;
			}
			sc.close();
		}
		
	}

}
