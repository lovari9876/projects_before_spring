package day1118.exercise_HashSet;

import java.util.HashSet;

class Num {
	private int num;
	
	public Num(int n) {
		num = n;
	}
	
	@Override
	public String toString() {
		return String.valueOf(num);
	}
	
	@Override
	public int hashCode() {		
		System.out.println("원래 해시코드: " + super.hashCode());
		// 원래 해쉬코드 알아보기
		return num;	
		// 군집을 짜보자...
		// return num % 3; 과 같이.....
	}

	@Override
	public boolean equals(Object o) {
		System.out.println("equals() 호출한 객체의 num: " + o);
		if(this.num != ((Num) o).num) {
			// 걍 num해줘도 되지만 알아보기 쉬우라고 this.num 해준당..
			return false;
		} else 
			return true; // 다를 때		
	}	
}

public class HashSetEqualityOne {
	public static void main(String[] args) {
		HashSet<Num> set = new HashSet<>();
		set.add(new Num(7799));
		set.add(new Num(9955));
		set.add(new Num(7799));
		
		for(Num n : set)
			System.out.print(n.toString() + '\t');
		
		System.out.println("인스턴스 수: " + set.size());
	}
}
