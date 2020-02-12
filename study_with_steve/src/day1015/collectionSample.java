package day1015;

import java.util.*;

public class collectionSample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mapTest();
	}
	
	/*
	//map은 (key, value)로 구성되어있어!(value=data)
	//map의 문제점! 동명이인이면 key 값이 충돌할 수 있다.
	//겹치지 않는 키값 설정할것!
	//key -> f(x) -> 주소(=인덱스)
	//장점: 개빠르다. key알면 value 한번에 찾을 수 있어.
	//맵의 성능은 항상 O(1)이셈..
	 
	//hash function-> 어떤 데이터를 해당 해쉬값으로 바꿔준당(되게 길어~)
	//==> 위변조 파악에 유리
	//해쉬값은 보통 SHA-256을 쓰고 16진수이며 256bit이다(=32byte) 
	//문자열끼리 비교하는 것보다 문자열의 해시값끼리 비교하는 것이 훨씬 빠르다!!
	*/
	
	public static void mapTest() {
		Map<String, String> people = new HashMap<String, String>();
		//여기서는 map 만드는데에 hash를 쓴것...??
		people.put("홍길동", "1반");
		people.put("김수철", "2반");
		people.put("한국화", "3반");
		people.put("윤명길", "4반");
		people.put("강호동", "1반");
		people.put("홍길동", "3반");
		//key, 즉 여기서는 이름이 같을때 자바는 나중에 입력된 값을 덮어쓴다.
		
		for (String key : people.keySet()) {
			System.out.format("key: %s = value: %s\n", key, people.get(key));
		}
	}
	
	public static void listTest() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		//이게 바로 addTail이었던것..
		for (int i = 0; i < 10; i++)
			list.addLast(i);
		
		//내부적으로 순서 뒤집는 메소드
		Collections.reverse(list);
		//for each문 사용!!
		//컬렉션에서 하나씩 가져올때 쓴다 --> :뒤에 항상 컬렉션 관련이 와야해
		for (Integer temp : list) {
			System.out.println("temp = "+ temp);
		}
		
		//보통의 경우라면 위의 for each를 쓰는 것이 더 간단하지만!
		//만약 index도 필요하다면 반드시 밑의것 사용~~~
		for (int i = 0; i < list.size(); i++) {
			System.out.println("temp = "+ list.get(i));
		}
	}
	
	
	//랜덤값 만들때 시간값만 쓰면 중복될 가능성이 있다. 최적의 방법은 아니셈
	public static void setTest() throws Exception {
		Set<Integer> numbers = new HashSet<Integer>();
		//calendar.getInstance()
		//달력의 인스턴스를 가져온다.--> 인스턴스가져올때의 시간
		//getTimeInMIllis() : 1970년 1월 1일 0시 0분 0초부터 시작한 밀리세컨즈 단위의 시간
		Calendar c = Calendar.getInstance();
		for (int i = 1; i < 10; i++) {
			System.out.format("Thread Id: %d, Time: %d\n",
					Thread.currentThread().getId(), Calendar.getInstance().getTimeInMillis());
			
			//현재 쓰레드를 지정된 시간 만큼 잠들게(sleep, 스케쥴링을 하지 않고 수면 대기하는 것)한다.
			//밑에선 1000millisec 만큼 잠든다
			Thread.currentThread().sleep(1000);
		}
		for (int i = 1; i <= 45; i++) {
			double rand = Math.random() * Calendar.getInstance().getTimeInMillis();
			//캘린더는 하나 갖구오는거, 뒤에건 밀리세컨드 갖구오는것
			System.out.println("randem =" + (((long) rand) % 45 + 1));
			//int형 노노...롱형 고고
		}
		for (int i = 0; i < 100; i++) {
			System.out.println("Time is " + Calendar.getInstance().getTimeInMillis());
		}
				  
		while (numbers.size() < 6) {
			 double rand = Math.random() * Calendar.getInstance().getTimeInMillis();
			 //rand는 시간기준으로 만들어진다.
			 //시간은 생각보다 변화량이 적기에 중복되기 쉽다.
			 //짧은 시간안에 변화량이 크려면 시간값을 곱하면 된다.
			 //random값은 보통 중복 피하려고 시간과 맥주소 등을 더해 만든다
			 numbers.add(Math.abs((int)((long)rand) % 45) + 1);
		}
		 
		for (Integer temp : numbers) {
			System.out.println(temp);
		}
	}
}
