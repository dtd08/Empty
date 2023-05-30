package exam;

public class Ex08 {
	public static void main(String[] args) {
		// 주사위 2개를 던져서 합이 6이 되는 경우를 모두 출력하시오
		int num1; 
		int num2;
		int num3;
		int cnt = 0;
		for(num1 = 1, cnt = 0; num1 <= 6; num1++) {
			for(num2 = 1; num2 <= 6; num2++) {
				if(num1 + num2 == 6) {
					cnt++;
					System.out.printf("(%d, %d)\n 총 개수: %d\n", num1, num2, cnt);
					continue;
				}// if문 끝
			}// for문2 끝
		}// for문1 끝
		
		// 주사위 3개를 던져서 합이 10이 되는 경우를 모두 출력하시오
		for(num1 = 1, cnt = 0; num1 <= 6; num1++) {
			for(num2 = 1; num2 <= 6; num2++) {
				for(num3 = 1; num3 <= 6; num3++) {
					if(num1 + num2 + num3 == 10) {
						cnt++;
						System.out.printf("(%d, %d, %d)\n 총 개수: %d\n", num1, num2, num3, cnt);
						continue; // 찾으면 나머지는 더해볼 필요가 없으니 패스
					}// if문 끝
				}//for문3 끝
			}// for문2 끝
		}// for문1 끝
		
	}//main 끝
	
}// class 끝
