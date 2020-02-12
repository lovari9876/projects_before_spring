package day1030.exercise;

public class MainOfMultiple {
	public static void main(String[] args) {
		MultipleOfThree multipleOfThree = new MultipleOfThree();
		System.out.println("합은 " + multipleOfThree.total());
		System.out.println("3의 배수는 " + multipleOfThree.multipleOfThree().toString());
		
	}
}
