package chap_06;

public class _07_VariableScope {
	
	public static void methodA(int number) {
		System.out.println("A메소드에서 출력 : " + number); // 값을 넘겨주지 않으면 아무것도 나오지 않음
//		System.out.println(result); // 메소드 내에서 result는 찾아볼 수 없으므로 오류가 일어남 
	}
	
	public static void methodB() {
		// 지역변수, 지역 안에서만 사용 가능함 
		// 하나의 지역은 { } 사이를 의미함
		int result = 1; 
	}
	
	public static void main(String[] args) {
		int number = 3; // 메인 메소드에서 선언한 값은 다른 메소드에서 직접적으로 참조할 수 없음
//	 	System.out.println(result); // 메인 메소드 역시 다른 메소드의 지역변수를 직접적으로 참조할 수 없음 
		
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
		}
//		System.out.println(i); 
//		i 또한 for문의 지역변수이기 때문에 for문의 { } 사이에서만 사용할 수 있다.
		
		{ 	
			// 초기화블럭
			// 잘 쓰이지 않음
			// 메인 안의 변수에 접근할 수 있으나, 블럭 안에서 선언한 변수를 밖으로 빼는건 불가능
			int j = 0;
			System.out.println(j);
			System.out.println(number);
		}
		
	}
}
