class HelloWorld {
	//Entry point(시작점)
	//메인 진입 함수
	public static void main(String[] args) {
		//자바의 모든 class는 Object 클래스를 상속받는다. 
		int a = 10;
		int b = 20;
		System.out.println("Sum = " + a + b);
		System.out.println("Sum = " +(a + b));
		
		a = 10;
	       	b = a++;
		System.out.println("b = a++");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("");

		a = 10;
	       	b = ++a;
		System.out.println("b = ++a");
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);

	}
}
