package day1011;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		LinkedList<Integer> stack = new LinkedList<Integer>();
		
		for(int i = 0; i < 10; i++)
			//Integer는 int를 받아줄수 있는 생성자가 있어서
			//int사용 가능
			stack.addLast(i); //list.add(new Integer(i));
		
		for (int i = 1; i <= 10; i++)
			System.out.format("%d: %d\n", 10 - i, stack.remove(10 - i));
		
		
		/*
		ArrayStack stack = new ArrayStack(10);
		//int 사이즈가 있는 생성자를 불러온다.
		for (Integer i = 0; i < 10; i++) 
			stack.push(i);
		
		for (Integer j =0; j < 10; j++) {
			System.out.format("%s \n", stack.top().toString());
			stack.pop();
		}
		*/
	}

}
