package day1101.java_bank;

public class BankAccount {
	//메모리 4byte 할당
	int balance = 0; // 예금 잔액

	public int deposit(int amount) {
		balance += amount;
		return balance;
	}

	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}

	public int checkMyBalance() {
		System.out.println("잔액: " + balance);
		return balance;
	}
	//통장정리 하듯이~ 잔고확인!
}
