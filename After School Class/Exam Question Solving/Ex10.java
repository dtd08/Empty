package exam;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		// 파이 계산하기
		// pi = (4/1) - (4/3) + (4/5) - (4/7) + (4/9) - (4/11) + (4/13) - (4/15)...
		Scanner sc = new Scanner(System.in);
		
		System.out.println("반복횟수를 입력하세요 > ");
		double num = sc.nextDouble();
		
		double pi = 0;
		
		for(double i =1; i <=num; i +=2) {
			pi += (4/i);
			pi *= -1;
		}
		System.out.println((pi < 0) ? (pi*(-1)):(pi));
	}
}
