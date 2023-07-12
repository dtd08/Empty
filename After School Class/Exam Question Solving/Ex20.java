package exam;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// 랜덤 자리 뽑기
		// 행과 열을 입력 받음
		// 전체 자리수 = 행 * 열
		// 랜덤한 자리로 1부터 행 * 열 까지의 수를 임의로 부여함
		// ex> 행 : 3, 열 : 3
		// 출력 ->
		// 9 7 5
		// 1 4 6
		// 3 2 8
		// 중복 불가
		Scanner sc = new Scanner(System.in);
		
		System.out.println("행과 열의 갯수를 입력하세요");
		
		System.out.println("행 > "); // 가로줄
		int row = sc.nextInt();
		
		System.out.println("열 > "); // 세로줄
		int col = sc.nextInt();
		
		int arr[] = new int[col * row]; 
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * arr.length + 1);
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			if((i+1) % col == 0) System.out.println();
		}
		
		sc.close();
		
	}
}
