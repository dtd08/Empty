package chap_07;

public class _04_Method {
	
	public static void main(String[] args) {
		BlackBox b1 = new BlackBox();
		b1.modelName = "Blacky";
		
		b1.autoReport();
		BlackBox.canAutoReport = true; // 자동 충돌 감지 업데이트 완료
		b1.autoReport();		
		b1.insertMemoryCard(512); // 인스턴스 메소드
		
	}
}
