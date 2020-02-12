package day1210.networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

// 웹 브라우저 프로그래밍하는 원리!

public class URLconnection {
	public static void main(String[] args) {
		URL url = null;
		BufferedReader input = null;
		String address = "https://terms.naver.com/entry.nhn?docId=3571323&cid=59088&categoryId=59096";
		String line = "";

		try {
			url = new URL(address);

			input = new BufferedReader(new InputStreamReader(url.openStream()));
//			address 받은 url 객체의 스트림을 열어서 더 이상 읽을 것이 없을 때까지 읽어온다.
//			openStream() 하게 되면 해당 주소의 파일에다 파이프를 연결하게 되는 것!
//			소스 파일 읽어오는 것! BUT! ONLY TEXT만 긁어온다. 
//			이미지건 뭐건 다 빼고...왜? 웹 브라우저가 html파일을 읽어서 그려내는 주체인데 
//			우린 그저 읽어오라고만 했으니까......

			while ((line = input.readLine()) != null) {
				System.out.println(line);
			}
			input.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
