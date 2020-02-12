package day1118.chap23.example;

import java.util.Iterator;
import java.util.TreeSet;

public class SortedTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(3);
		tree.add(1);
		tree.add(2);
		tree.add(4);
		tree.add(4);
		
		System.out.println("인스턴스 수: " + tree.size());
		//집합이지만 순서가 정해진 집합!! 정렬 유지하면서 요소 저장
		//이진 트리처럼 트리로 되어있어서 검색 수월
		
		// for-each문에 의한 반복
		for(Integer n : tree)
			System.out.print(n.toString() + '\t');
		System.out.println();
		
		// Iterator 반복자에 의한 반복
		for(Iterator<Integer> itr = tree.iterator(); itr.hasNext(); )
			System.out.print(itr.next().toString() + '\t');
		System.out.println();

	}

}
