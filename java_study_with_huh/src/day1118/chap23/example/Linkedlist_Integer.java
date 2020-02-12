package day1118.chap23.example;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist_Integer {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10); // 저장 과정에서 오토박싱 진행
		list.add(20);
		list.add(30);
		
		int n;
		for(Iterator<Integer> itr = list.iterator();
				itr.hasNext();) {
			n = itr.next();
			System.out.print(n + "\t");
		}
		System.out.println();
	}
}
