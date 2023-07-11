package javaBasic;

import java.util.Scanner;

public class Ex18_1 {
	public static void main(String[] args) {
		// 세련된 팩토리얼 계산기
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int result = factorial(num);
		
		System.out.println(result);
		sc.close();
	}
	
	// 재귀함수
	// 세련되긴 하지만 너무 큰 숫자의 처리는 과부하가 걸릴 수 있음
	public static int factorial(int num) {
		if(num == 1) {
			return 1;
		}
		return num * factorial(num-1); 
	}
}
