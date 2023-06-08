package chap06;

public class _02_Parameter {
	
	// 전달값이 있는 메소드
	// 어떤 수의 제곱 구하는 함수
	public static void power(int num) { // num => Parameter, 매개변수 
		int result = num * num;
		System.out.printf("%d의 2제곱은 %d이다.\n", num, result);
	}
	
	public static void powerByExp(int num, int exp) { // exp값에 따라 제곱승이 올라가는 함수
		int result = 1;
		for(int i = 0; i < exp; i++) {
			result *= num;
		}
		System.out.printf("%d의 %d제곱은 %d이다.\n", num, exp, result);
	}
	
	public static void main(String[] args) {
		power(5); // 데이터 타입에 맞는 인자(Argument, 인수)값이 들어가지 않으면 오류
		
		powerByExp(4, 7);
		powerByExp(2, 3);
		powerByExp(6, 0);
	}
}
