package exam;

import java.util.Scanner;

public class Ex21 {
	public static int area(int width, int length) {
		return width * length; 
	}
	
	public static void main(String[] args) {
		// 메소드 문제
		// 직사각형의 넓이 구하기
		// 메인에서 area 메소드 호출
		// area 메소드는 가로와 세로의 길이를 파라미터로 받아서 넓이값을 리턴해줌
		Scanner sc = new Scanner(System.in);
		
		System.out.println("직사각형의 가로와 세로의 길이를 입력하세요.");
		
		System.out.println("가로 > ");
		int width = sc.nextInt();
		
		System.out.println("세로 > ");
		int length = sc.nextInt();
		
		System.out.println("직사각형의 넓이 : " + area(width, length));
		
		sc.close();
	}
}
