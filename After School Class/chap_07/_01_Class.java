package chap_07;

public class _01_Class {

	public static void main(String[] args) {
		// C언어 - 인기있는 언어, 대표적인 절차형 언어
		// 현실은 여러 객체가 상호작용하는데 C언어로 이를 구현하려니 어려움이 생김
		// 때문에 이를 보완한 객체지향 언어(Java, c++, C#)가 개발됨
		// 예를 들어 자동차를 움직이려면 사람 객체와 자동차 객체가 상호작용을 하여 움직여야함
		// 이처럼 현실의 모든 사물, 사람을 객체로 구현한 것이 객체지향 언어
		// 객체지향의 장점
		//  - 쉬운 유지 보수
		//  - 높은 재사용성
		
		
		// 예시
		// 차량용 블랙박스
		// 모델명, 해상도, 가격, 색상
		
		// 첫 번째 제품
		String modelName = "까망이";
		String resolution = "FHD";
		int price = 20000;
		String color = "블랙";
		
		// 두 번째 제품
		String modelName2 = "하양이";
		String resolution2 = "UHD";
		int price2 = 50000;
		String color2 = "화이트";
		
		// 위의 방식으로 새로운 제품을 또 만든다면 변수를 또 다시 만들어야 함
		// 이런 상태에서 유지보수를 하기에 어려움
		// 또, 변수 이름을 짓기도 불편함
		// 때문에 유사한 것을 모아서 하나의 클래스로 만듦
		// 클래스는 하나의 설계도라고 생각하면 됨
		// 만약 설계도를 수정하고 싶으면 설계도를 복사해서 그 곳에 수정함
		// 클래스도 마찬가지로 가져다 쓰려면 하나 복사해서 써줌
		
		// 클래스 객체 생성 방법	: 클래스명 클래스참조변수명 = new 클래스명();
		// 클래스를 가져다가 객체를 만드는 과정을 인스턴스화 라고 함
		
		// BlackBox의 클래스로부터 bbox 객체 생성
		// bbox 객체는 BlackBox 클래스의 인스턴스
		// BlackBox == 설계도, bbox == 제품
		BlackBox bbox = new BlackBox(); // 인스턴스화
		BlackBox bbox2 = new BlackBox();
		
		
		
	}
}
