package chap06;

public class _05_Overloading {

	// 메소드 오버로딩: 같은 이름의 메소드를 여러번 선언한 것
	// 오버로딩의 조건(둘 중 하나만 만족해도 됨)
	//  1. 파라미터의 타입이 다르다.
	//  2. 파라미터의 갯수가 다르다.
	// 간단 면접에서 꽤 물어볼 정도로 중요한 내용
	public static int getPower(int num) { // 조건 1. 파라미터의 타입이 다른 경우 
		int result = num * num;
		return result;
	}

	public static int getPower(String strNum) {
		int num = Integer.parseInt(strNum);
		int result = num * num;
		return result;
	}

	public static int getPower(int num, int exp) { // 조건 2. 파라미터의 갯수가 다른 경우
		int result = 1;
		for(int i = 0; i < exp; i++) result *= num;
		return result;
	}
	
	public static void main(String[] args) {
		getPower(5);
		getPower("5");
		getPower(5, 3);
	}
}
