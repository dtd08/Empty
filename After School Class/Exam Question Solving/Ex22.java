package exam;

import java.util.Scanner;

public class Ex22 {
	public static int add(int n1, int n2) {
		return n1 + n2;
	}
	public static int minus(int n1, int n2) {
		return n1 - n2;
	}
	public static int multi(int n1, int n2) {
		return n1 * n2;
	}
	public static double div(double n1, double n2) {
		return n1 / n2;
	}
	
	public static void main(String[] args) {
		// 메소드 문제
		// 계산기 
		// 두 개의 정수 입력
		// 사칙연산 선택 ( + - * / )
		// add, minus, multi, div 메소드를 만들어서 계산된 결과 리턴받아 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 2개를 입력하세요 > ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		System.out.println("연산자를 고르세요 (+ - * /) >");
		String oper = sc.next();
		
		System.out.print("결과 : ");
		switch(oper) {
		case "+":
			System.out.println(add(n1, n2));
			break;
		case "-":
			System.out.println(minus(n1, n2));
			break;
		case "*":
			System.out.println(multi(n1, n2));
			break;
		case "/":
			System.out.println(div(n1, n2));
			break;
		default:
			System.out.println("잘못입력되었습니다.");
		}
		
		sc.close();
		
	}
}
