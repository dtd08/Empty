package arrayTest;

import java.util.Scanner;

public class ArrayEx02 {
	public static void main(String[] args) {
		// 10칸짜리 정수형 배열(nums) 선언 후 임의의 정수값 10개 입력 받기
		// 3칸짜리 정수형 배열(except) 선언 후 1~10의 숫자 중 임의의 숫자 3개 입력 받기
		// except 배열에 있는 숫자번째에 해당하는 nums 배열의 값을 출력
		// ex> 3, 6, 9 => nums의 3번째 6번재 9번째 값을 출력
		Scanner sc = new Scanner(System.in);
		
		int nums[] = new int[10];
		int except[] = new int[3];
		
		System.out.println("정수 10개를 입력하세요.");
		for(int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		
		System.out.println("출력하고자 하는 3개의 위치를 입력하세요.");
		for(int i = 0; i < except.length; i++) {
			except[i] = sc.nextInt();
		}
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[except[i-1]-1]);
		}
		
	}
}
