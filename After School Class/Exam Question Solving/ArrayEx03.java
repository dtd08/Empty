package arrayTest;

import java.util.Scanner;

public class ArrayEx03 {
	public static void main(String[] args) {
		// 최대 100개까지의 정수를 차례로 입력 받다가
		// 0이 입력되면 입력을 중단하고
		// 짝수번째 입력된 정수를 모두 출력하는 프로그램 작성
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[100];
		int cnt;
		
		System.out.println("숫자를 입력하세요(0 입력시 종료)");
		for(cnt = 0; cnt < arr.length; cnt++) {
			arr[cnt] = sc.nextInt();
			if(arr[cnt] == 0) break;
		}
		
		for(int i = 1; i < cnt; i+=2) { // 인덱스는 0부터 세지만, 숫자를 세는건 1부터니까 i는 1부터 시작  // 끝은 0이니까 출력되지 않게 미만으로 지정
			System.out.print(arr[i] + " ");
		}
	}
	
	
}
