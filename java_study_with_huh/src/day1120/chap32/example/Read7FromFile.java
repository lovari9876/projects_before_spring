package day1120.chap32.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class Read7FromFile {

	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("chap32file.dat");
		int dat = in.read();
		in.close();
		
		System.out.println(dat);
	}
}
