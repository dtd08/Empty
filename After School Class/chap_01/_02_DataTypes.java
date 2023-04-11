package chap_01;

public class _02_DataTypes {

	public static void main(String[] args) {
		System.out.println("Hello World"); // 문자열
		System.out.println("안녕하세요?"); // 문자열
		System.out.println(12); // 정수형(int)
		System.out.println(-34); // 정수형(int)
		System.out.println(3.14); // 실수형(double)
		System.out.println('a'); // 문자형
		System.out.println(true); // boolean
		System.out.println(false); // boolean
		
		System.out.println(123 + 456); // 정수 + 정수 ==> 연산 (579)
		System.out.println("7" + 7); // 문자열 + 정수 ==> 결합 (77)
		System.out.println('7' + 7); // 문자형 + 7 ==> 문자의 아스키코드 값 + 숫자 (55 + 7 = 62)
		System.out.println('a' + 7); // 104
		System.out.println("7" + 7 + 7); // 777 
		System.out.println(7 + 7 + '7'); // 147
	}

}
