package exam;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// 팩토리얼 계산기
		// ex> 5! = 5*4*3*2*1 = 120
		// 어떤 수 num을 입력받으면 그 수의 팩토리얼을 출력
		// 누적곱을 구할 땐 항상 1로 초기화 (누적합은 0)
		// 위 문제는 처음 받은 숫자로 초기화해도 상관없는 문제
		Scanner sc = new Scanner(System.in);
		
		System.out.print("팩토리얼을 구할 수를 입력하세요 > ");
		int num = sc.nextInt();
		int result = num;
		
		for(int i = num-1; i > 1; i--) {
			result *= i;
		}
		
		System.out.printf("%d!의 값은 %d", num, result);
	}
	
}
/*
 * 7 6 42  42 5 210  210 4 840  840 3 2520  2520 2 5040
 */
