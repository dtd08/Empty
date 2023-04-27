package chap05;

public class _02_ArrayLoop {
	public static void main(String[] args) {
		
		// 배열 순회 - 순차적으로 배열의 값을 모두 돌아본다
		
		String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노"};
		
		// for문으로 순회하기 좋음
		// i : 0 -> 1 -> 2 -> 3 -> 4일때 아웃! 
		for(int i = 0; i < 4; i++) {
			System.out.println(coffees[i] + " 하나");
		}
		System.out.println("주세요!");
		
		// 배열의 길이를 알 수 없거나 너무 길 때, 배열명.length로 길이를 정해주면 편하다
		for(int i = 0; i < coffees.length; i++) {
			System.out.println(coffees[i] + " 하나");
		}
		System.out.println("주세요!");
		
		
		/*
		 * for-each 반복문
		 * 
		 * for(배열의 자료형 변수명 : 배열명) {
		 * 		반복할 문장;	
		 * }
		 * 
		 * 배열 순회를 좀 더 편하게 해주는 명령문.
		 * 배열의 값을 순차적으로 변수 안에 넣어줌.
		 */
		
		for(String coffee : coffees) {
			System.out.println(coffee + " 하나");
		}
		System.out.println("주세요!");
		
		
		double[] data = new double[5];
		
		data[0] = 10.0;
		data[1] = 12.9;
		data[2] = 10.3;
		
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}
}
