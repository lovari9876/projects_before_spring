package day1120.chap32.example;

import java.io.*;

public class BufferedDataOutputStream {

	public static void main(String[] args) {
		try(DataOutputStream out = new DataOutputStream
				(new BufferedOutputStream
						(new FileOutputStream("bdos.txt")))) {
			out.writeInt(370);
			out.writeDouble(3.14);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}