package chap_06;

import java.util.Scanner;

public class _Prog_Calculator {
	
	public static int plus(int num1, int num2) { // 더하기
		int result = num1 + num2;
		return result;
	}
	
	public static int minus(int num1, int num2) { // 빼기
		int result = num1 - num2;
		return result;
	}

	public static int mul(int num1, int num2) { // 곱하기
		int result = num1 * num2;
		return result;
	}
	
	public static double divide(int num1, int num2) { // 나누기
		if (num2 == 0 ) {
			System.out.println("분모에 0이 올 수 없습니다!");
			return 0;
		}
		double result = (double)num1 / num2;
		return result;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자 종류(+,-,*,/) : ");
		String oper = sc.next();
		
		switch(oper) {
			case "+":
				System.out.println(plus(num1, num2));
				break;
			case "-":
				System.out.println(minus(num1, num2));
				break;
			case "*":
				System.out.println(mul(num1, num2));
				break;
			case "/":
				System.out.println(divide(num1, num2));
				break;
			default:
				System.out.println("error : 잘못된 연산자입니다.");
		}
		
		sc.close();
	}
}
