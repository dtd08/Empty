package chap_04;

public class _03_ElseIf {
	public static void main(String[] args) {
		/*
		 * if(조건 1) {
		 * 		// 조건 1이 true 일 때 실행되는 코드
		 * } else if (조건2) {
		 * 		// 조건 1이 false이고, 조건 2가 true 일 때 실행되는 코드
		 * } else if (조건3) {
		 * 		// 조건 1, 2가 false이고, 조건 3이 true 일 때 실행되는 코드
		 * } else {
		 * 		// 조건 1, 2, 3이 모두 false일 때 실행되는 코드
		 * }
		 */
		
		
		// 카페라떼가 있으면 카페라떼 주문
		// 카페라떼 없으면 카페모카 주문
		// 카페모카도 없으면 아메리카노 주문
		
		boolean cafelatte = false;
		boolean cafemocha = true;
		
		if(cafelatte) {
			System.out.println("카페라떼 주문!");
		} else if(cafemocha) {
			System.out.println("카페모카 주문!");
		} else {
			System.out.println("아메리카노 주문!");
		} // if문은 하나가 참이 되면 나머지는 실행하지 않는다.
		
		/*
		 * if(cafelatte) { System.out.println("카페라떼 주문!"); } else if(cafemocha) {
		 * System.out.println("카페모카 주문!"); } // if ~ else if문에서 조건이 최악의 경우일 때 if문을 2개 쓴
		 * 것과 같은 효과가 일어난다.
		 * 
		 * if(cafelatte) { System.out.println("카페라떼 주문!"); } if(cafemocha) {
		 * System.out.println("카페모카 주문!"); }
		 */
		System.out.println("커피 주문 완료 #1");
		
		
		// 음료 하나 추가!! -> else if문을 하나 더 추가한다!
		cafelatte = false;
		cafemocha = false;
		boolean tea = true;
		
		if(cafelatte) {
			System.out.println("카페라떼 주문!");
		} else if(cafemocha) {
			System.out.println("카페모카 주문!");
		} else if(tea) {
			System.out.println("차 주문!");
		} else {
			System.out.println("아메리카노 주문!");
		}
		System.out.println("커피 주문 완료 #2");
		
		// else문은 상황에 따라 없을 수 있다.
		if(cafelatte) {
			System.out.println("카페라떼 주문!");
		} else if(cafemocha) {
			System.out.println("카페모카 주문!");
		} else if(tea) {
			System.out.println("차 주문!");
		}
		System.out.println("커피 주문 완료 #3");
	}
}
