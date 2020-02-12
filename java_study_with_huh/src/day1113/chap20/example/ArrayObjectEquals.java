package day1113.chap20.example;

import java.util.Arrays;

class INum {
	private int num;
	public INum(int num) {
		this.num = num;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.num == (((INum)obj).num))
			return true;
		else 
			return false;
	}	
	
// 메인 함수에서 Arrays.equals(ar1, ar2) 하면 각 오브젝트형 배열의 요소들을 서로 비교함
// 그런데 각 오브젝트는 INum형이기에 INum의 equals를 재정의해줘야 주솟값 비교를 안할 수 있다.
	
}

public class ArrayObjectEquals {
	public static void main(String[] args) {
		INum[] ar1 = new INum[3];
		INum[] ar2 = new INum[3];
		ar1[0] = new INum(1);
		ar2[0] = new INum(1);
		ar1[1] = new INum(2);
		ar2[1] = new INum(2);
		ar1[2] = new INum(3);
		ar2[3] = new INum(3);
		System.out.println(Arrays.equals(ar1, ar2));	
	}
}
