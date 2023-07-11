package javaBasic;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		// 어떤 정수 n을 입력받고
		// 1부터 홀수를 차례대로 더하면서 합이 n보다 크면 그 때까지 더한 홀수의 갯수와 그 합을 구하시오
		// ex> 입력 : 1000 / 출력 32, 1024
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 하나를 입력하세요 > ");
		int n = sc.nextInt();
		int sum = 0;
		int cnt = 0;
		
		for(int i = 1; sum <= n; i+=2,cnt++) {
			sum += i;
		}
		System.out.println(cnt + ", " + sum);
		
		sc.close();
	}
}
