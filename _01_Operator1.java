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
		
		
		
		
		
	}
}
