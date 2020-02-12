package day1119.exercise_HashMap;

import java.util.*;

// "그만"이 입력될 때까지 , 나라 이름과 인구를 입력받아 저장하고,
// 다시 나라 이름을 입력받아 인구를 출력하는 프로그램을 작성하라.
// 출력을 참고하고 다음 해시맵을 이용하라.
// ========출력===========
// 나라 이름과 인구를 입력하세요.(예: Korea 5000)
// 나라 이름, 인구 >> Korea 5000
// 나라 이름, 인구 >> USA 1000000
// 나라 이름, 인구 >> Swiss 2000
// 나라 이름, 인구 >> France 3000
// 나라 이름, 인구 >> 그만
// 인구 검색 >> France
// France의 인구는 3000
// 인구 검색 >> 스위스 
// 스위스 나라는 없습니다.
// 인구 검색 >> 그만

public class PopulationOfCountry {	
	String countryName;
	Integer population;

	void populationOfCountry() {		
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> conPop = new HashMap<>();
		System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)");		
		while(true) {	
			System.out.print("나라 이름, 인구 >> ");
			countryName = sc.next();
			if(countryName.equals("그만")) {
				break;
			}
			population = sc.nextInt();
			conPop.put(countryName, population);
		}

		// while문 조건에 (!countryName.equals("그만")) 넣으면 
		// 위에서와 같기 때문에 둘 다 걸려서 밑에서 while문 진입 못한다.
		// countryName = new String(sc.next()); 
		// 해주어야 새로 String 생성해서 위에서 입력한걸 참조하지 않으셈
		while(true) {			
			System.out.print("인구 검색 >> ");
			countryName = new String(sc.next());
			if(countryName.equals("그만")) {
				break;
			}
			if (conPop.get(countryName) != null) {
				System.out.printf("%s의 인구는 %d\t", 
						countryName, conPop.get(countryName));
			} else
				System.out.printf("%s 나라는 없습니다.\t", countryName);
		}
		sc.close();
	}
}
