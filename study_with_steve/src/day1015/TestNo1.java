package day1015;

public class TestNo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 3;
		
		System.out.format("a= %d\n", a++);
		System.out.format("b= %d\n", ++b);
		//주의점!!!!!!
		// a++ 는 a=+1과 같음!!!!
		//print나 format안에 있어도!!! 
		//연산이 계속 이루어져!!!!!
		b = ++a;
		System.out.format("a= %d\n", a++);
		System.out.format("b= %d\n", b++);
		
		b = a++;
		System.out.format("a= %d\n", a);
		System.out.format("b= %d\n", b);
		
		a = 10;
		b = ++a + a++;
		//b = 11 + 11 = 22
		System.out.format("b = %d\n", b);
		
		a = 10;
		b = a++ + 3 + ++a;
		//10이었던 a에 3을 더하면 13이다. 그리고나서 증감연산자 작용으로 a=11된다.
		//++a는 11+1한거니까 12이다. 
		//답은 10 + 3 + 12 = 25
		System.out.format("b = %d\n", b);
	}

}