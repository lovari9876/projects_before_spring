package day1112.exercise;

import java.util.Scanner;

public class TestBuyer {
	public static void main(String[] args) {

//		Product[] p = new Product[3];
//		
//		Buyer b = new Buyer(5000, p);
//		b.buy(new Computer());
//		b.buy(new Monitor());
//		b.summary();

		Scanner sc = new Scanner(System.in);
		Product[] cart = new Product[3];
		Buyer buyer = new Buyer(10000, cart);
		int pNum; // 물건 번호

		do {
			System.out.println("=============<물건 목록>==============");
			System.out.println("1.컴퓨터	2.모니터	3.키보드 	4.마우스	0.끝내기");
			System.out.print("구입할 물건의 번호를 입력하시오: ");
			pNum = sc.nextInt();

			do {
				switch (pNum) {
				case 1:
					Product p = new Computer();
					buyer.buy(p);
					buyer.summary();
					break;
				case 2:
					p = new Monitor();
					buyer.buy(p);
					buyer.summary();
					break;
				case 3:
					p = new Keyboard();
					buyer.buy(p);
					buyer.summary();
					break;
				case 4:
					p = new Mouse();
					buyer.buy(p);
					buyer.summary();
					break;
				}
			} while (pNum < 0 || pNum > 4);

		} while (pNum != 0);

		sc.close();
	}

}
