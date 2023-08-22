package com.sungil.bank;

public class BankDriver {
	
	public static void main(String[] args) {
		
		// 인스턴스를 생성하기 위해서는 생성자를 사용해야함
		// 지금은 생성자를 인스턴스를 생성하는 메소드 정도로 생각하면 됨
		// 생성자는 new 키워드와 함께 클래스 이름과 동일한 이름으로 쓴다
		
		Person p1 = new Person();
		p1.name = "Ashe";
		p1.age = 24;
		p1.cashAmount = 50000;
		
		Person p2 = new Person();
		p2.name = "David";
		p2.age = 21;
		p2.cashAmount = 20000;
//		System.out.println(p1.name);
//		System.out.println(p1.age);
//		System.out.println(p1.cashAmount);
		
		BankAccount a1 = new BankAccount();
		BankAccount a2 = new BankAccount();
		a1.balance = 100000;
		a2.balance = 60000;
//		System.out.println(a1.balance);
		
		// 두 객체의 관계 설정
		p1.account = a1;
		a1.owner = p1;
		
		p2.account = a2;
		a2.owner = p2;
		
		
		// 테스트
		// ***님의 계좌 잔액은 00000원 입니다.
		// account가 두 클래스를 이어주는 매개체 역할을 함
		System.out.println(p1.name + "님의 계좌 잔액은 " + p1.account.balance + "원 입니다.\n");
		
		// 입금 테스트
		a1.deposit(20000);
		p1.account.deposit(20000);
		
		// 출금 테스트
		a1.withdraw(30000);
		p1.account.withdraw(30000);
		
		// 이체 테스트
		// 계좌에서 사람에게
		a1.transfer(p2, 10000);
		p1.account.transfer(p2, 10000);
		
		// 계좌에서 계좌에게
		a1.transfer(p2.account, 10000);
		p1.account.transfer(a2, 10000);
	}
}
