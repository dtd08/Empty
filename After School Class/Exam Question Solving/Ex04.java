package test;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// 어떤 정수 n을 입력 받고,
		// 1부터 홀수를 차례대로 더해 나가면서 합이 n보다 크면 그 때까지 더한 홀수의 개수와 그 합을 구하시오
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 하나 입력하세요. ");
		int n = sc.nextInt();
		int sum = 0;
		int cnt = 0;
		for(int i = 1;; i+=2) {
			if(sum > n) {
				break;
			}
			cnt++;
			sum += i;
		}
		System.out.println(cnt + ", " + sum);
		
	}
}
