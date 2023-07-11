package javaBasic;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		// UP & DOWN
		// 1부터 100 중 랜덤 숫자 받고
		// 랜덤숫자보다 크면 UP, 작으면 DOWN 응답
		// 몇번만에 찾았는지 출력
		Scanner sc= new Scanner(System.in);
		
		int ranNum = (int)(Math.random() * 100)+1;
		boolean same = false;
		int cnt = 0;

		System.out.println("What Is The Random Number? ");
		do {
			int userNum = sc.nextInt();
			if(ranNum < userNum) {
				System.out.println("DOWN!");
				cnt++;
			} else if(ranNum > userNum) {
				System.out.println("UP!");
				cnt++;
			} else {
				System.out.println("RIGHT NUMBER!");
				same = true;
			}
		}
		while(!same);
		System.out.printf("You Find The Random Number at %dth!", cnt);
		
		sc.close();
	}
}
