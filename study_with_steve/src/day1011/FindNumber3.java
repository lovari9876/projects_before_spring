package day1011;

public class FindNumber3 {
	public static void main(String[] args) {
		for (Integer i = 1; i <= 100; i++) {
			//toString()메소드를 쓰기 위해서는 클래스의 객체를 변수로 써야함
			//그래서 int를 안쓰고 클래스인 Integer(랩퍼클래스) 쓰는것
			if (i.toString().indexOf('3') < 0)
			//i.toString().indexOf('3') 이 없다면 이라는 뜻
			//i라는 Integer를 String으로 바꾸어서 글자 중 3이 있는지 검사
				continue;
			//3이 들어가지 않으면 다시 for문으로 회귀
		
			System.out.format("%d\n", i);
			
			/*
			 * 위 코드는 아래코드와 같다. 
			 * 둘 다 쓸 줄 알아야 해!!
		 	if (i.toString().indexOf('3') >= 0) {
			 	System.out.format("%d\n", i);
			 }
			*/
		}
	}
}
