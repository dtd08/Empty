package chap_02;

public class _03_Operator3 {
	
	public static void main(String[] args) {
		// 비교 연산자 ( >, >=, <, <=, ==, !=)
		// 반환형이 boolean
		System.out.println(5 > 3); // 5는 3보다 크다. (참이면 true, 거짓이면 false)
		System.out.println(5 >= 3); // 5는 3보다 크거나 같다. (참이면 true, 거짓이면 false)
		System.out.println(5 >= 7); // 5는 7보다 크다. (참이면 true, 거짓이면 false)
		
		System.out.println(5 < 3); // 5는 3보다 작다. (참이면 true, 거짓이면 false)
		System.out.println(5 <= 3); // 5는 3보다 작거나 같다. (참이면 true, 거짓이면 false)
		
		System.out.println(5 == 5); // 5는 5와 같다. (참이면 true, 거짓이면 false)
		System.out.println(5 == 3); // 5는 3과 같다. (참이면 true, 거짓이면 false)
		System.out.println(5 == 5); // 5는 5와 다르다. (참이면 true, 거짓이면 false)
		System.out.println(5 != 3); // 5는 3과 다르다. (참이면 true, 거짓이면 false)
		
		
		// 참조형 데이터 타입에서는 비교 연산자를 사용할 수 있을까?
		String s = "가나다";
		String t = "라마바";
		
		// 오류
		// System.out.println(s > t);
		// System.out.println(s >= t);
		// System.out.println(s < t);
		// System.out.println(s <= t);
		
		System.out.println(s == t);
		System.out.println(s != t);
		// 참조형은 ==와 !=만 사용할 수 있다.
		// 참조형은 변수에 주소를 담고 있으므로 ==이나 !=를 쓰면 주소를 비교하게 된다
		// 참조형은 equals()라는 메소드를 사용한다

		// char형
		System.out.println('A' < 'B');  
		// A는 아스키코드 값이 65이고, B는 66이기 때문에 65 < 66으로 변경해서 생각해보면 된다
		
		System.out.println('0' == 0 ); 
		// '0'의 아스키코드 값은 48
		// 때문에 48 == 0 꼴이므로 false
		
		
		// 실수 타입
		System.out.println(10.d == 10.0f);
		// 10.0d == 10.0f --> 10.0d == 10.0d ==> true
		
		System.out.println(0.1d == 0.1f); 
		// 0.1d == 0.1f --> 0.1d == 0.1d ==> false
		
		System.out.println(0.1d);
		System.out.println(0.1f);
		System.out.println((double)0.1f);
		// float에서 double로 형변환 되면 소숫점 뒷자리 값이 0이 아니면 값은 추가될 수 있다
		
		
	}
}
