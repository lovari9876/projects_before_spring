package day1017_File;

import java.io.*;
import java.util.*;

public class FileReadingT {

	public static void main(String[] args) {
		reader("C:\\Users\\user\\git\\Javasample\\CsvReader\\sample.csv");
	}
	
	public static void reader(String fileName) {
		List<String[]> rows = new ArrayList<String[]>();
		
		try {
			FileReader fileReader = new FileReader(fileName) ;
			BufferedReader reader = new BufferedReader(fileReader);
			String line;
			
			while ((line = reader.readLine()) != null) {
				String[] cols = line.split(",");
				System.out.format("cols: %d, First: %s\n", cols.length, cols[0]);
			}
			reader.close();
			fileReader.close();		
		} catch (Exception ex) {
			ex.printStackTrace();			
		}
	}
}
