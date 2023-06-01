package chap;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		// char형 2차원 배열 engNums 생성
		// ZERO, ONE, TWO, THREE, FOUR, FIVE 할당
		// int형 3칸짜리 배열 num 생성
		// 0~5중 임의의 수 3개를 입력하면 그에 해당하는 영어 단어 추력
		Scanner scin = new Scanner(System.in);
		
		// 글자 할당
		char[][] engNums = {{'Z','E','R','O'}, {'O','N','E'}, {'T','W','O'}, 
				{'T','H','R','E','E'}, {'F','O','U','R'}, {'F','I','V','E'}};
				
		int[] num = new int[3];
		
		// 숫자 받기
		for(int i = 0; i < num.length; i++) {
			num[i] = scin.nextInt();
		}
				
		/* 실행은 되는데 디버그 일어남
		for(int i = 0; i < num.length; i++) {
			System.out.println(engNums[num[i]]);
		}
		*/
		
		// num 배열의 숫자에 따라 출력
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < engNums[num[i]].length; j++) {
				System.out.print(engNums[num[i]][j]);
			}
			System.out.println();
		}

	}

}
