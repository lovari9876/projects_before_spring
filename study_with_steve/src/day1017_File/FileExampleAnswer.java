package day1017_File;

import java.io.PrintWriter;
import java.util.*;

// 친구가 몇명인지 묻고 입력된 수 만큼 이름 입력받아 파일에 저장
public class FileExampleAnswer {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.print("Input number of your friends: ");
			int num = scanner.nextInt();
			
			PrintWriter printer = new PrintWriter("friendsNames.txt");
			for (int i = 0; i < num; i++) {
				System.out.format("Input name of your friend: ");
				
				String name = scanner.next();
				name.trim();				
				
				printer.println(name);
			}
			
			scanner.close();						
			printer.close();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
//result:
// 지정 장소에 생긴다.
// 우분투는 리눅스기에 거기서는 주소를 /로 구분!
// 윈도우는 역슬래시\
	}
}
