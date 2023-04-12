package chap_02;

public class _04_Operator4 {
	public static void main(String[] args) {
		// 논리 연산자
		boolean 치킨 = false;
		boolean 피자 = true;
		boolean 탕수육 = true;
		
		// &&(and)
		System.out.println(치킨 && 피자 && 탕수육); // 최고의 식단 -> 모두 true일 때 true
		
		// ||(or)
		// 엔터 위에 \\\\\ 쉬프트를 누른 상태에서 |||||
		System.out.println(치킨 || 피자 || 탕수육); // 괜찮은 식단 -> 하나라도 true면 true
		
		System.out.println("==============");
		
		// And 연산
		System.out.println((5 > 3) && (3 > 1)); // true && true -> true
		System.out.println((5 < 3) && (3 > 1)); // false 인 순간 뒤에 연산은 하지 않고 false  
		// ㄴ 앞에 식이 false인데 왜 쓰냐 계산 안할건데 --> 노란줄
		
		// Or 연산
		System.out.println((5 > 3) || (3 > 1)); // true || true -> true
		System.out.println((5 < 3) || (3 > 1)); // false || true -> true
		System.out.println((5 < 3) || (3 < 1)); // false || false -> false 
		
		//System.out.println(1 < 3 < 5); 묶어서 쓰는 수식은 불가능하다
		System.out.println((1 < 3) && (3 < 5));
		
		// ! (논리 부정 연산자, not)
		System.out.println(!true); // false
		System.out.println(!false); // true
		System.out.println(!(5 == 5)); // false
		System.out.println(!(5 == 3)); // true
	}
}
