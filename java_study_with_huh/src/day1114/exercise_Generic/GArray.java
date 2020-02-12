package day1114.exercise_Generic;

class GArray <T> {
	private T[] arr;
	
	void setArr(T[] arr) {
		this.arr = arr; 
	}
	
	T[] getArr() {
		return arr;
	}
	
	void printArr() {
		for(T e : arr) {
			System.out.print(e + " ");
		}
	}
}
