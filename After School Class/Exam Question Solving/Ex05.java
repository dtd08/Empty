package test;

import java.util.Scanner;
import java.util.random.*;

public class Ex05 {
	public static void main(String[] args) {
		// 1~ 100 중의 랜덤한 수를 맞추는 게임
		// ex > com = 69, player = 50 ==> UP
		//				  player = 70 ==> DOWN
		// 정답을 맞추기까지 시도한 횟수 출력
		// 사실은 do while문 쓰는 문제
		Scanner sc = new Scanner(System.in);
		int ranNum = (int)(Math.random() * 100) + 1; // Math.random : 0.0000000 ~ 0.9999999 중 랜덤한 수를 뽑음
		int player;
		int cnt = 1;
		while(true) {
			System.out.print("컴퓨터가 뽑은 숫자는 몇일까요? ");
			player = sc.nextInt();
			if(ranNum == player) {
				System.out.println("정답입니다!");
				break;
			} else if(ranNum > player) {
				System.out.println("UP");
				cnt++;
			} else {
				System.out.println("DOWN");
				cnt++;
			}
		}
		System.out.printf("시도하신 횟수는 총 %d회 입니다.", cnt);
		
		/*
		 * do {
		 * 		System.out.println("정답을 추측하세요.")
		 * 		player = sc.nextInt();
		 * 		cnt++;
		 * 		if(ranNum > player) {
					System.out.println("UP");
				} else {
					System.out.println("DOWN");
				}
		 *  } while(player != ranNum);
		 * System.out.printf("시도하신 횟수는 총 %d회 입니다.", cnt);
		 */
	}
}
