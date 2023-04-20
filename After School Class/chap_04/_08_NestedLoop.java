package chap_04;

public class _08_NestedLoop {
	public static void main(String[] args) {
		// 이중 for문, 이중 반복문
		
		// *****  찍기
		for(int i = 0; i < 5; i++) {
			System.out.print("*");
		}
		System.out.println("\n------------");
		
		/*
		 * 	*****
		 * 	*****
		 * 	*****
		 * 	*****
		 * 	***** 찍기
		 */
		for(int i = 0; i < 5; i++) { // 큰 반복문(외부, 세로)
			for(int j = 0; j < 5; j++) { // 작은 반복문(내부, 가로)
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------");
		
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * ***** 찍기
		 * 
		 * 각 줄마다 (i,j)까지 찍기
		 */
		for(int i = 0; i < 5; i++) { // 큰 반복문(외부, 세로)
			for(int j = 0; j <= i; j++) { // 작은 반복문(내부, 가로)
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------");
	}
}
