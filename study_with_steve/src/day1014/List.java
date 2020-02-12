package day1014;
//외워!!!
public interface List {
	//인터페이스마다 자료구조 따로 만들면 비효율적이야
	//그래서 제너릭 타입 써서 연산은 같고 타입만 다른 경우에 재사용성 높인다
	
	void addHead(int data);
	void addTail(int data);
	
	void removeHead();
	void removeTail();
	
	//몇번째꺼 지우겠다 꺼내겠다 등등
	void insertAt(int index, int data);
	void removeAt(int index);
	
	int getAt(int index);

}
