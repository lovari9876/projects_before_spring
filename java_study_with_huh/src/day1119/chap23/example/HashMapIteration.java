package day1119.chap23.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

class HashMapIteration {

	public static void main(String[] args) {
//		HashMap<Integer, String> map = new HashMap<>();
		TreeMap<Integer, String> map = new TreeMap<>();
//		정렬하고 싶으면 HashMap 대신 TreeMap 사용!!
		
		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");
		
		// Key만 담고 있는 컬렉션 인스턴스 생성
		Set<Integer> ks = map.keySet();
		
		// 전체 Key 출력(for-each문 기반)
		for(Integer n : ks)
			System.out.print(n + "\t");
//			System.out.print(n.toString() + '\t');
//		위도 같은 결과 출력
		System.out.println();
		
		// 전체 Value 출력(for-each문 기반)
		for(Integer n : ks)
			System.out.print(map.get(n).toString() + '\t');
		// .toString()은 담긴 Value가 String이기에 여기서는 사실 필요없음
		System.out.println();
		
		// 전체 Value 출력(반복자 기반)
		for(Iterator<Integer> itr = ks.iterator(); itr.hasNext();)
			System.out.print(map.get(itr.next()) + '\t');
		System.out.println();
	}
}
