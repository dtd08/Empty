package javaBasic;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		// 값을 하나 입력받고,
		// 1부터 1씩 증가하면서 누적합을 구하는데
		// 입력값보다 누적합이 커지는 순간 반복 중단
		// 마지막으로 더해진 값과 총합 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("값을 하나 입력하세요 > ");
		int num = sc.nextInt();
		int sum = 0;
		int i;
		
		for(i = 1; ; i++) {
			// System.out.printf("%d + %d = %d\n", sum, i, sum+i);
			sum += i;
			if(sum > num) {
				break;
			}
		}
		System.out.printf("마지막으로 더한 값 : %d\n총 누적합 : %d", i, sum);
		sc.close();
	}
}
