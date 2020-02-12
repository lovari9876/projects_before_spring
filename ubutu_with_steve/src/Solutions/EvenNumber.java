import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) throws Exception {


	int[] numbers = new int[100];
	int count= 0;
	boolean isPrime;

	for (int n = 2; n <= 100; n++) {
	    isPrime = true;
	    for (int i = 0; i < count; i++) {
		if (n % numbers[i] == 0) {
		    isPrime = false;
		    break;
		}
	    }

	    if (isPrime) {
		numbers[count] = n;
		count++;
	    }
	    
	    for (int i = 0; i < 100; i++) {
		System.out.format("%d : %s\n", i, (i % 2 == 0 ? "짝수" : "홀수"));
	    }
	    
	    for (int i = 0; i < count; i++) {
		System.out.format("%d is a prime number\n", numbers[i]);
	    }
	}
    }

}
