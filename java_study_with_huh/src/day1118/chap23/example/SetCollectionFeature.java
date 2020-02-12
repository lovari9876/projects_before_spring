package day1118.chap23.example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// 요소의 중복 저장을 허용하지 않는 set(집합)

public class SetCollectionFeature {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Toy");
		set.add("Box");
		set.add("Robot");
		set.add("Box");
		System.out.println("인스턴스 수: " + set.size());

		// 반복자를 이용한 전체 출력
		for (Iterator<String> itr = set.iterator(); itr.hasNext();)
			System.out.print(itr.next() + '\t');
		System.out.println();

		// for-each문을 이용한 전체 출력
		for (String s : set)
			System.out.print(s + '\t');
		System.out.println();
	}
}
