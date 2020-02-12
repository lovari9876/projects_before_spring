package day1119.exercise_ArrayList;

import java.util.Scanner;

public class TestArrayListOfStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayListOfStudent arrListStudent = new ArrayListOfStudent();
		arrListStudent.printArrayListOfStudent(sc);
		arrListStudent.gpaOfStudent(arrListStudent.sList, sc);
		sc.close();
	}

}
