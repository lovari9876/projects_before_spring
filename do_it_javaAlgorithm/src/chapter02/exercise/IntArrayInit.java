package chapter02.exercise;

public class IntArrayInit {
	//초기화에 대한 예제!

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		
		for(int i = 0; i < a.length; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	}
}