package test;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// 2~9 중 번호를 입력받아 그 번호에 해당하는 구구단 출력
		Scanner scin = new Scanner(System.in);
		int dan = scin.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
		
		
	}
}
