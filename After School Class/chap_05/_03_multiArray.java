package chap05;

public class _03_multiArray {
	public static void main(String[] args) {
		/* 
		 * 다차원 배열 - 2차원 배열 
		 * : 배열 안에 배열
		 * 선언
		 * - 자료형[][] 배열명 또는 자료형 배열명[][] = new 자료형[행(세로)의 길이][열(가로)의 길이];
		 * 할당
		 * - 배열명 = { {첫번째 행의 열에 들어가는 값1, 2, 3, 4 ...}, {두번째 행	" }, {세번째 행 " } };
		 * 초기화
		 * - 자료형[][] 배열명 (또는 자료형 배열명[][]) = { {}, {}, {} }
		 * 팁
		 * - 각 열의 길이를 달리해도 상관없음.
		 *
		 * 소규모 영화관 좌석
		 * A1 ~ A5
		 * B1 ~ B5
		 * C1 ~ C5
		 */ 
		
		// 다차원 배열 없이 한다면? --> 각 열을 각각의 배열로 따로 만들어야함
		String seatA[] = {"A1","A2","A3","A4","A5"};
		String seatB[] = {"B1","B2","B3","B4","B5"};
		String seatC[] = {"C1","C2","C3","C4","C5"};
		
		// 2차원 배열을 쓰면?
		// 한곳에 할당 가능
		String seats[][] = {
				{"A1","A2","A3","A4","A5"}, 
				{"B1","B2","B3","B4","B5"}, 
				{"C1","C2","C3","C4","C5"}
			};
		
		// B2에 접근하려면?
		System.out.println(seats[1][1]);
		
		// C5에 접근하려면?
		System.out.println(seats[2][4]);
		
		String seats2[][] = {
				{"A1","A2","A3"}, 
				{"B1","B2","B3","B4"}, 
				{"C1","C2","C3","C4","C5"}
			};
		
		// A3 값에 접근하려면?
		System.out.println(seats2[0][2]);
		
		// 3차원 배열을 만들려면?
		String[][][] three = new String[3][3][3];
	}
}
