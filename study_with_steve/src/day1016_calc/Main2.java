package day1016_calc;

public class Main2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		c.number1();
		//함수 호출한거니까 1이라는 버튼누른것과 같아
		c.number2();
		c.number3();
		c.dot();
		c.number4();
		c.number5();
		c.number6();
		c.number7();
	
		System.out.println("expected: 123.4567, actual: " + c.displayNumber);
	}

}
