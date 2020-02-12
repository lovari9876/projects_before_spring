package day1114.exercise_Generic;

class DBox <T1, T2> {
	private T1 ob1;
	private T2 ob2;
	
	public void set(T1 ob1, T2 ob2) {
		this.ob1 = ob1;
		
		this.ob2 = ob2;
	}
	
	@Override
	public String toString() {
		return ob1 +"&"+ ob2;
	}
}

class DDBox <T1, T2> {
	private T1 ob1;
	private T2 ob2;
	
	public void set(T1 ob1, T2 ob2) {
		this.ob1 = ob1;
		this.ob2 = ob2;
	}
	
	@Override
	public String toString() {
		return ob1.toString() +"\n "+ ob2.toString(); 
		// toString() 안해줘도 문자열과 함께 + 연산시 자동 호출
	}
}