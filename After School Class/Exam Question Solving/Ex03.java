package test;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// 값을 하나 입력 받고, 
		// 1부터 1씩 증가하면서 누적합을 구하다가 입력 받은 값보다 커지는 순간 반복을 중단하고,
		// 그 때 마지막으로 더해진 값과 총합을 출력
		// ex > 입력: 10 ==> 1 + 2 + 3 + 4 + 5 => 출력: 5, 15
		//      입력: 1000 ==> 출력: 45, 1035
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 하나 입력하세요. ");
		int end = sc.nextInt();
		int sum = 0;
		int i = 1;
		while(true) {
			sum += i;
			if(sum > end) {
				System.out.println(i + ", " + sum);
				break;
			} else {
				i++;
			}
		}
		
	}
}
