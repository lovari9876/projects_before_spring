package day1030.example;

public class Switch {
	public static void main(String[] args) {
		int n = 2;
		//break가 없으면 해당 case부터 쭈르륵 다 걸린다!!!!!
		//걸.리.면. b.r.e.a.k.까.지.!
		
		//switch (조건)에 올 수 있는 조건!!
		//int values, strings or enum variables are permitted
		switch (n) {
		case 1:
			System.out.println("Simple Java");
		case 2:
			System.out.println("Funny java");
		case 3:
			System.out.println("Fantastic java");
		default:
			System.out.println("The best programming language");
		}

		System.out.println("Do you like Java?");	
		
		//스트링, int, 이넘만 올 수 있다링
		String str = "자바";
		switch (str) {
		case "자바":
			break;

		default:
			break;
		}
	}
}
