package chap07;

public class _06_ClassMethod {
	public static void main(String[] args) {
		// 클래스명 클래스담을변수명 = new 생성자
		BlackBox2 bbox = new BlackBox2();
		bbox.modelName = "Blacky";
		bbox.color = "Black";
		bbox.resolution = "FHD";
		bbox.price = 10000;
		System.out.println(bbox.modelName + "모델 이름");		
		
		// 자동기능 개발전
		// 클래스 필드는 코드이름, 클래스 이름. 필드로 접근함
		System.out.println(BlackBox2.canAutoReport);
		bbox.canAutoReport = true;
		bbox.autoReport();
		bbox.insertMemoryCard(512);
		
		// 1. 일반 / 2. 이벤트 / 나머지. 모든 영상
		int fileCount = bbox.getVideoFileCount(1);
		System.out.println(fileCount);
		
		BlackBox2.callServiceCenter(); // 고객센터 연결
	}
}
