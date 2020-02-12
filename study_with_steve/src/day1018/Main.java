package day1018;

import java.io.File;

public class Main {
	
	public static void main(String[] args) {
		File file;
		
		//boolean exists()
		//Tests whether the file or directory denoted by this abstract pathname exists.
		try {
			file = new File("C:\\Users\\user");
			System.out.println("exists : " + file.exists());
			System.out.println("isDirectory : " + file.isDirectory());
			System.out.println("isFile : " + file.isFile());
			
			//위의 디렉토리 내부의 리스트가 배열의 요소들이 되고
			//child는 배열의 멤버들을 하나씩 꺼내준다.
//			String[] files = file.list();
//			for (String child : files) {
//				System.out.println(child);
//			}
			
			//디렉토리인지 아닌지 윈도우 탐색기로 찾는 것처럼~~만들기!!
			//우분투에서 -R 쓰고 recursive하게 돌면서 모든 파일 찾아주는것 같은 기능 만들 수 있다~~
			File[] files = file.listFiles();
			for (File child : files) {
				System.out.format("%s, isDirectory: %b\n", child.getName(), child.isDirectory());
				}			
			} catch (Exception ex) {
			ex.printStackTrace();			
		}
	}

}
