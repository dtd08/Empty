package chap04;

public class _Ex_01 {
	public static void main(String[] args) {
		// 구구단 짝수단만 출력
		for(int i = 2; i <= 9; i+=2) {
			for(int j = 1; j <= 9; j++ ) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
	}
}
