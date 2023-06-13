package chap_06;

public class _06_WhenToUse {
	// 메소드가 필요한 이유 
	//  1. 반복되는 코드의 중복을 줄일 수 있음
	//  2. 수정사항이 발생할 시 유지보수가 편함(중요)
	
	public static int getPower(int number) { // 메소드 오버로딩
		// 제곱은 자주 쓰니까 따로 지수 숫자를 넣지 않아도 계산해주는 메소드임
//		int result = number * number;
//		return result;
		
		// 메소드 안에서 다른 메소드 호출이 가능함
		// 코드의 재활용 (객체지향 언어에서 중요한 단어) 
		// 제일 큰 메소드한테 부족한 부분은 채워서 넘긴 후 값을 돌려줌
		// 현실에서 외주 맡기는거랑 비슷함
		return getPower(number, 2); 
	}
	
	public static int getPower(int number, int exponent) {
		int result = 1;
		for(int i = 0; i < exponent; i++) {
			result *= number;
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		/* 메소드 없이 구현할 경우
		 * 
		 * // 2의 2제곱 구하기 
		 * int result = 1; 
		 * for (int i = 0; i < 2; i++) { result *= 2; }
		 * System.out.println("메인에서 코드 실행: " + result);
		 * 
		 * // 3의 3제곱 구하기 
		 * result = 1; 
		 * for (int i = 0; i < 3; i++) { result *= 3; }
		 * System.out.println("메인에서 코드 실행: " + result);
		 * 
		 * // 4의 2제곱 구하기 
		 * result = 1; 
		 * for (int i = 0; i < 2; i++) { result *= 4; }
		 * System.out.println("메인에서 코드 실행: " + result);
		 */
		
		// 메소드로 구현할 경우
		System.out.println("메소드 호출하여 실행 : " +getPower(2, 2));
		System.out.println("메소드 호출하여 실행 : " + getPower(3, 3));
		System.out.println("메소드 호출하여 실행 : " + getPower(4, 2));
		
		// 11의 제곱 구하기
		System.out.println(getPower(11));
		
	}
}
