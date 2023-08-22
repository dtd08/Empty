package com.sungil.bank;

public class Person {
	
	// 필드
	String name;	// 이름
	int age;		// 나이
	int cashAmount; // 현금보유량
	BankAccount account; // 계좌정보
	
	Person(){}
	Person(String name, int age, int cashAmount){
		this.name = name;
		this.age = age;
		this.cashAmount = cashAmount;
	}
	
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
