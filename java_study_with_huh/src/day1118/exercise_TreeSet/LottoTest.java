package day1118.exercise_TreeSet;

import java.util.*;

// 로또 번호 6개를 뽑아내는 프로그램을 작성하시오
// (중복 없이, 소스코드 10줄 이내로..)

class LottoTest {
	public static void main(String[] args) {
		Random r = new Random();
		Set<Integer> lTree = new TreeSet<>();
		while (lTree.size() < 6)
			lTree.add(1 + r.nextInt(45));	
		System.out.println("로또번호는 " + lTree + " 입니다.");
//		컬렉션을 print 하면,
//		[11, 25, 26, 28, 39, 40] 으로 자동 출력해준다.
//		
//		toString in Class AbstractCollection<E>
//		public String toString()
//		Returns a string representation of this collection. The string representation consists of a list of the collection's elements in the order they are returned by its iterator, enclosed in square brackets ("[]"). Adjacent elements are separated by the characters ", " (comma and space). Elements are converted to strings as by String.valueOf(Object).
//		Overrides:
//		toString in class Object
//		Returns:
//		a string representation of this collection
	}		
}
