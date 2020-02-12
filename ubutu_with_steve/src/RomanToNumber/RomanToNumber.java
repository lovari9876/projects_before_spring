import java.util.Scanner;

class RomanToNumber {

	public static void main(String[] args) throws Exception {
	    Scanner scanner = new Scanner(System.in);
	    //스캐너는 현재 heap에 생긴 상태
	    String roman = scanner.next();

	    if (roman == "I") {
		System.out.println("number 1");
	    } else if (roman == "II") {
		System.out.println("number 2");
	    } else if (roman == "III") {
		System.out.println("number 3");
	    } else if (roman == "IV") {
		System.out.println("number 4");
	    } else if (roman == "V") {
		System.out.println("number 5");
	    } else if (roman == "VI") {
		System.out.println("number 6");
	    } else if (roman == "VII") {
		System.out.println("number 7");
	    } else if (roman == "VIII") {
		System.out.println("number 8");
	    } else if (roman == "IX") {
		System.out.println("number 9");
	    } else if (roman == "X") {
		System.out.println("number 10");
	    }	


	}
}
