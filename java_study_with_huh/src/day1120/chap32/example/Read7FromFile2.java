package day1120.chap32.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

//try-with-resource 기반!
//close()시킬 때 문제가 많아서 리소스문으로 처리해준다.

//코드를 보시면, try(...) 안에 InputStream 객체 선언 및 할당하였습니다. 
//여기에서 선언한 변수들은 try 안에서 사용할 수 있습니다. 
//코드의 실행 위치가 try 문을 벗어나면 try-with-resources는  
//try(...) 안에서 선언된 객체의 close() 메소드들을 호출합니다. 
//그래서 finally에서 close()를 명시적으로 호출해줄 필요가 없습니다.

public class Read7FromFile2 {

	public static void main(String[] args) {
		try (InputStream in = new FileInputStream("chap32file.dat")) {
			int dat = in.read();
			System.out.println(dat);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
