package day1105.example;

class AccessWay {
	static int num = 0;
	
	AccessWay() {
		incrCnt();
		}
	
	void incrCnt() {
		num++;
	}		
}

public class ClassVarAccess {
	public static void main(String[] args) {
		AccessWay way = new AccessWay(); // num = 1 
		way.num++; //외부에서 인스턴스이름 통해 접근(권장하지 않으셈..)
		// The static field AccessWay.num should be accessed in a static way
		// ;이 끝나고 num = 2
		AccessWay.num++; // 외부에서 클래스 이름 통해 접근
		// ;이 끝나고 num = 3
		System.out.println("num = " + AccessWay.num);
	}

}
