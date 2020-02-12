import java.util.Scanner;

public class Star1 {
    public static void main(String[] args) throws Exception {
	Scanner scanner = new Scanner(System.in);

	    System.out.print("출력할 줄 수를 입력하시오: ");
	    int num = scanner.nextInt();
	
	    for (int i = 1; i <= num; i++) {
		for (int j = i; j <= num-1; j++) {
		    System.out.print(" ");
		}
		for (int j = 1; j <= i; j++) {
		    System.out.print("*");
		}
		System.out.println("");
		         
	    }	   

    }
}
