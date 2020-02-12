package day1114.exercise_Generic;

//메인 보고서 클래스 만들기2

public class GenericTest {

	public static void main(String[] args) {
		GArray<String> gt = new GArray<>();
		
		String[] ss = {"바나나", "우유", "스택", "오랜쥐", "아아"};
		gt.setArr(ss);
		gt.printArr();
		System.out.println(gt.getClass().getSimpleName());
	}
}
