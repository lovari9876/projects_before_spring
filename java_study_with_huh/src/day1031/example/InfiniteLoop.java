package day1031.example;

public class InfiniteLoop {

	public static void main(String[] args) {
		int num = 1;
		
//		for( ; ; ) {  // 이렇게 해도 무한루프이다!!
		while(true) {
			if(((num % 6) == 0) && ((num % 14) == 0))
			break;
			num++;
		}
	}
}
