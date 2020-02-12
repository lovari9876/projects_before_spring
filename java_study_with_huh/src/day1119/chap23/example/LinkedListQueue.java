package day1119.chap23.example;

// LinkedList<E>는 List<E>와 동시에 Queue<E>를 구현하는 컬렉션 클래스이다.
// 따라서 어떠한 타입의 참조변수로 참조하느냐에 따라 '리스트'로도 '큐'로도 동작한다.
// ** Queue<E>는 단순히 보기만 하는게 아니라 꺼낼수있다.

import java.util.LinkedList;
import java.util.Queue;

class LinkedListQueue {
	public static void main(String[] args) {
		Queue<String> que = new LinkedList<>(); // LinkedList<E> 인스턴스 생성!
		que.offer("Box");
		que.offer("Toy");
		que.offer("Robot");

		// 무엇이 다음에 나올지 확인
		System.out.println("next: " + que.peek());

		// 첫번째, 두번째 인스턴스 꺼내기
		System.out.println(que.poll());
		System.out.println(que.poll());

		// 무엇이 다음에 나올지 확인
		System.out.println("next: " + que.peek());

		// 마지막 인스턴스 꺼내기
		System.out.println(que.poll());
	}
}
