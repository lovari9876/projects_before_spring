package day1112.q6;

class DeepCopyTest {
	public static void main(String[] args) {
		try {
			PersonalInfo org = new PersonalInfo("James", 22, "SimpeSound", "encoding");
			PersonalInfo cpy = org.clone();

			cpy.setName("lily"); // String name이 서로 독립인지 확인
			org.showPersonalInfo();
			cpy.showPersonalInfo();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}

//결과
//=================
//이름: James
//나이: 22
//회사: SimpeSound
//업무: encoding
//이름: James
//나이: 22
//회사: SimpeSound
//업무: encoding
