package chap04;

public class _Quiz_04 {
	public static void main(String[] args) {
		/*
		 * 주차요금은 시간당 4000원 (일일 최대 요금은 30000원)
		 * 경차 또는 장애인 차량은 최종 요금의 50% 할인
		 * 
		 * 일반 차량은 5시간 주차 시 20000원
		 * 경차 차량은 5시간 주차 시 10000원
		 * 
		 * 출력 결과:
		 *  주차 요금은 xx원 입니다.
		 */
		
		int hour = 10;
		boolean isSmallCar = false;
		boolean withDisablePerson = false;
		
		// 주차 요금 계산
		// 경차 또는 장애인 차량인 경우 50% 할인
		int fee = (isSmallCar || withDisablePerson) ? ((hour  * 4000)/2) : (hour * 4000); 
		
		// 30000원 초과 시 일일 최대 요금으로 수정
		if(fee > 30000) {
			fee = 30000;
		}
		
		// 실행 결과 출력
		System.out.println("주차 요금은 " + fee + "원 입니다.");
	}
}
