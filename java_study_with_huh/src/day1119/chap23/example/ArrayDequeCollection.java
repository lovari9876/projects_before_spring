package day1119.chap23.example;

import java.util.ArrayDeque;
import java.util.Deque;

class ArrayDequeCollection {

	public static void main(String[] args) {
		Deque<String> deq = new ArrayDeque<>();
//		Deque<String> deq = new LinkedList<>();
//		위 문장으로도 구성가능하다.
		
		// 앞으로 넣고
		deq.offerFirst("1.Box");
		deq.offerFirst("2.Toy");
		deq.offerFirst("3.Robot");

		// 앞에서 꺼내기
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
	}
}
