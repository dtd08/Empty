package chap_07;

public class _04_Method {
	
	public static void main(String[] args) {
		BlackBox b1 = new BlackBox();
		b1.modelName = "Blacky";
		
		b1.autoReport(); // 인스턴스 메소드
		BlackBox.canAutoReport = true; // 자동 충돌 감지 업데이트 완료
		b1.autoReport();		
		b1.insertMemoryCard(512); // 메모리 카드 삽입

		// 일반 영상 : 1 (type)
		// 이벤트 영상(충돌 감지) : 2
		int fileCount = b1.getVideoFileCount(1); // 일반 영상
		System.out.println("일반 영상 파일 수 : " + fileCount + "개");

		fileCount = b1.getVideoFileCount(2);
		System.out.println("이벤트 영상 파일 수 : " + fileCount + "개");
	}
}
