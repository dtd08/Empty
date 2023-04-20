package chap_04;

public class _06_While {
	public static void main(String[] args) {
		/*
		 * 반복문 while
		 * 
		 * while(조건식) {
		 * 		// 조건이 참일때 반복되는 코드
		 * 		// 증감(단, 무한루프를 의도적으로 돌릴때는 제외)
		 * }
		 * 
		 * 주로 반복횟수를 세거나, 반복횟수가 명확하지 않을때 사용
		 */
		
		// 수영장에서 수영을 하는 모습
		int distance = 25; // 전체 거리 25m
		int move = 0; // 전체 이동 거리 0m
		int cnt = 0;
		
		while(move < distance) {
			System.out.println("스트로크를 합니다.");
			System.out.println("현재 이동 거리 : " + move + "m");
			move += 3; // 3미터 이동
			cnt++;
		}
		System.out.println(cnt + "초에 도착!!");
		
		// 무한루프를 돌릴때도 있는데 빠져나오려면 break문을 써준다.
		distance = 150;
		move = 0;
		while(move < distance) {
			System.out.println("스트로크를 합니다.");
			System.out.println("현재 이동 거리 : " + move + "m");
			move += 3;
			if(move == 15) break;
		}
		
		
	}
}
