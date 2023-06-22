package games.word;

import java.util.Scanner;

public class WordGameApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String startWord = "성일정보고";
		
		System.out.println("끝말잇기 게임을 시작합니다!");
		System.out.println("게임에 참여하는 인원은 몇 명입니까? > ");
		int playerNum = sc.nextInt();
		
		// 문자열 타입의 3칸짜리 배열 strArr
		// String strArr[] = new String[3];
		
		// Player 클래스도 String처럼 참조형 타입으로 볼 수 있음
		// 문자열 타입의 배열을 만들듯이 Player 타입의 배열도 만들 수 있음
		Player play[] = new Player[playerNum]; // 매우 중요한 내용
		
		for(int i = 0; i < play.length; i++) {
			System.out.println("참가자의 이름을 입력하세요 > ");
			play[i] = new Player(); // 배열 안에 객체 생성하기
			play[i].name = sc.next();
		}
		
		System.out.printf("시작하는 단어는 %s 입니다.\n", startWord);
		
		int i = 0, j = 0;
		// i는 현재 차례, j는 나누기 위한 값
		while(true) {
			 i = j % playerNum; // 현재 차례
			 int lastIndex = startWord.length() - 1;
			 char lastChar = startWord.charAt(lastIndex);
			 
			 System.out.print(play[i].name + " > ");
			 play[i].speakWord();
			 
			 boolean counting = play[i].chkSuccess(lastChar);
			 
			 if(!counting) {
				 System.out.println(play[i].name + "님 탈락!");
				 break;
			 }
			 
			 startWord = play[i].word;
			 j++;
		}
		
		sc.close();
	}
}
