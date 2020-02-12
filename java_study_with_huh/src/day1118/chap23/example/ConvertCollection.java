package day1118.chap23.example;

import java.util.*;

public class ConvertCollection {
	public static void main(String[] args) {
		List<String> lst = Arrays.asList("Box", "Toy", "Box", "Toy");
		ArrayList<String> list = new ArrayList<>(lst);

		for (String s : list)
			System.out.print(s.toString() + '\t');
		System.out.println();

// 중복된 인스턴스를 걸러내기 위한 작업
		HashSet<String> set = new HashSet<>(list);
// 다른 컬렉션 인스턴스로부터 HashSet인스턴스 생성

// 원래대로 ArrayList<String> 인스턴스로 저장물을 옮긴다.
		list = new ArrayList<>(set);

		for (String s : list)
			System.out.print(s.toString() + '\t');
		System.out.println();
	}

}
