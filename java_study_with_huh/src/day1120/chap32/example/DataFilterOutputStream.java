package day1120.chap32.example;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// 기본자료형을 저장할 때 쓰는 보조 스트림: DataOutputStream

public class DataFilterOutputStream {

	public static void main(String[] args) {
		try(DataOutputStream out = new DataOutputStream(new FileOutputStream("fileOrg.txt"))) {
			out.writeInt(370); // int형 데이터 저장
			out.writeDouble(3.14); // double형 데이터 저장
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
