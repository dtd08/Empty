package chap_02;

public class _05_Operator5 {
	public static void main(String[] args) {
		// 삼항 연산자
		// 결과 = (조건) ? (참일 경우 결과값) : (거짓일 경우 결과값)
		// 가장 기본적인 if문
		int x = 3;
		int y = 5;
		int max = (x > y) ? x : y;
		System.out.println(max);
		
		int min = (x > y) ? x : y;
		System.out.println(min);
		
		boolean b = (x > y) ? true : false;
		System.out.println(b);
		
		String s = (x != y) ? "다르다" : "같다";
		System.out.println(s);
		
		System.out.println((x > y) ? x : y);
		
		int num = -10;
		// 삼항연산자를 num 값이 음수 양수 상관없이 절대값을 계산해서 absNum에 넣으시오.
		int absNum = (num < 0) ? -num : num ; // 절대값
		System.out.println(absNum);
		
	}
}
