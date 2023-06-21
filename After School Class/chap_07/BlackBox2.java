package chap07;

public class BlackBox2 { // BlackBox 복습
	
	// 클래스 구성요소 : 필드, 생성자, 메소드
	
	// 필드
	// 인스턴트 필드 - 각 객체 안에서 사용되는 필드
	String modelName; // 모델명
	String resolution; // 해상도
	int price; // 가격
	String color; // 색상
	// 클래스 필드 - 모든 객체에 공통적으로 적용하는 필드
	static boolean canAutoReport = false; // 자동 신고 기능
	
	// 생성자
	// 간단하게 말하면 클래스 이름과 똑같은 메소드
	// 대문자로 시작함
	// 아래와 같이 빈 코드를 갖는 생성자를 기본생성자라고 함
	// 개발자가 생성자를 따로 쓰지 않은 경우에는 자바가 자동으로 기본생성자를 생성해 줌
	public void BlackBox2() {}
	
	// 메소드
	// 기능 담당
	// 인스턴스 메소드 - 해당 객체에서만 사용할 수 있는 메소드
	void autoReport() { // 파라미터 x, 리턴값 x
		if(canAutoReport) {
			System.out.println("충돌이 감지되어 자동으로 신고합니다.");
		} else {
			System.out.println("자동 감지 기능이 지원되지 않습니다.");
		}
	}
	
	void insertMemoryCard(int capacity) { // 파라미터 o, 리턴값 x
		System.out.println("메모리 카드가 삽입되었습니다.");
		System.out.println("용량은 " + capacity + "GB 입니다.");
	}
	
	int getVideoFileCount(int type) { // 파라미터값 o, 리턴값 o
		if(type == 1) { // 일반영상
			return 9;
		} else if (type == 2) { // 이벤트 영상
			return 2;
		} else { 
			return 11;
		}
	}

	// showDateTime : 날짜/시간 정보
	// showSpeed : 속도
	// min : 영상 기록 단위
	void record(boolean showDateTime, boolean showSpeed, int min) {
		System.out.println("녹화를 시작합니다.");
		if(showDateTime) {
			System.out.println("영상에 날짜/시간 정보가 표시됩니다.");
		}
		if(showSpeed) {
			System.out.println("영상에 속도 정보가 표시됩니다.");
		}
		System.out.printf("영상은 %d분 단위로 기록됩니다", min);
	}
	
	// 메소드 오버로딩 - 파라미터의 갯수가 다름
	void record(int min) {
		record(true, true, 5);
	}
	
	void record() {
		record(true, true, 5);
	}
	
	static void callServiceCenter() {
		System.out.println("서비스 센터(1588-0909)로 연결합니다.");
		// modelName = "Whity"; // 오류
		// 같은 클래스 안에 있지만 인스턴스 필드값은 인스턴트 생성 전에 클래스 메소드에 사용할 수 없음
		// 단, 클래스 필드값은 메모리에 항상 상주하기 때문에 인스턴스 생성 전에 사용할 수 있음
	}
}
