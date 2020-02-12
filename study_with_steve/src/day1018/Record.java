package day1018;

import java.io.*;

public class Record {
	
	private int id;
	
	private byte[] name = new byte[256];
	//쓰든 안쓰든 256바이트 쓴다링
	//처리 속도 빨라
	
	private byte[] department = new byte[256];
	
	//String 으로 설정하면 쓰는 만큼만 메모리 차지하는 대신
	// 처리속도 느리다
	//serialize를 할때-> 처리할 필드가 많을때 유리
	//char type 배열로 설정-> 고정된 길이 문자열 갖고있을 때
	//  ==> 그러나 이 때는 나중에 char -> String 등의 형변환도 필요할수도.. 
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return new String(this.name);
	}

	public void setName(String name) {
		byte[] temp = name.getBytes();
		int len = Math.min(temp.length, 256);
		System.arraycopy(temp, 0, this.name, 0, len);
	}

	public String getDepartment() {
		return new String(this.department);
	}

	//temp의 크기 모르는 데 256보다 작을 것으로 예상되는거얌.
	//소스는 256보다 크면 안되고 작을 경우 작은 그만큼만 카피해~
	public void setDepartment(String department) {
		byte[] temp = department.getBytes();
		int len = Math.min(temp.length, 256);
		System.arraycopy(temp, 0, this.department, 0, len);
		//arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
	}
	
//	public Record(RandomAccessFile file) throws IOException {
//		this.id = file.readInt();
//		
//		byte[] buffer = new byte[256];
//		file.read(buffer, 0, 256);
//		System.arraycopy(buffer, 0, name, 0, 256);
//		//byte Stream을 카피하는 것
//		//record를 serialization하는 것과 비슷한데, overhead 없고
//		//딱 필요한만큼만 사용!
//		//보통은 클래스 메소드에서 사용한다.
//	}
	
	public static Record creatFromFile (RandomAccessFile file) throws IOException {
		Record record = new Record();
		
		record.id = file.readInt();
		file.read(record.name, 0, 256);
		file.read(record.department, 0, 256);
		
		return record;
	}
	
	public void writeToFile(RandomAccessFile file) throws IOException {
		file.writeInt(this.id);
		file.write(this.name, 0, 256);
		file.write(this.department, 0, 256);
	}

	@Override
	public String toString() {
		return id + " " + getName() + " " + getDepartment();
	}	
		
}









