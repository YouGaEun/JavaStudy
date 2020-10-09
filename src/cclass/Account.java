package cclass;

class Account2{
	String accId;	//계좌번호 
	String name;	//이름 
	int balance;	//잔액 
	
	//출금 
	public void withdraw(int money) {
		balance -= money;
	}
	
	//입금
	public void deposit(int money) {
		balance += money;
	}
	
	public void showInfo() {
		System.out.println("계좌번호 : " + accId);
		System.out.println("이름 : " + name);
		System.out.println("잔액 : " + balance + "\n");
	}
	
	
}

public class Account {

	public static void main(String[] args) {
		Account2 acc = new Account2();
		acc.showInfo();
		
		Account2 acc2 = new Account2();
		acc.accId = "0002-1294-1820";
		acc.name = "홍길동";
		acc.balance = 10000;
		
		acc.withdraw(30000);
		acc.showInfo();
		
		acc.deposit(50000);
		System.out.println();
	}

}
