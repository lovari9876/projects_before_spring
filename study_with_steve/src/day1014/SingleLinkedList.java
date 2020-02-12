package day1014;


public class SingleLinkedList implements List {
	class Node {
		//inner class
		private int data;
		private Node next;
		//다음에 가리킬 주소를 next로 설정
		
		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}
	
	//헤드, 테일 설정
	private Node head;
	private Node tail;
	
	//생성자
	public SingleLinkedList() {
		this.head = null;
		this.tail = null;
		//reverse 연산 쉽게 하려고 tail 이 있당
	}
	
	//오른쪽 버튼 source가서 override/implement method 들어가서 자동 적용 고고+

	@Override //(override 되었다고 표시하는거얌..)
	public void addHead(int data) {
		// TODO Auto-generated method stub(토막)
		Node newNode/*현재헤드*/ = new Node(data, this.head);
		if (this.head == null)
			this.tail = newNode;
		//null일때 새로 뉴노드 만들면 head = tail이얌
		
		this.head = newNode;
	}

	@Override
	public void addTail(int data) {
		// TODO Auto-generated method stub
		Node newNode = new Node(data, null);
		if (this.head == null)
			this.head = newNode;
		else {
			this.tail.next = newNode;
			//node를 이너클래스로 만들었기에 .next접근가능
		}
		this.tail = newNode;
	}

	@Override
	public void removeHead() {
		// TODO Auto-generated method stub
		if (this.head == null)
			return;
		
		this.head = this.head.next;
		if (this.head == null)
			this.tail = null;
		//this.head == null, this.tail != null 일수있음
		//this.head != null
	}

	@Override
	public void removeTail() {
		// TODO Auto-generated method stub
		if (this.head == null)
			return;
		//조건 해당시 끝내고 이 메소드 안해
		
		Node prev = this.head;
		while (prev.next != this.tail)
			prev = prev.next;
		
		prev.next = null;
		this.tail = prev;
	}
	
	public int size() {
		int count = 0;
		//head가 null이면 count는 null이다.
		Node next = this.head;
		while (next != null) {
			next = next.next;
			count++;
		}
		return count;
	}
	
	@Override
	public void insertAt(int index, int data) {
		// TODO Auto-generated method stub
		int count = size();
		if (index < 0 || index > count) {
			throw new IndexOutOfBoundsException();
		}
		//index에 넣을 위치를 숫자로 입력하면 그 자리가 들어갈자리
		
		//삽입할 위치의 다음놈과 이전놈 정하기
		Node next = this.head;
		Node prev = null;
		while (index > 0) {
			prev = next;
			next = prev.next;
			index--;
		}
		//there are 4 cases below.
		//if prev is null and next is null, list is empty
		//if prev is null and next is not null, add a new node to head.
		
		//if prev is not null and next is null, add a new node as tail
		//if prev is not null and next is not null
		
		Node newNode = new Node(data, next);
		if (prev == null) {
		//무조건 헤드에 넣을래
			//if count is 0,
			if (next == null) {
				//헤드도 테일도 없는 상태
				this.tail = newNode;
			}//next가 null이 아닐땐 이미 다음을 가리키고 있어. else 필요없다.
			this.head = newNode;
			//if (prev == null)이면 항상 this.head = newNode이다.
		} else {
		//머리말고 나머지에 넣을래
			prev.next = newNode;
			if (next == null) {
				//꼬리에 넣을래
				//이전값이 현재꼬리야, 그럼 뉴노드 넣을때 새 꼬리는 뉴노드가 된다.
				this.tail = newNode;
			}
		}
	}

	@Override
	public void removeAt(int index) {
		// TODO Auto-generated method stub
		int count = size();
		if (count == 0 || index < 0 || index >= count) {
			//count가 0이면 data없으니까 어떤값넣든지 OutOfBound
			throw new IndexOutOfBoundsException();
		}
		
		//제거할 노드찾기
		Node next = this.head;
		Node prev = null;
		while (index > 0) {
			prev = next;
			next = next.next;
			index--;			
		}
		
		if (prev == null) {
		//머리에서 제거한다.
			if (next.next == null) {
				//next.next == null --> 마지막 노드였어
				//다음노드가 없다면 tail은 null가리킨다.
				this.tail = null;
			} 
			this.head = next.next;
		} else {
			if (next.next == null) {
				//내가 없애려는 노드가 마지막 노드얌..
				this.tail = prev;
			}
			prev.next = next.next;
		}
		
				
		return next.data;

	}

	@Override
	public int getAt(int index) {
		// TODO Auto-generated method stub
		int count = size();
		if (count == 0 || index < 0 || index >= count) {
			//count가 0이면 data없으니까 어떤값넣든지 OutOfBound
			throw new IndexOutOfBoundsException();
		}
		Node next = this.head;
		while (index > 0) {
			next = next.next;
			index--;
			
		}
		return next.data;
		
	}
}
