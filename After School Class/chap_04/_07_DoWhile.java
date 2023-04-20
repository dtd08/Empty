package chap_04;

public class _07_DoWhile {
	public static void main(String[] args) {
		/*
		 * 반복문 do~while
		 * 
		 * do {
		 * 		// 실행될 코드
		 * 		// 증감식
		 * } 
		 * while(조건식);
		 * 
		 * 조건식이 참이든 거짓이든 최소 한 번은 무조건 실행한다.
		 * 쓸 일이 많진 않음
		 */
		
		int distance = 25;
		int move = 0;
		while(move < distance) {
			System.out.println("스트로크를 합니다.");
			System.out.println("현재 이동 거리 : " + move);
			move += 3;
		} 
		System.out.println("while 종료");
		
		do {
			System.out.println("스트로크를 합니다.");
			System.out.println("현재 이동 거리 : " + move);
			move += 3;
		} while(move < distance);
		System.out.println("do~while 종료");
	}
}
