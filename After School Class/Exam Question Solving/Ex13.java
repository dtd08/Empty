package javaBasic;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		// 2~9 중 번호를 입력받아 그 번호에 해당하는 구구단 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Dan > ");
		int dan = sc.nextInt();
		
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
		
		sc.close();
	}
}
