package exam;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		// 1부터 10까지의 정수 중에서 랜덤으로 뽑아오는데 세 개의 수가 서로 겹치지 않게 출력
		Scanner sc = new Scanner(System.in);
		
		int range = 10;
		int start = 1;
		int a, b, c;
//      boolean different = false;
		
		// 1부터 10까지의 정수 중에서 랜덤 숫자 뽑기
		// 0.0 ~ 0.99999999 // 1에 가까운 수(1은 안 나옴) 
		a = (int)(Math.random()*range+start); // 0.0 ~ 0.999999999*10 + 1 => (int) => 10
		b = (int)(Math.random()*range+start);
		c = (int)(Math.random()*range+start);
		
		// 숫자 안겹치게 하기
		// 내 답안
//		while(!different) {
//			if(!(a!=b && b!=c&& a!=c)) {
//				if(a==b || a==c) 
//					a = (int)(Math.random()*range+start);
//				else if(b==c) b = (int)(Math.random()*range+start);
//			} 
//			else 
//				different = true;
//		}
		
		// 다른 답안
		while(a==b || b==c || c==a) {
			a = (int)(Math.random()*range+start);
			b = (int)(Math.random()*range+start);
		}
		
		System.out.printf("%d %d %d", a, b, c);
		
	}
}
