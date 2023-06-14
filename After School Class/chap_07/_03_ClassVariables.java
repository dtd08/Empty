package chap_07;

public class _03_ClassVariables {
	
	public static void main(String[] args) {
		BlackBox b1 = new BlackBox();
		b1.modelName = "Blacky";
//		b1.canAutoReport = false;
		
		BlackBox b2 = new BlackBox();
		b2.modelName = "Whity";
//		b2.canAutoReport = false;
		
		// 특정 범위를 초과하는 충돌 감지 시 자동신고 기능 개발 여부
		System.out.println(" == 개발 전 == ");
		System.out.println(b1.modelName + " 자동 신고 기능 : " + b1.canAutoReport);
		System.out.println(b2.modelName + " 자동 신고 기능 : " + b1.canAutoReport);
		
		// 기능 개발 완료
		System.out.println(" == 개발 후 == ");
//		b1.canAutoReport = true;
//		b2.canAutoReport = true;
		BlackBox.canAutoReport = true; // 클래스 변수 접근 : 클래스명.클래스변수명
		System.out.println(b1.modelName + " 자동 신고 기능 : " + b1.canAutoReport);
		System.out.println(b2.modelName + " 자동 신고 기능 : " + b1.canAutoReport);

	}
}
