package day1114.exercise_Generic;

// 메인 보고서 클래스 만들기2

public class DDBoxDemo {
	public static void main(String[] args) {
		DBox<String, Integer> box1 = new DBox<>();
		box1.set("Apple", 25);
		
		DBox<String, Integer> box2 = new DBox<>();
		box2.set("Orange", 33);
		
		DDBox<DBox<String, Integer>, DBox<String, Integer>> ddbox = new DDBox<>();
		ddbox.set(box1, box2);
		
		System.out.println(ddbox);
	}
}
