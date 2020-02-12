//1에서 9단까지 구구단을 출력하시오.

public class Test3 {
    public static void main(String[] args) throws Exception {

	int num;	
	//숫자가 범위내의 숫자인지 일단 판별부터!!!
	for (num = 1; num<=9; num++) {
	//if (num >= 1 && num <= 9) {
	    for (int i = 1; i<=9; i++) {
		int temp = num * i;
		System.out.format("%d x %d = %d\n", num, i, temp);
	    }
	    System.out.println("===========================");
	}     
    }   
}
