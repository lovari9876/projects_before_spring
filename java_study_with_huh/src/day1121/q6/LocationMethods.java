package day1121.q6;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class LocationMethods {
	HashMap<String, Location> cityInfo(Scanner sc) {
		HashMap<String, Location> info = new HashMap<>();
		System.out.println("도시, 경도, 위도를 입력하세요.");

		// 4개 도시 정보 차례로 입력받아 저장
		for (int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String str = sc.nextLine();
			StringTokenizer st = new StringTokenizer(str, ",");

			String city = st.nextToken().trim();
			int latitude = Integer.valueOf(st.nextToken().trim());
			int longitude = Integer.parseInt(st.nextToken().trim());
//			valueOf()나 parseInt()나 결과 같음

			info.put(city, new Location(city, latitude, longitude));
		}

		// 전체 도시 정보 출력
		Set<String> key = info.keySet();
		for (String e : key) {
			System.out.print(
					info.get(e).getCity() + " " 
							+ info.get(e).getLatitude() + " " 
								+ info.get(e).getLongitude() + "\n");
		}
//		toString()을 오버라이드 한 후, 그냥 이렇게 하는게 더 좋음.
//		for (String e : key) {
//			System.out.println(info.get(e).toString());
//		}
		return info;
	}

	void searchCity(HashMap<String, Location> info, Scanner sc) {
		String str;
		do {
			System.out.print("도시 이름 >> ");
			str = sc.nextLine().trim();
			if (!info.containsKey(str)) { // 잘못된 입력시
				// info.get(str) == null 으로 쓸 수도 있다.
				System.out.println(str + "은(는) 없습니다.");
				continue;
			} else { // 저장되어 있는 도시이면
				System.out.println(info.get(str).getCity() + " " + info.get(str).getLatitude() + " "
						+ info.get(str).getLongitude());
			}
		} while (!str.equals("그만"));
		System.out.println("종료합니다.");
	}
}
