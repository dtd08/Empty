package chap05;

public class _04_MultiArrayLoop {
	public static void main(String[] args) {
		// 다차원 배열 순회
		System.out.println("seats 1");
		String seats[][] = {
				{"A1","A2","A3","A4","A5"}, 
				{"B1","B2","B3","B4","B5"}, 
				{"C1","C2","C3","C4","C5"}
			};
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(seats[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\n========================\n");
		System.out.println("seats 2");
		
		String[][] seats2 = new String[10][15];
		char ch = 'A'; // 시트 행
		
		for(int i = 0; i < seats2.length; i++, ch++) { // 행이 바뀔때마다 시트열 교체 
			for(int j = 0; j < seats2[i].length; j++) {
				seats2[i][j] = ch + "" + (j+1) + " "; // 문자 + 숫자 ==> 문자	// ch + 숫자 ==> 아스키코드
			}
		}
		// 표 구매
		seats2[7][8] = "XX ";
		seats2[7][9] = "XXX ";
		
		// 출력
		for(int i = 0; i < seats2.length; i++) {
			for(int j = 0; j < seats2[i].length; j++) {
				System.out.print(seats2[i][j]);
			}
			System.out.println();
		}
		
		
	}
}
