package chap_02; // 연산자

public class _01_Operator1 {
	public static void main(String[] args) {
		// 연산자(Operator)
		// 피연산자(Operand)
		// 단항 연산자 : + - (타입(캐스팅)) ++ -- ~ !
		// 이항 연산자
		//	- 산술 : + - * / % << >> >>>
		//	- 비교 : > < >= <= == !=
		//	- 논리 : && || ! ^ ...
		// 대입 연산자 : =
		// 연산자의 우선 순위 주의사항
		// >> << >>> 는 덧셈 연산자보다 우선순위가 낮다
		// ||, |(OR)는 &&, &(AND)보다 우선순위가 낮다
		
		// 산술 연선 - 이항 연산
		System.out.println(4 + 2);
		System.out.println(4 - 2);
		System.out.println(4 * 2);
		System.out.println(4 / 2);
		System.out.println(5 % 2);
		System.out.println(8 % 3); // 2
		System.out.println(8 % -3); // 2
		System.out.println(-8 % 3); // -2
		System.out.println(-8 % -3); // -2
		
		// 우선순위 연산
		System.out.println(2 + 2 * 2);
		System.out.println((2 + 2) * 2);
		
		// 변수를 이용한 연산
		int num1 = 20;
		int num2 = 10;
		int result;
		
		result = num1 + num2;
		System.out.println(result); // 20 + 10 = 30
		
		result = num1 - num2;
		System.out.println(result); // 20 - 10 = 30
		
		result = num1 * num2;
		System.out.println(result); // 20 * 10 = 200
		
		result = num1 / num2;
		System.out.println(result); // 20 / 10 = 2
		
		result = num1 % num2;
		System.out.println(result); // 20 % 10 = 0
		
		// 증감 연산 ++, --
		int val;
		val = 10;
		System.out.println(val); // 10
		System.out.println(val++); // 10 // 해당 문장이 실행 완료된 후에 1 증가
		System.out.println(val); // 11
		
		
		val = 10;
		System.out.println(val); // 10
		System.out.println(++val); // 11 // 해당 문장 실행 전에 1 증가 시킨 후 문장 실행
		System.out.println(val); // 11
		
		/*
		 * 증감 연산자 위치에 따라 두 가지 유형으로 분류
		 * 
		 * 증가연산자(++) : 피연산자의 값을 1 증가시킨다
		 * 감소연산자(--) : 피연산자의 값을 1 감소시킨다
		 * 
		 * 전위형 / j = ++i; // 값이 참조되기 전에 증가시킨다.
		 * 후위형 / j = i++; // 값이 참조된 후에 증가시킨다.
		 * 
		 */
		
		val = 10; 
		System.out.println(val); // 10
		System.out.println(--val); // 9
		
		val = 10;
		System.out.println(val); // 10
		System.out.println(val--); // 10
		System.out.println(val); // 9
		
		// 은행 대기번호표
		int waiting = 0;
		System.out.println("대기 인원 : " + waiting++);
		System.out.println("대기 인원 : " + waiting++);
		System.out.println("대기 인원 : " + waiting++);
		System.out.println("총 대기 인원 : " + waiting);
	}
}
