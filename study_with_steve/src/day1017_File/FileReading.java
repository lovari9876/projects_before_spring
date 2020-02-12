package day1017_File;

import java.io.File;
import java.io.PrintWriter;
import java.util.*;

public class FileReading {
	public static void main(String[] args) {
		writeFile();
		readFile();
	}
		
		
	public static void writeFile() {	
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

	}	
	
	public static void readFile() {
		try {
			File file = new File("friends.txt");
			if (!file.exists())
				return;
			Scanner scanner = new Scanner(file);
			
			while (scanner.hasNext()) {
				String name = scanner.next();
				System.out.format("name: %s\n", name);
			}
			scanner.close();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} 
	}
}
