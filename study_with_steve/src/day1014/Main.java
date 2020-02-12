package day1014;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		GenericLinkedList<Integer> linList new GenericLinkedList<Integer>;
		
		for (int i = 0; i < 10; i++)
			linkedList.add(0, i);
		//i가 0일땐 addHead, i가 i일때 addTail
		
		for (int i = 0; i < 10; i++)
			System.out.format("linkedList[%d] = %d\n", i, linkedList.get(i));
		//index필요할때 for, 필요없을때 foreach
		
		for (Integer i : linkedList)
			System.out.format("i = %d\n", i);
		
		List list = new SingleLinkedList();
		for (int i = 0; i < 10; i++)
			list.insertAt(0, i);
		//i가 0일땐 addHead, i가 i일때 addTail
		
		for (int i = 0; i < 10; i++)
			System.out.format("list[%d] = %d\n", i, list.getAt(i));

	}

}
