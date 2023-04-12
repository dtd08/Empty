package chap_02;

public class _02_Operator2 {
	
	public static void main(String[] args) {
		// 대입 연산자
		// 오른쪽에 있는 값을 왼쪽에 대입한다
		int num = 10;
		
		// 대입 연산자는 우선순위가 최하위다
		num = num + 2;
		System.out.println(num); // 12
		num = num - 2;
		System.out.println(num); // 10
		num = num * 2;
		System.out.println(num); // 20
		num = num / 2;
		System.out.println(num); // 10
		num = num % 2;
		System.out.println(num); // 0
		
		
		// 복합 대입 연산자
		num = 10;
		
		//num = num + 2;
		num += 2;
		System.out.println(num); // 12
		// num = num - 2;
		num -= 2;
		System.out.println(num); // 10
		//num = num * 2;
		num *= 2;
		System.out.println(num); // 20
		// num = num / 2;
		num /= 2;
		System.out.println(num); // 10
		// num = num % 2;
		num %= 2;
		System.out.println(num); // 0
		
	}
}
