package chapter03.practice;

public class Q3 {
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int num = 0;
		// n = a.length;
		for(int i = 0; i < n; i++) {
			if(a[i] == key) {
				idx[num++] = i;
			}			
		}		
		return num;
	}

	public static void main(String[] args) {
		int[] a = {1, 9, 2, 9, 4, 6, 7, 9};
		int[] idx = new int[20];
		
		int num = searchIdx(a, a.length, 9, idx);
		System.out.println("일치한 요솟수는 " + num);
		System.out.print("일치한 요소의 인덱스는 ");
		for(int i = 0; i < num; i++) {
			System.out.print(idx[i] + " ");
		}
	}
}
