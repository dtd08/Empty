package chap_02;

public class _Ex_01 {
	public static void main(String[] args) {
		// 변수 num 값에 따라 "양수", "음수", "0"을 출력하는 문제
		// 삼항 연산자 사용
		int num = 0;
		System.out.println((num >= 0) ? ((num != 0) ? "양수" : "0") : "음수");
		
	}
}
