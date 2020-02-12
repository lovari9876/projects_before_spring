package day1120.chap32.example;

import java.io.*;

public class BufferedDataInputStream {
	public static void main(String[] args) {
		try (DataInputStream in = new DataInputStream
				(new BufferedInputStream
						(new FileInputStream("bdos.txt")))) {
			int num1 = in.readInt();
			double num2 = in.readDouble();
			
			System.out.println(num1);
			System.out.println(num2);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
