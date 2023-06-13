package chap06;

public class _01_Method {
	
	// 메소드는 클래스 내에 있는 함수이다. (함수: 어떤 값을 넣어서 그 결과를 출력하는 것)
	// 기능을 구현할 때 사용하고 이름은 소문자로 시작한다.
	// 자바에서는 함수는 클래스 내에서만 존재할 수 있다.
	// 그래서 자바에 한해서 함수를 메소드라고 부르기로 했다.
	
	public static void main(String[] args) {
		// main: 클래스가 실행될 때 유일하게 자동으로 실행되는 메소드
		System.out.println("main입니다");
		
		// 메소드 호출
		System.out.println("메소드 호출 전");
		hello();
		hello();
		hello();
		System.out.println("메소드 호출 후");		
		
		
	}
	
	// 메소드 정의
	public static void hello() { 
		// public은 '공용의'라는 뜻의 접근제어자로, 어디에서나 접근할 수 있음을 나타냄
		/// 또 다른 접근제어자로 같은 클래스 내에서만 쓸 수 있음을 나타내는 private가 있다.
		// static은 시작하면 지금 쓰든 쓰지 않고 있든 항상 메모리에 적재됨. 많이 쓰는 것을 메모리에 미리 적재하는 것이다.
		// void는 리턴 타입 중 하나로, 함수가 끝난 후 값을 전달하는게 없음을 뜻함
		System.out.println("Hello World!");
	}
}
