package test;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// 랜덤하게 입력받은 정수만큼 성적을 입력받아서 총점과 평균을 출력하시오
		// 총 0명의 학생의 총점은 00점이고, 평균은 00.0점입니다
		
		/* 
		 * 1 홍길동 90
		 * 2 장발장 99
		 * 3 로미오 100
		 * 
		 * 인간의 관점 => 점수를 전부 입력 받고 90 + 99 + 100
		 * 
		 * 컴퓨터의 관점 => 
		 * 첫번째 값 입력 - 90 -> sum = 90
		 * 두번째 값 입력 - 99 -> sum = 90 + 99
		 * 세번째 값 입력 - 100 -> sum = 90 + 99 + 100
		 * 
		*/
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇 명의 성적을 입력받겠습니까?");
		int student = sc.nextInt();
		
		int total = 0;
		
		for(int i = 1; i <= student; i++) {
			System.out.printf("%d번째 학생의 성적을 입력하세요", i);
			total += sc.nextInt();
		}
		// %.소수점자리f == 소수점 두 자리수까지 출력
		System.out.printf("총 %d명의 학생의 총점은 %d점이고, 평균은 %.1f점입니다", student, total, (double)total/student);
	}
}
