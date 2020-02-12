package day1018;

import java.io.*;

public class RandomAccess {
	
	public static void main(String[] args) {
		Record record = new Record();
		record.setId(1000);
		record.setName("steve park");
		record.setDepartment("Java");
		System.out.println(record);
		
		record.setName("steve paa");
		System.out.println(record);
		
		writeRecord(record);
		readRecord();
	}
	
	public static void readRecord() {
		RandomAccessFile file = null;
		
		try {
			//read mode: "r"
			//write mode: "w"
			file = new RandomAccessFile("db.dat", "r");
			Record record = Record.creatFromFile(file);	
			System.out.println(record);
		} catch (Exception ex) {
			ex.printStackTrace();			
		} finally {
			System.out.println("레코드 읽기를 완료하였습니다.");
			//마지막 처리... 파일 닫아준다.
			
			try {
				if (file != null) {
					file.close();
				}
			} catch (Exception ex) {
				ex.printStackTrace();			
			}	 
		}
	}
	
	public static void writeRecord(Record record) {
		RandomAccessFile file = null;
		
		try {
			//read mode: "r"
			//write mode: "w"
			file = new RandomAccessFile("db.dat", "rw");
			record.writeToFile(file);			
		} catch (Exception ex) {
			ex.printStackTrace();			
		} finally {
			System.out.println("레코드를 저장하였습니다.");
			//마지막 처리... 파일 닫아준다.
			
			try {
				if (file != null) {
					file.close();
				}
			} catch (Exception ex) {
				ex.printStackTrace();			
			}	 
		}
	}
	
	public static void randomAccessFile() {
		RandomAccessFile file = null;
		
		try {
			//read mode: "r"
			//write mode: "w"
			file = new RandomAccessFile("db.dat", "rw");
						
			//현재 파일 사이즈는?
			//endOfFile character가 있는 곳까지
//			long length()
//			: Returns the length of the file denoted by this abstract pathname.
			System.out.format("file size: %d\n", file.length());
						
			//현재 파일 포인터의 위치는?
			System.out.format("current position: %d\n", file.getFilePointer());
			
			// file offset 변경은? -> 1000번째로 옮긴것
			file.seek(1000);
			System.out.println("after seek(1000)");
			
			//현재 파일 사이즈는?
			System.out.format("file size: %d\n", file.length());
						
			//현재 파일 포인터의 위치는?
			System.out.format("current position: %d\n", file.getFilePointer());

		} catch (Exception ex) {
			ex.printStackTrace();			
		} finally {
			System.out.println("레코드를 저장하였습니다.");
			//마지막 처리... 파일 닫아준다.
			
			try {
				if (file != null) {
					file.close();
				}
			} catch (Exception ex) {
				ex.printStackTrace();			
			}	 
		}
	}
		
}








