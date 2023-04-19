package chap_04;

public class _02_Else {
	public static void main(String[] args) {
		/*
		 * if(조건식) {
		 * 		// 조건식이 true일 때 실행되는 코드
		 * }
		 * 
		 * if(조건식) {
		 * 		// 조건식이 true일 대 실행되는 코드
		 * } else {
		 * 		// 조건식이 false 일 때 실행되는 코드
		 * }
		 */
		
		int hour = 14;
		
		if(hour < 14) System.out.println("아메리카노 1+1");
		if(hour >= 14) System.out.println("카페라떼 1+1");
		// if문 2개 --> 결과를 알아내기 위해 루트를 2번 돌음
		
		if(hour < 14) {
			System.out.println("아메리카노 1+1");
		} else {
			System.out.println("카페라떼 1+1");
		}
		// if ~ else --> 결과를 위해 루트를 한번 돌고 거짓이면 else 실행 --> 1번 돌음
		
		
		// 실행되는 코드가 1개일 때는 {} 생략이 가능하다.
		if(hour < 14) System.out.println("아메리카노 1+1");
		else System.out.println("카페라떼 1+1");
		
	}
}
