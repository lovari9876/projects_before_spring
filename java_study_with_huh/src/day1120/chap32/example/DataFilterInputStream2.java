package day1120.chap32.example;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

//기본자료형을 읽어올 때 쓰는 보조 스트림: DataInputStream

public class DataFilterInputStream2 {

	public static void main(String[] args) {
		try (DataInputStream in = new DataInputStream(new FileInputStream("fileOrg.txt"))) {
			int num1 = in.readInt(); // int형 데이터 꺼냄
			double num2 = in.readDouble(); // double형 데이터 꺼냄
			System.out.println(num1);
			System.out.println(num2);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
