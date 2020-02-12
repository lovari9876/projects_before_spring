package day1119.q3;

//HashMap<String, Integer> 컬렉션을 생성하고 
//“에스프레소”는 2000, “아메리카노”는 2500, “카푸치노”는 3000, “카페라떼”는 3500을 저장하라.
//그리고 다음과 같이 음료수 이름을 입력받으면 HashMap에서 검색하여 가격을 출력하라.
//===================
//에스프레소, 아메리카노, 카푸치노, 카페라떼가 있습니다.
//주문>> 아메리카노
//아메리카노는 2500원 입니다.
//주문>> 카푸치노
//카푸치노는 3000원 입니다.
//주문>> 그만

import java.util.*;

class Coffee {
	void coffeMenu(Scanner sc) {
		HashMap<String, Integer> menu = new HashMap<>();
		menu.put("에스프레소", 2000);
		menu.put("아메리카노", 2500);
		menu.put("카푸치노", 3000);
		menu.put("카페라떼", 3500);

		System.out.println("에스프레소, 아메리카노, 카푸치노, 카페라떼가 있습니다.");
		while (true) {
			System.out.print("주문>> ");
			String str = sc.next();

			if ("그만".equals(str)) {
				System.out.println("주문 완료");
				break;
			}

			System.out.printf("%s는 %d원 입니다.\n", str, menu.get(str));
			
//			목록을 다 읽는게 아니니까 이럴 필요가 없다!!
//			Set<String> ks = menu.keySet();
//			for (String s : ks) {
//				if (s.equals(str))
//					System.out.printf("%s는 %d원 입니다.\n", s, menu.get(s));
//			}
			
		}
	}
}
