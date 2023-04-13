package chap_01;

public class _Ex_01 {
	// 자바는 실행하면 main 메서드를 가장 먼저 찾는다
	public static void main(String[] args) {
		// 한줄 복사 Ctrl + Alt + 아래방향키
		int x = 1;
		int y = 2;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("===========");
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("===========");
		
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("===========");
	}
}
