package com.sungil.bank;

public class Person {
	
	// 필드
	private String name;	// 이름
	private int age;		// 나이
	private int cashAmount; // 현금보유량
	private BankAccount account; // 계좌정보

	// 이름
	public void setName(String newName) {
		if(newName != null) {
			name = newName;
		} else {
			System.out.println("성함을 입력해주세요.");
		}
	}
	
	public String getName() {
		return name;
	}
	
	// 나이
	public void setAge(int newAge) {
		if(newAge > 0) {
			age = newAge;
		} else {
			System.out.println("올바른 나이를 입력하세요.");
		}
	}
	
	public int getAge() {
		return age;
	}
	
	// 현금보유량
	public void setCashAmount(int newCashAmount) {
		if(newCashAmount > 0) {
			cashAmount = newCashAmount;
		} else {
			System.out.println("올바른 금액을 입력하세요.");
		}
	}
	
	public int getCashAmount() {return cashAmount;}
	
	public void setAccount(BankAccount account) {
		this.account = account; 
	}
	
	public BankAccount getAccount() {return account;}
	
	
	// 이름: 송금 (transfer)
	// 기능: 사람에서 사람으로
	// 파라미터: 받는사람(Person), 이체 금액(정수)
	// 리턴: 성공여부(논리형)
	boolean transfer(Person to, int amount) {
		if(amount < 0 || amount > account.balance) {
			System.out.println("송금에 실패했습니다.");
			System.out.printf("잔고: %d원\t현금보유량: %d원\n", account.balance, account.owner.cashAmount);
			System.out.println();
			return false;
		}
		account.balance -= amount;
		to.account.balance += amount; 	// 받을 사람의 계좌에 있는 잔고에 금액 추가 
		
		System.out.printf("%s님에게 %d원 송금하였습니다.\n", to.name, amount);
		System.out.printf("잔고: %d원\t현금보유량: %d원\n", account.balance, account.owner.cashAmount);
		System.out.println();
		return true;
	}
		
		
	// 이름: 송금 (transfer)
	// 기능: 사람에서 계좌으로
	// 파라미터: 받는 계좌(BankAccount), 이체 금액(정수)
	// 리턴: 성공여부(논리형)
	boolean transfer(BankAccount to, int amount) {
		return transfer(to.owner, 10000);
	}
}
