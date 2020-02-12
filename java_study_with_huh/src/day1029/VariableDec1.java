package day1029;

public class VariableDec1 {
	public static void main(String[] args) {
		double num1, num2;
		double result;
		num1 = 1.0000001;
		num2 = 2.0000001;
		result = num1 + num2;
		System.out.println(result);
		// 연산 결과가 정확하지 않아 충격쓰
	}
}


//  왜...? 정확하지 않을까? 
// 실수 표현엔 반드시 오차가 존재하기 때문이야!!!
  
