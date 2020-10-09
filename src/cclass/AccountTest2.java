package cclass;

class Account22{
	String accId;
	String name;
	int balance;
	
	Account22(String p_accId, String p_name, int p_balance){
		accId = p_accId;
		name = p_name;
		balance = p_balance;
	}
	
	public void withdraw(int money) {
		balance -= money;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void showInfo() {
		System.out.println("계좌번호 : " + accId);
		System.out.println("이름 : " + name);
		System.out.println("잔액 : " + balance + "\n");
	}
}

public class AccountTest2 {

	public static void main(String[] args) {
		Account22 ac = new Account22("020-283-3901", "홍길동", 100000);
		ac.showInfo();
		
		ac.deposit(5000);
		System.out.println("현재 잔액 " + ac.balance);
		
		ac.accId = "031-3984-1029";
		ac.name = "홍기응";
		ac.balance = 50000;
		
		ac.showInfo();
	}

}
