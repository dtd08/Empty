package chap_04;

public class _01_If {
	public static void main(String[] args) {
		// 조건문 if
		int hour = 9; // 오후 3시
		
		// 성일 카페에서 오후 2시 이전에는 아메리카노 1+1 판매
		if(hour < 14) {
			System.out.println("아메리카노 1+1");
		}
		
		/*
		 *if(조건식) {
		 *		// 실행할 코드
		 *}
		 */
		
		// if문 내에서 하나의 문장을 실행할 때는 { } 생략 가능
		if(hour < 14) System.out.println("아이스 아메리카노 1+1");
		
		// if문 내에서 2개 이상의 문장을 실행할 때는 { } 생략 불가
		if(hour < 10) {
			System.out.println("아메리카노 1+1");
			System.out.println("샷 추가!");
		}
		
		System.out.println("==============");
		
		// 오후 2시 이전, 모닝 커피를 마시지 않은 경우
		hour = 10;
		boolean morningCoffee = false;
		if(hour < 14 && morningCoffee == false) System.out.println("아메리카노 1+1");
		if(hour < 14 && !morningCoffee) System.out.println("아메리카노 1+1");
		// 위의 if문과 같은 문장이다.
		
		if(hour >= 14 || morningCoffee) System.out.println("아메리카노 500원 할인");
		
	}
}
