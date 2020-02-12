package day1105.example;

public class StringMethods {

	public static void main(String[] args) {
		String st1 = "Lexicograph";
		String st2 = "lexicograph";
		int cmp;
		// lexicographic 사전 편찬상의
		// 편찬: 여러 가지 자료를 모아 체계적으로 정리하여 책을 만듦.
		
		if(st1.contentEquals(st2))
			System.out.println("두 문자열은 같습니다.");
		else
			System.out.println("두 문자열은 다릅니다. ");
		
		cmp = st1.compareTo(st2);
		if(cmp == 0)
			System.out.println("두 문자열은 일치합니다.");
		else if (cmp < 0)
			System.out.println("사전의 앞에 위치하는 문자: " + st1);
		else 
			System.out.println("사전의 앞에 위치하는 문자: " + st2);
		
		if(st1.compareToIgnoreCase(st2) == 0)
			System.out.println("두 문자열은 같습니다.");
		else 
			System.out.println("두 문자열은 다릅니다.");

	}

}
