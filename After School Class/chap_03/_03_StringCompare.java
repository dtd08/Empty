package chap_03;

public class _03_StringCompare {
	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Python";
		String s3 = "java";
		
		// 문자열 비교를 할 때는 == 대신 equals()를 쓴다.
		System.out.println(s1.equals(s2)); // 대소문자까지 구별해서 같은지 비교
		System.out.println(s1.equals(s3));
		System.out.println(s1.toUpperCase().equals(s2.toUpperCase())); // 대문자로 통일해서 비교
		System.out.println(s1.toUpperCase().equals(s3.toUpperCase()));
		System.out.println(s1.equalsIgnoreCase(s2)); // 대소문자 관계 없이 비교
		System.out.println(s1.equalsIgnoreCase(s3)); // 대소문자 관계 없이 비교
		
		
		System.out.println("===============");
		
		
		s1 = "1234";
		s2 = "1234";
		System.out.println(s1.equals(s2)); // 내용 비교
		System.out.println(s1 == s2); // 참조값(주소값) 비교
		// 동일한 값이 들어가니 주소가 같은 곳을 가리켜서 ==을 해도 true가 나옴
		
		s1 = new String("1234");
		s2 = new String("1234");
		
		System.out.println(s1.equals(s2)); // 내용 비교
		System.out.println(s1 == s2); // 참조값(주소값) 비교
		// 객체를 따로따로 생성했기 때문에 값이 들어있는 주소도 달라짐 ==> 주소값 비교 false
		
	}
}
