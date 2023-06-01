package arrayTest;

import java.util.Scanner;

public class ArrayEx04 {
	public static void main(String[] args) {
		// 100개의 정수를 저장할 수 있는 배열을 선언하고
		// 정수를 차례로 입력하다가 0이 입력되면
		// 입력을 멈추고 가장 마지막에 입력된 수 부터 역순으로 출력하시오
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[100];
		int cnt;

		System.out.println("숫자를 입력하세요(0 입력시 종료)");
		for(cnt = 0; cnt < arr.length; cnt++) {
			arr[cnt] = sc.nextInt();
			if(arr[cnt] == 0) break;
		}
		for(int i = cnt-1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
