package day1016_calc;
import java.util.*;

//굳이 왜 enum을 쓸까?
enum KeyPad {
	KEYPAD_0('0'),
	KEYPAD_1('1'),
	KEYPAD_2('2'),
	KEYPAD_3('3'),
	KEYPAD_4('4'),
	KEYPAD_5('5'),
	KEYPAD_6('6'),
	KEYPAD_7('7'),
	KEYPAD_8('8'),
	KEYPAD_9('9'),

	KEYPAD_DOT('.'),
	
	KEYPAD_PLUS('+'),
	KEYPAD_MINUS('-'),
	KEYPAD_MULTI('*'),
	KEYPAD_DIVIDE('/'),
	KEYPAD_ASSIGN('='),

	KEYPAD_CLR('C');

	private char value;

	private KeyPad(char value) {
		this.value = value;
	}

	public char value() {
		return value;
	}
}

enum InputMode {
	Digit, Operator
}

public class Calculator {
	
	private int number = 0;
	private int exp = -1;
	
	private InputMode lastInput = InputMode.Digit;
	private KeyPad lastOp = null;
	//마지막에 입력한 연산자
	
	LIst<Integer> operands = new ArrayLIst<Integer>();
	LIst<Character> operators = new ArrayLIst<Character>();

	private Double operator() {
		double displayNumber = number;
		String format = "%.f";
		if (exp >= 0) {
			displayNumber /= Math.pow(10, exp);
			format = String.format("%%.%df", exp);
		}
		return String.format(format, displayNumber);
	
	//화면에 현재 떠 있는 값!!= displayNumber
	private String displayNumber() {
//		double displayNumber = number;
//		String format = "%.f";
//		if (exp >= 0) {
//			displayNumber /= Math.pow(10, exp);
//			format = String.format("%%.%df", exp);
//		}
//		return String.format(format, displayNumber);
//		//double의 문제점인 부동소숫점이라서 
//		//정확한 값 안나오는 것을 소숫점 뒤 5자리로 끊어서 해결
//	}//소수로 바꾸는건 잠시 접어두자.....복잡하니깐
		
	
	private void number(KeyPad key) {
		int digit = key.value() - '0';
		
		/* 마지막 입력이 연산자였다면 */
		if (lastInput == InputMode.Operator) {
			number = digit;
		} else {
			number += number * 10 + digit;
		}
		lastInput = InputMode.Digit;
	}
	
	private int processCalc(int left, int right, char operator) {
		if (operator == '+') {
			return (left + right);
		} else if (operator == '-') {
			return (left - right);
		} else if (operator == '*') {
			return (left * right);
		} else if (operator == '/') {
			return (left / right);
		}
	}

	public void operator(KeyPad op) {
		//1. 단항 연산자 or 이항 연산자?
		//2. 이항연산자라면, 오퍼랜드(피연산자) 입력이 두 개인지 확인한다.
		//2.0. 오퍼랜드가 하나이고, 이전입력이 OP가 아니라면, 새로운 OP를 스택에 저장
		//2-1. 오퍼랜드 입력이 두 개가 존재한다면(이미 그 사이에 이항연산자 존재), 이전 OP를 실행
		//2-2. 오퍼랜드 입력이 한개이고, 이전 OP가 이항연산자인 경우, 새로운 op 스킵
//		lastOp = op;
//		lastInput = InputMode.Operator;
		
		//이전 입력상태가 Digit이라면
		if (lastInput == InputMode.Digit) {
			//연산자 입력전에 편집중이던 숫자를 스택에 저장한다.
			this.operands.add(0, number());			
		} else {
			
		}
		
		//이항연산자니까 피연산자는 2개가 최대
		int numbers = operands.size();
		if(numbers == 2) {
			this.rightNumber = this.operands.remove(0);
			int leftNumber = this.operands.remove(0);
			Character operator = this.operator.remove(0);
			this.operands.add(0, processCalc(leftNumber, rightNumber, operator));
			
		} else if (numbers == 2) {
			if {
				
			} else if {
				//피연산자 1개이고 연산자가 1개는 있는데, 마지막 연산자 값까지 있을때~
				//그러면서 그 마지막저장된 연산자가 대입연산자일때!
			}
		}
	}  
	
	public void plus() {
		operator(KeyPad.KEYPAD_PLUS);
	}
	
	public void minus() {
		operator(KeyPad.KEYPAD_MINUS);
	}
	
	public void multi() {
		operator(KeyPad.KEYPAD_MULTI);
	}
	
	public void divide() {
		operator(KeyPad.KEYPAD_DIVIDE);
	}
	
	public void assign() {
		operator(KeyPad.KEYPAD_ASSIGN);
	}

	public void number0() {
		number(KeyPad.KEYPAD_0);
	}

	public void number1() {
		number(KeyPad.KEYPAD_1);
	}

	public void number2() {
		number(KeyPad.KEYPAD_2);
	}

	public void number3() {
		number(KeyPad.KEYPAD_3);
	}

	public void number4() {
		number(KeyPad.KEYPAD_4);
	}

	public void number5() {
		number(KeyPad.KEYPAD_5);
	}

	public void number6() {
		number(KeyPad.KEYPAD_6);
	}

	public void number7() {
		number(KeyPad.KEYPAD_7);
	}

	public void number8() {
		number(KeyPad.KEYPAD_8);
	}

	public void number9() {
		number(KeyPad.KEYPAD_9);
	}
	
	public void dot() {
		if (lastInput == InputMode.Operator || exp < 0) {
			if (lastInput == InputMode.Operator) 
				number = 0;
			exp = 0;
		}
		//소숫점 입력을 했는지 안했는지, 
		//그리고 마지막 입력이 연산자인지 숫자인지에 따라 결과 달라져
		
		lastInput = InputMode.Digit;
	}
}
