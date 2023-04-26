package chap04;

import java.util.Scanner;

public class _14_NameLoopEX {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int menu = 0;
		int num = 0;
		
		outer:
		while(true) {
			System.out.println("(1) square"); // 제곱
			System.out.println("(2) square root"); // 제곱근
			System.out.println("(3) log"); // 로그
			System.out.print("원하는 메뉴(1~3)를 선택하세요. (종료 : 0) > ");
			
			String tmp = sc.nextLine();
			menu = Integer.parseInt(tmp);
			// menu = sc.nextInt();
			// 사실 이걸로 끝나는데 문자열을 숫자로 바꾸는 연습을 위해 이렇게 씀
			// 문자열이 예외처리를 하기 쉽고, 실무에서는 대부분의 데이터가 문자열이기 때문에 연습해두는게 좋음 
			
			if(menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if(!(menu >= 1 && menu <= 3)) {
				System.out.println("메뉴를 잘못 선택하셨습니다. (종료는 0)");
				continue;
			}
			// for문의 무한루프 --> 초기값과 조건식, 증감식을 넣지 않는다
			for(;;) {
				System.out.println("계산할 값을 입력하세요. (계산종료: 0, 전체종료: 99) > ");
				tmp = sc.nextLine();
				num = Integer.parseInt(tmp);
				
				if(num == 0) {
					break;
				}
				if(num == 99) {
					System.out.println("프로그램을 종료합니다.");
					break outer; // while문 종료
				}
				
				switch(menu) {
					case 1:
						System.out.println("result = " + num * num);
						System.out.println("----------------------");
						break;
					case 2:
						System.out.println("result = " + Math.sqrt(num));
						System.out.println("----------------------");
						break;
					case 3:
						System.out.println("result = " + Math.log(num));
						System.out.println("----------------------");
						break;
				}
			}
			
		}
		sc.close();
	}
}
