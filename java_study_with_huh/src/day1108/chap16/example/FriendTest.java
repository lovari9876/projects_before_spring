package day1108.chap16.example;

public class FriendTest {

	public static void main(String[] args) {
		Friend[] frns = new Friend[10];
		int cnt = 0;
		
		frns[cnt++] = new UnivFriend("LEE", "Computer", "010-333-555");
		frns[cnt++] = new UnivFriend("SEO", "Electronics", "010-222-444");
		frns[cnt++] = new ComFriend("YOON", "R&D 1", "02-123-999");
		frns[cnt++] = new ComFriend("PARK", "R&D 2", "01-321-777");
		
		//모든 동창 및 동료의 정보 전체 출력
		for(int i = 0; i < cnt; i++) {
			frns[i].showInfo(); // 오버라이딩 한 메소드가 호출된다.
			System.out.println();
		}
				
				
		
		
	}

}
