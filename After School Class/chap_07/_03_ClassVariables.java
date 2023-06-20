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

		// 여담으로 String도 클래스인데 별도의 선언 과정 없이 쓸 수 있는 이유는
		// String을 워낙 자주 써서 자바가 그냥 기본적으로 제공해주기 때문이다.
		String str = "자바";
		String str2 = new String();
		str2 = "파이썬";
	}
}
