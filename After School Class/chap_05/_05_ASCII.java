package chap05;

public class _05_ASCII { // American Standard Cord for Information Interchange
	public static void main(String[] args) {
		// 아스키코드 : 미국 표준 코드
		// 유니코드 : 한글, 한자 등
		
		// char는 문자의 아스키코드 값으로 저장함(출력할땐 기본적으로 문자로 바꿔서 출력해주는 것임)
		// 아스키코드를 출력하려면 int형으로 바꿔야함
		// 자료형 크기 순서
		// byte - short, char - int - long - float - double
		char c = 'A';
		System.out.println(c);
		System.out.println((int)c);
		
		c = 'B';
		System.out.println(c);
		System.out.println((int)c);
		
		c++;
		System.out.println(c);
		System.out.println((int)c);
		
		System.out.println("===========================================================");
		
		
		// 5월 2일자 수업 복습
		// 10 * 15 크기의 영화관 좌석을 배열로 구현
		// A01 ~ A15
		// ...
		// J01 ~ J15
		char seatheng = 'A';
		String seats[][] = new String[10][15];
		
		for(int i = 0; i < seats.length; i++, seatheng++) {
			for(int j = 0; j < seats[i].length; j++) {
				System.out.print(seats[i][j] = (j < 9) ? (seatheng + "0" + (j+1) + " ") : (String.valueOf(seatheng) + (j+1) + " "));
			}
			System.out.println();
		}
		// tip : ctrl + shift + f ==> 자동 줄맞춤
		
		// 5/9 자바 이수증 시험 안내
		// 시험 10문제 정도. 인터넷 끊고 이클립스로 작성, 코드를 짜고 결과값만 제출.
		// 50분 되면 작성 끝내고 구글폼에 작성 -> 그날 확인
		// 70% 정도 합격선 (경우에 따라 달라질 수 있음)
	}
}
