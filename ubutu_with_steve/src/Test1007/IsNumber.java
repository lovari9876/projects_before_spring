import java.util.Scanner;

public class IsNumber {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String temp;
			         
	temp = scanner.next();
	temp.trim();
				
	for (int i = 0; i < temp.length(); i++) {
	    char ch = temp.charAt(i);
	    System.out.format("%c %b\n", ch, Character.isDigit(ch));
	}
    }
}
