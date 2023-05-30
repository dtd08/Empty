package exam;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		// 삼각형의 빗변의 길이를 입력했을 때, 직각 삼각형이 될 수 있는지 여부를 확인하는 프로그램
		// 세 변의 길이는 100을 넘지 않으며, 정수값을 가진다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("빗변의 길이를 입력하세요 > ");
		int hypotenuse = sc.nextInt();
		
		int base = 1;
		int height = 1;
		boolean possible = false;
		
		Loop1:
		for(base = 1; base < 100; base++) {
			for(height = 1; height < 100 ; height++) {
					possible = ((base*base + height*height) == hypotenuse*hypotenuse) ? true : false;
					break Loop1;
			}
		}
		System.out.println(possible ? "가능" : "불가능");
	}
}
