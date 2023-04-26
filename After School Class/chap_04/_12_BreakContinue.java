package chap04;

import java.util.Scanner;

public class _12_BreakContinue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int menu = 0;
		
		while(true) {
			System.out.println("(1) square"); // 제곱미터
			System.out.println("(2) square root"); // 제곱근
			System.out.println("(3) log"); // 로그
			System.out.print("원하는 메뉴(1~3)를 선택하세요. (종료:0) > ");
			
			String tmp = sc.nextLine();
			// 캐스팅은 기본형끼리만 가능하기 때문에 문자열을 형변환 해주는 메소드(Integer.parseInt())를 사용한다.
			menu = Integer.parseInt(tmp);
			
			if(menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				System.out.println("------------프로그램 종료-------------");
				break;
			} else if(!(menu >= 1 && menu <= 3)) { // 맞는 범위를 설정해놓고 부정처리
				System.out.println("메뉴를 잘못 선택하였습니다. (종료는 0)");
				System.out.println("=================================");
				continue;
			}
			
			System.out.println("선택하신 메뉴는 " + menu + "번 입니다.");
			System.out.println("=================================");
		}
		
		sc.close();	
	}
}
