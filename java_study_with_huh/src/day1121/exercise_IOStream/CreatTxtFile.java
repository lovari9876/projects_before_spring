package day1121.exercise_IOStream;

import java.io.*;

public class CreatTxtFile {
	public static void main(String[] args) {
		try(PrintWriter out = 
				new PrintWriter(new BufferedOutputStream
						(new FileOutputStream("LowToUp.txt")));) {
			String s = "I'm so TIRED... It's HARD to learn.\n";
		// "I'm so TIRED... It's HARD to learn."
		out.write(s);
		out.flush();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}		
	}
}
