import java.util.Scanner;

class RomanToNumber2 {

	public static void main(String[] args) throws Exception {
	    Scanner scanner = new Scanner(System.in);
	    //스캐너는 현재 heap에 생긴 상태

	    System.out.print("input roman number: ");
	    String roman = scanner.next();

	    //대소문자구분을 못하므로 예외사항에 대한 대응으로 대소문자 바꾸는 코드를 넣어준다.
	    
	    System.out.println("Roman number: " + roman);
	    System.out.println("toLowerCase: " + roman.toLowerCase());
	    System.out.println("toUpperCase: " + roman.toUpperCase());
	    System.out.println("\"I\" == \"I\": " + ("I"=="I"));
	    System.out.println("compareTo(\"I\"): " + roman.compareTo("I"));
	    System.out.println("equals(\"I\"): " + roman.equals("i"));
	    System.out.println("equalsIgnoreCase(\"I\"): " + roman.equalsIgnoreCase("i"));

	    
	    /*
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
    	    */


	}
}
