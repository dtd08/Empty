package javaBasic;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		// 팩토리얼 계산기
		// 어떤 수 num을 입력받으면 그 수의 팩토리얼 출력
		// 1 * 2 * 3 * 4 * 5...
		Scanner sc = new Scanner(System.in);
		
		int fact = 1;
		System.out.println("Enter The Factorial > ");
		int num = sc.nextInt();
		
		while(num > 1) {
			fact *= num;
			num--;
		}
		System.out.println(fact);
		
		sc.close();
	}
}
