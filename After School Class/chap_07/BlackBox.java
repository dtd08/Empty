package chap_07;

public class BlackBox { // 클래스 실습용 클래스
	// 누가 갖다 쓰기 위한 클래스이기 때문에 main이 딱히 필요없고 바로 쓰면 됨
	
	// 클래스의 구성요소 - 필드
	// 클래스의 변수라고 생각하면 됨
	String modelName; // 모델명
	String resolutio; // 해상도
	int price; // 가격
	String color; // 색상
	
	// 자동 신고 기능 
	// 일정 충격량 이상의 사고가 발생했을때 영상과 위치를 119에 전송하는 기능  
	// boolean canAutoReport;
	
	// canAutoReport는 시작이 무조건 false인데 하나 만들때마다 일일이 넣는건 귀찮음
	// 모든 값에 똑같이 들어가는 것을 인스턴스 변수로 만들자니 너무 비효율적임
	// 때문에 같은 클래스를 사용하는 인스턴스에서 공통적으로 필요한 변수는 클래스 변수로 생성함
	
	// 클래스 변수 :static 자료형 변수명
	// 클래스 변수는 모든 인스턴스에서 공통으로 사용함
	static boolean canAutoReport = false;
	
	// 자동 충돌 감지 기능 여부 안내
	void AutoReport() {
		if(canAutoReport)
			System.out.println("충돌 감지 기능이 활성화 되었습니다.");
		else
			System.out.println("충돌 감지 기능이 활성화 되지 않았습니다.");
	}
	
	// 메모리카드 삽입 기능
	void insertMemoryCard(int capacity) {
		System.out.println("메모리 카드가 삽입되었습니다.");
		System.out.printf("용량은 %d GB 입니다.\n", capacity);
	}
	
	
}
