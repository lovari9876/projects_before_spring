package day1025;

import java.util.HashMap;

//맵에서 키를 모를 때 
//모든 값을 출력하는 방법
public class HashMapEx {
	public static void main(String[] args) {
		HashMap<Integer, String> errorCodeMap = new HashMap<>();
		errorCodeMap.put(400, "Internal Error");
		errorCodeMap.put(404, "Page Not Found");
		errorCodeMap.put(500, "Server Error");
		for(Integer i : errorCodeMap.keySet()) {
			//key를 set으로 설정.....
			System.out.println("key: " + i);
			System.out.println("value: "+ errorCodeMap.get(i));
		}
		
		

	}

}
