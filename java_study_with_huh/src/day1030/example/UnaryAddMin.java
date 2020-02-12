package day1030.example;

public class UnaryAddMin {

	public static void main(String[] args) {
		short num1 = 5;
		System.out.println(+num1);
		System.out.println(-num1);

		short num2 = 7;
		short num3 = (short)(+num2); //형변환 안하면 컴파일 에러난다!!
		//부호 연산도 연산이야!!!!!
		//short -7 = int -1 * short 7 
		//연산결과가 int형이 되어버리는 것이야!!!!!!
		//short형으로 명시적 형변환 안해주면 오류 발생이야!!
		short num4 = (short)(-num2);
		System.out.println(num3);
		System.out.println(num4);
	}
}
