package day1017;
import java.util.*;

public class PalindromeNumber {
	public static boolean isPalindrome(int x) {

		if (x < 0)
			return false;
//		
//		//solve problem by String ""
//		String number = String.valueOf(x);
		//three more ways that change number to String
		//String number = String.format("%d", x)
		//String number = "" + x;
		//String number = new Integer (x). toString();		
//		int length = number.length();
//		
//		// 1. x is odd number 
//		// 2. even number or 0
//		for (int i = 0; i < length/2; i++) {
//			if (number.charAt(i) != number.charAt(length - i -1))
//				return false;
//		}
//		return true;
//	}
		
		//my method
//		String s = "" + x;
//		int length = s.length();
//		
//		// 1. x is odd number 
//		// 2. even number or 0
//		if (length/2 != 0) {
//			char ch = s 
//			if ()
//		} else {
//			if
//			
//		}
	
	
		//solve problem in numeric way
		Long reverse = 0L;
		int temp = x;
		while (temp > 0) {
			reverse = reverse * 10 + temp % 10;
			temp /= 10;
		}
		return reverse == (long) x;
	}
	
	//I made this main() code by myself!!
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input number: ");
		int x = scanner.nextInt();
		
		scanner.close();
		System.out.format("%d is %s\n", x, (isPalindrome(x)? "Palindrome": "not isPalindrome"));			
	}

}



