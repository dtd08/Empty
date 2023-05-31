package arrayTest;

import java.util.Scanner;

public class ArrayEx01 {
	public static void main(String[] args) {
		// 5칸 정수형 배열 생성
		// 아무 정수나 5개를 입력 받아 출력
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		
		System.out.println("정수 5개를 입력하세요.");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i : arr) System.out.print(i + " ");
	}
}
