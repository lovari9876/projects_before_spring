package day1015;
/*
 1. 어떻게 문자열의 길이를 알 수 있나?
 -문자열의 끝을 알 수 있나?
 -문자열의 끝은 '\0'(=null)이다.
 */
public class TestNo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		System.out.format("expected : 5, actual: %d\n", length(s1));
	}
	
	//length라는 함수가 있기에 사실 무의미한 함수~~
	public static int length(String s) {
		int count = 0;
		if (s != null) {
			try {
				while (s.charAt(count) != '\0')
					count++;
			} catch (IndexOutOfBoundsException ex) {
				System.out.println("this is not abnormal");
			}			
		}
		return count;
		
	}
}
