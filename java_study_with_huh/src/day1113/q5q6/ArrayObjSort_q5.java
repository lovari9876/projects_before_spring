package day1113.q5q6;

import java.util.Arrays;

// 클래스를 이름의 철자의 갯수가 작은것부터 정렬되도록 완성하시오. 

class Person implements Comparable<Object> {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Object o) {
		Person p = (Person)o;
		return this.name.length() - p.name.length();
	}
	
	@Override
	public String toString() {
		return name + ": " + age;
	}
}

public class ArrayObjSort_q5 {
	public static void main(String[] args) {
		Person[] ar = new Person[3];
		ar[0] = new Person("Aee A", 29);
		ar[1] = new Person("Boo", 15);
		ar[2] = new Person("Coo CJ", 37);
		
		Arrays.sort(ar);
		for(Person p : ar) {
			System.out.println(p);
		}
	}
}
