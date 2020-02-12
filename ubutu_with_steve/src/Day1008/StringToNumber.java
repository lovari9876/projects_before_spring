import java.util.Scanner;

public class StringToNumber {
     public static void main(String[] args) throws Exception {
	 Scanner scanner = new Scanner(System.in);
	 String temp;

	 	do {
	 		System.out.print("input number: ");
	 		temp = scanner.next();
	 		if (temp.equalsIgnoreCase("q"))
	 			break;
	 		else if (!isDigit(temp))
	 			continue;
	 		System.out.format("Input is %d\n", parseInt(temp));
	 		
	 		scanner.close();	     
	 	} while (true);
     }
    

    public static boolean isDigit(String str) {
    	if (str == null)
    		return false;

    	boolean isDigit = true;

    	str.trim();
    	for (int i = 0; i < str.length(); i++) {
    		char ch = str.charAt(i);
	    	if (!Character.isDigit(ch)) {
	    		isDigit = false;
	    		break;
	    	}
    	}
    	return isDigit;
    }
    /*
   	public static boolean isDigit(char ch)
    Determines if the specified character is a digit.
    A character is a digit if its general category type,
    provided by Character.getType(ch), is DECIMAL_DIGIT_NUMBER.
	*/
    
    public static Integer parseInt(String str) {
    	if (str == null)
    		return null;

    	int number = 0;
    	str.trim();

    	for (int i = 0; i < str.length(); i++) {
	    	char ch = str.charAt(i);
	    	if (!Character.isDigit(ch)) {
	    		return null;
	    	} else {
	    		number = number * 10 + (ch - '0');
	    		//ch 한글자에서 ''빼면 숫자가 된당 와우넴
	    		//class CharacterToInt 참고
	    	}
    	}
    	return number;
    }
}
