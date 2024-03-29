package games;

import java.util.Scanner;

public class BaseBall {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 숫자 찍기 게임
		// 1~9 숫자 중 랜덤으로 세 개의 수를 감춤
		// 스트라이크의 조건 : 자리 같음, 숫자 같음
		// 볼 조건 : 자리 다름, 숫자 같음
		// 아웃 조건 : 자리 다름, 숫자 다름
		
		// 랜덤으로 뽑은 수를 저장하기 위한 배열
		int randomNum[] = new int[3];
		// 유저가 입력한 수를 저장하기 위한 배열
		int userNum[] = new int[3];
		// 스트라이크와 볼의 개수를 저장하기 위한 변수
		int strike = 0;
		int ball = 0;
		
		
		// 1단계 : 반복문을 이용하여 randomNum에 수 할당
		// 2단계 : 입력받은 수 3개가 서로 다르도록 할당
		// Math.random() : 0.0000 ~ 0.99999
		
		/* 내 코드
		boolean same = true;
		while(same) {
			randomNum[0] = (int)(Math.random() * 9) + 1;
			randomNum[1] = (int)(Math.random() * 9) + 1;
			randomNum[2] = (int)(Math.random() * 9) + 1;
			System.out.println(randomNum[0] + " " + randomNum[1] + " " + randomNum[2]);
			if(randomNum[0] != randomNum[1] && randomNum[1] != randomNum[2] && randomNum[0] != randomNum[2]) same = false;
		}*/
		
		for(int i = 0; i < randomNum.length; i++) {
			randomNum[i] = (int)(Math.random() * 9) + 1;
			for(int j = 0; j < i; j++) {
				if(randomNum[j] == randomNum[i]) { // 첫번째 인덱스 값이 두번째 인덱스 값이랑 똑같냐 
					i--; // 같으면 뒤로 돌려서 다시 할당받게 하기
					break;
				}
			}
		}
		
		while(true) {
			// user의 입력값 처리
			System.out.println("수 3개를 입력하세요 > ");
			for(int i = 0; i < userNum.length; i++) {
				userNum[i] = sc.nextInt();
				for(int j = 0; j < i; j++) {
					if(userNum[j] == userNum[i]) {
						System.out.println("중복된 숫자는 입력하실 수 없습니다. 다시 입력해주세요");
						i--;
						break;
					}
				}
			}
			
			for(int n : userNum) System.out.print(n + " ");
			System.out.println();
			
			// ranNum과 userNum 비교
			for(int i = 0; i < randomNum.length; i++) {
				for(int j = 0; j < userNum.length; j++) {
					if(randomNum[i] == userNum[j]) {
						if(i == j) {
							strike += 1;
						}
						else {
							ball += 1;
						}
					}
				}
				
			}
			
			// 결과 안내
			System.out.printf("%d스트라이크 %d볼\n", strike, ball);
			
			// 무한루프 깨기
			if(strike == 3) {
				System.out.println("정답입니다!");
				break;
			} else {
				strike = 0;
				ball = 0;
			}
			
		}
		sc.close();
	}
}
