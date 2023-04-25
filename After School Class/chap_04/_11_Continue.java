package chap04;

public class _11_Continue {
	public static void main(String[] args) {
		/*
		 * Continue
		 * 
		 * 치킨 주문 손님중에 노쇼 손님이 있다고 가정
		 */
		int max = 20; // 치킨 최대 판매 수량
		int sold = 0; // 현재 치킨 판매 수량
		int noShow = 17; // 대기번호 17번이 노쇼
		
		// for문
		for(int i = 1; i < 50; i++) {
			System.out.println(i + "번 손님 주문하신 치킨 나왔습니다.");
			
			// 손님이 없다면?
			if(i == noShow) {
				System.out.println(i + "번 손님, 자리에 계시지 않아 다음 손님에게 기회가 넘어갑니다.");
				continue; // 밑에 코드는 무시하고 반복문의 처음으로 이동
			}
			sold++; // 판매처리
			
			if(sold == max) {
				System.out.println("금일 재료가 모두 소진되었습니다.");
				break;
			}
		}
		
	}
}
