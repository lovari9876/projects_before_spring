package day1106.example;

public class Two_DimensionalArray {	
	public static void main(String[] args) {
		int[][] arr = {
				{11, 22, 33},
				{44, 55, 66},
				{77, 88, 99}
		};
		
		//넣어주지 않은 값은 0으로 초기화
		int[][] arr2 = {
				{11},
				{22, 33},
				{44, 55, 66}
		};
		
		// 배열의 구조대로 내용 출력
		// arr2.length는 몇 행인지를 나타내는 총 길이이고
		// arr2[i].length는 i번째 행의 요소 수, 즉 열의 길이를 나타낸다.
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println();
		}
			
		
	}
}
