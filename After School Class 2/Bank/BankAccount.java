package com.sungil.bank;

public class BankAccount {
	
	int balance; // 잔고
	// 클래스 간의 상호작용
	// Person 클래스의 필드값을 갖게 됨
	Person owner; // 소유인 
	
	
	// 이름: 입금 (deposit)
	// 파라미터: 입금할 금액(정수)
	// 리턴: 성공여부(논리형)
	boolean deposit(int amount) {
		if(amount < 0 || amount > owner.getCashAmount()) {
			System.out.println("입금에 실패했습니다.");
			System.out.printf("잔고: %d원\t현금보유량: %d원\n", balance, owner.getCashAmount());
			System.out.println();
			return false;
		}
		balance += amount;
		owner.setCashAmount(-amount);
		
		System.out.printf("%d원 입금에 성공했습니다.\n", amount);
		System.out.printf("잔고: %d원\t현금보유량: %d원\n", balance, owner.getCashAmount());
		System.out.println();
		return true;
	}
	
	
	// 이름: 출금 (withdraw)
	// 파라미터: 출금할 금액(정수)
	// 리턴: 성공여부(논리형)
	boolean withdraw(int amount) {
		if(amount < 0 || amount > balance) {
			System.out.println("출금에 실패했습니다.");
			System.out.printf("잔고: %d원\t현금보유량: %d원\n", balance, owner.getCashAmount());
			System.out.println();
			return false;
		}
		balance -= amount;
		owner.setCashAmount(-amount);
		
		System.out.printf("%d원 출금에 성공했습니다.\n", amount);
		System.out.printf("잔고: %d원\t현금보유량: %d원\n", balance, owner.getCashAmount());
		System.out.println();
		return true;
	}
	
	
	// 이름: 이체 (transfer)
	// 기능: 계좌에서 사람으로
	// 파라미터: 받는사람(Person), 이체 금액(정수)
	// 리턴: 성공여부(논리형)
	boolean transfer(Person to, int amount) {
		if(amount < 0 || amount > balance) {
			System.out.println("이체에 실패했습니다.");
			System.out.printf("잔고: %d원\t현금보유량: %d원\n", balance, owner.getCashAmount());
			System.out.println();
			return false;
		}
		
		balance -= amount;
		to.getAccount().balance += amount; //받을 사람의 계좌에 있는 잔고에 금액 추가 
		
		System.out.printf("%s님에게 %d원 이체하였습니다.\n", to.getName(), amount);
		System.out.printf("잔고: %d원\t현금보유량: %d원\n", balance, owner.getCashAmount());
		System.out.println();
		return true;
	}
	
	
	// 이름: 이체 (transfer)
	// 기능: 계좌에서 계좌로
	// 파라미터: 받는 계좌(BankAccount), 이체 금액(정수)
	// 리턴: 성공여부(논리형)
	boolean transfer(BankAccount to, int amount) {
		return transfer(to.owner, 10000);
	}
	
}




