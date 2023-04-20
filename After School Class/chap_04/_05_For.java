package chap_04;

public class _05_For {
	public static void main(String[] args) {
		/* 반복문 
		 for(초기화; 조건식; 증감값) {
		 	// 조건이 참일때 반복될 코드
		 }
		 주로 반복할 횟수가 명확할 때 사용
		 특히 배열에서 자주 사용
		 */
		
		// 성일 매장
		System.out.println("어서오세요. 성일 매장입니다.");
		// 또 다른 손님이 들어온다면?
		System.out.println("어서오세요. 성일 매장입니다.");
		System.out.println("어서오세요. 성일 매장입니다.");
		System.out.println("어서오세요. 성일 매장입니다.");
		// 만약에 인사말이 바뀌면?
		System.out.println("환영합니다. 성일 매장입니다.");
		System.out.println("환영합니다. 성일 매장입니다.");
		System.out.println("환영합니다. 성일 매장입니다.");
		// 매장 이름이 바뀌면?
		// 성일매장 - 소프트매장
		System.out.println("환영합니다. 소프트매장입니다.");
		System.out.println("환영합니다. 소프트매장입니다.");
		System.out.println("환영합니다. 소프트매장입니다.");
		
		// 코드가 만 줄이 넘는 상황이고, 모든 코드에 대해 단순히 수정을 하는 상황이라면?
		// 많은 시간이 걸리고, 단순한 작업으로 인한 집중력 저하로 실수가 발생할 수 있다.
		// 그래서 반복문이 필요하다!!
		
		
		// 반복분 예제
		
		// 1부터 10까지
		// i를 숫자라 생각할게 아니라, 반복횟수라고 생각하자
		for(int i = 0; i < 10; i++) {
			System.out.println(i+1);
		}
		
		// 위에 저 많은 출력문들을 반복문으로 나타내면?
		for(int i = 0; i < 10; i++) {
			// System.out.println("어서오세요. 성일매장입니다.");
			// System.out.println("환영합니다. 성일매장입니다.");
			System.out.println("환영합니다. 소프트매장입니다.");
		}

		// int j = 10;
		// int j = 20;
		// 오류
		// 왜 for문에서는 같은 이름의 변수를 초기화 값으로 써도 될까?
		// for문을 쓰면 for문만의 메모리를 할당해줌 --> 반복이 끝나면 해당 메모리를 드랍(삭제)시키기 때문에 for문 안에 있던 변수도 사라지기 때문에 다른 for문에 같은 변수를 써도 된다
		
		// 단 for문 바깥쪽에 선언한 변수는 다른 for문에서 초기화하면 오류가 뜸
		int j;
		for(j = 0; j < 10; j++) {
			System.out.println(j);
		}
		/*
		  for(int j = 0; j < 10; j++) { // 오류 }
		 */
		
		// 1부터 10까지의 정수 중 짝수만 출력하시오
		// 기본
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) System.out.println(i);
		}
		// 꼬아보기
		for(int i = 0; i < 10; i++) {
			if(i % 2 != 0) System.out.println(i+1);  
		}
		// 편한 방법
		for(int i = 2; i <= 10; i += 2) {
			System.out.println(i);
		}
		
		// 거꾸로 10부터 1까지 출력!!
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		
		// 1부터 100까지의 합을 구하시오
		int total = 0;
		for(int i = 1; i <= 100; i++) {
			total += i;
		}
		System.out.println("1부터 100까지의 합: " + total);
		
	}
}
