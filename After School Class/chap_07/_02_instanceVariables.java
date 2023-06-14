package chap_07;

public class _02_instanceVariables { // 인스턴수 변수 - 객체 안에서만 사용되는 변수

	public static void main(String[] args) {

		// 첫 제품
		BlackBox b1 = new BlackBox(); // 설계도 복사
		b1.modelName = "Blacky"; // 인스턴스 변수 채워넣기 (등록)
		b1.resolutio = "FHD";
		b1.price = 20000;
		b1.color = "Black";
		
		// 출력
		System.out.println(b1.modelName);
		System.out.println(b1.resolutio);
		System.out.println(b1.price);
		System.out.println(b1.color);
		System.out.println("============");
		// 두번째 제품
		BlackBox b2 = new BlackBox();
		// 만약 위 b1에서 바꾼게 클래스에 직접적으로 쓴 것이라면 b2에 특별한 걸 넣지 않아도 Blacky가 출력되야함
		// 하지만 아래의 출력문에선 null값(비어있음)이 나옴
		// 이는 같은 클래스에서 생성된 인스턴스라도 인스턴스 변수는 인스턴스마다 각각 독립적이고 다른 인스턴스와 공유하지 않음을 뜻함
		// 변수가 생성될 때 램에서 서로 다른 공간에 할당받는 것처럼 인스턴스도 서로 다른 공간에 할당받기 때문임 
		// System.out.println(b2.modelName);
		b2.modelName = "Whity";
		b2.resolutio = "UHD";
		b2.price = 50000;
		b2.color = "Whity";
		
	}
	
}
