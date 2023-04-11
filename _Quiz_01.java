package chap_01;

public class _Quiz_01 {
	public static void main(String[] args) {
		// 변수의 선언과 할당
		// 기본 데이터 타입의 종류, 참조형 데이터 타입
		
		// 버스 번호 (1234, 성남08)
		String busNo = "성남08";
		
		// 남은 시간 (3분, 5분) - 정수형
		int minute = 3;
		
		// 남은 거리 (1.5km, 0.8km) - 실수형
		double distance = 1.2;
		
		// 결과 출력
		// 성남08번 버스
		// 약 3분 후 도착
		// 남은 거리 1.2 km
		System.out.println(busNo + "번 버스");
		System.out.println("약 " + minute + "분 후 도착"); 
		System.out.println("남은 거리는 " + distance + "km");
		
		
	}
}
