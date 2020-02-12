import java.util.Scanner;

public class ParseNumber {
    public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	String temp;

	do {
	    System.out.print("Input number: ");
	    temp = scanner.next();
	    temp.trim();

	    if (temp.equalsIgnoreCase("q")) {
		System.out.println("Bye~");
		break;
	    }

	    try {
		int number = Integer.parseInt(temp);
		System.out.format("Number is %d\n", number);
	    } catch (Exception ex) {
	    }
	    
	    scanner.close();
	}while (true);
    }
}
