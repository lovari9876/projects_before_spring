package day1111.chap18.example;

import java.io.*;
import java.nio.file.*;

public class IOException1 {

	public static void main(String[] args) {
		Path file = Paths.get("C:\\Users\\user\\Simple.txt");
		BufferedWriter writer = null;
		
		try {
			writer = Files.newBufferedWriter(file); 
				// IOException 발생 가능
			writer.write('A'); // IOException 발생 가능
			writer.write('Z'); // IOException 발생 가능
			
			if(writer != null)
				writer.close(); // IOException 발생 가능
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
//		!!! try-catch를 해줘야하는 이유?		
//		Exception을 상속하는 예외는 반드시 처리를 해야 한다.(강제!) 
//		그렇지 않으면 컴파일 오류로 이어진다. 
//		runtime exception은 실행시에 예외발생 캐치하니깐,
//		강제 예외처리 대상이 아님! 컴파일은 된다는 얘기!

	}

}
