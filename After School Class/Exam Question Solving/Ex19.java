package exam;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// 어떤 숫자를 입력받고,
		// 1부터 해당 숫자까지의 홀수의 합과 짝수의 합을 구하시오
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 하나를 입력하세요 > ");
		int num = sc.nextInt();
		int jjagSum = 0; 
		int holSum = 0;
		
		for(int i = 1; i <= num; i++) {
			if(i % 2 == 0) jjagSum += i;
			else holSum += i;
		}
		System.out.printf("짝수의 합 : %d\n홀수의 합 : %d", jjagSum, holSum);
		
		sc.close();
	}
}
