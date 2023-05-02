package chap05;

public class _01_Array {
	public static void main(String[] args) {
		//배열 : 같은 자료형의 여러개의 값을 저장하는 연속된 공간
		//		자료를 순차적으로 관리하는 구조
		
		// 학생 100명의 ID를 부여하려고 함
		int stuId01 = 11101;
		int stuId02 = 11102;
		int stuId03 = 11103;
		
		int stuId100 = 31530;
		// 하나하나 선언하면 비효율적임
		
		// 배열 선언
		int stuId[] = new int[100];
		stuId[0] = 11101;
		stuId[1] = 11102;
		stuId[99] = 31530;
		
		
		
		// 친구들의 의견을 모아서 커피를 주문하려 함 
		String coffeeRoss = "아메리카노";
		String coffeeRachel = "카페모카";
		String coffeeChandler = "라떼";
		String coffeeMonica = "카푸치노";
		
		System.out.println(coffeeRoss + " 하나");
		System.out.println(coffeeRachel + " 하나");
		System.out.println(coffeeChandler + " 하나");
		System.out.println(coffeeMonica + " 하나");
		System.out.println("주세요!");
		
		
		// 배열 선언의 첫번째 방법
		
		// 자료형[] 배열명 = new 자료형[배열의 크기];
		// 혹은 자료형 배열명[] = new 자료형[배열의 크기];
		// 선언 때 무조건 크기가 정해져야 함
		String[] coffees = new String[4];
		
		// 선언된 배열의 값 할당
		// 배열의 특징 : index를 갖는다. (0이 시작, 배열의길이-1이 마지막 index번호)
		coffees[0] = "아메리카노";
		coffees[1] = "카페모카";
		coffees[2] = "라떼";
		coffees[3] = "카푸치노";
		
		
		// 배열 선언 두번째 방법
		
		// 배열 선언 및 할당 1
		String coffees2[]= new String[] {"아메리카노", "카페모카", "라떼", "카푸치노"};
//		String coffees2[]= new String[4] {"아메리카노", "카페모카", "라떼", "카푸치노"}; 불가!
		
		// 배열 선언 및 할당 2
		String coffees3[] = {"아메리카노", "카페모카", "라떼", "카푸치노"};
				
		System.out.println(coffees[0]);
		System.out.println(coffees[1]);
		// 라떼 -> 에스프레소
		coffees[2] = "에스프레소";
		System.out.println(coffees[2]);
		System.out.println(coffees[3]);
		System.out.println("주세요!");
		
		
		// 배열 선언 및 할당시 주의할 점
		// 배열의 데이터 타입과 이름만 선언은 가능함
		// 단, 타입과 이름만으로 선언한 경우 값을 할당할 때, new String[] 을 생략할 수 없다
		String[] coffees4;
		// coffees4 = {"아메리카노", "카페모카", "라떼", "카푸치노"}; 오류
		coffees4 = new String[] {"아메리카노", "카페모카", "라떼", "카푸치노"};
		
		
		
		// 다른 자료형?
		int []i = new int[3];
		i[0] = 1;
		i[1] = 2;
		i[2] = 3;
		// i[3] = 4; 이클립스에서 실행 전 오류를 잡아내진 못하지만 실행 후엔 오류가 뜸 ==> 오류!
		
		double[] d = new double[] {10.0, 12.5, 19.2};
		boolean[] b = {true, true, false};
		// 가능
		
		/* 정리
		 * 배열: 자료를 순차적으로 관리하는 구조, 같은 자료형의 여러개의 값을 저장하는 연속된 공간
		 * 선언법:
		 * 		1. 선언만
		 * 		 ==> 자료형 배열명[] = new 자료형[배열의 크기];
		 * 		 ==> 자료형[] 배열명 = new 자료형[배열의 크기];
		 * 		2. 선언과 할당 동시에(초기화)
		 * 		 ==> 자료형 배열명[] = new 자료형[] {값1, 값2, 값3 ... };
		 * 		 ==> 자료형 배열명[] = {값1, 값2, 값3 ... };
		 * 		 ==> 자료형 배열명[]
		 * 			 배열명 = new 자료형[] {값1, 값2, 값3 ... };
		 * 특징 및 주의점: 
		 * 		1. 0부터 시작하는 index를 갖는다. (방번호는 0 ~ 배열의길이-1 까지이다.)
		 * 		2. 선언 때 무조건 크기가 정해져야 한다.
		 * 		3. 배열의 데이터 타입과 이름만 선언은 가능다만, 값을 할당할 때 new 자료형[] 을 생략할 수 없다.
		 * 장점: 
		 * 		1. 반복문을 통해 값을 수정하거나 넣고 빼기가 편하다.
		 * 		2. 여러개의 값을 사용할 수 있다.
		 * 단점: 
		 * 		1. 배열에서 값이 빠진다고 값의 방번호가 땡겨지지 않는다.
		 * 		2. 처음 선언한 배열의 길이 이상의 값을 넣을 수 없다.
		 */
		
		
	}

}
