package day1101.example.java_bank;

public class DufRef {
	public static void main(String[] args) {
		BankAccount ref1 = new BankAccount();
		BankAccount ref2 = ref1;
		//ref2는 ref1의 인스턴스를 참조한다.
		//어떤 메소드 가져와서 어떤 수를 파라미터로 넣든지간에
		//결국 ref2는 ref1의 모든것을 복사할 뿐이다.
		//메소드(지역 변수) {} 있을 때 , 참조형변수를 지역변수로 선언하고 
		//거기에 실제 쓸 객체 대입할 때 활용가능!!!
		
		ref1.deposit(3000);
		ref2.deposit(2000);
		ref1.withdraw(400);
		ref2.withdraw(300);
		ref1.checkMyBalance();
		ref2.checkMyBalance();
	}
}
