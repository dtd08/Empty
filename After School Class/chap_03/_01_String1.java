package chap_03;

public class _01_String1 {
	public static void main(String[] args) {
		String s = "I like Java and Python and C.";
		System.out.println(s);
		
		// 문자열의 길이 - length()
		System.out.println(s.length());
		
		// 대소문자 변환 - upper(대) lower(소)
		System.out.println(s.toUpperCase()); // 전부 대문자
		System.out.println(s.toLowerCase()); // 전부 소문자
		
		// 포함관계 - contains
		// 문자열 안에 찾는 문자가 있는지 확인
		System.out.println(s.contains("Java")); // 포함한다면 true
		System.out.println(s.contains("C++")); // 포함하지 않으면 false
		System.out.println(s.indexOf("Java")); // 문자열의 위치 반환(7 반환)
		System.out.println(s.indexOf("C#")); // 문자열의 위치 반환(없으면 -1 반환)
		System.out.println(s.indexOf("and")); // 문자열의 위치 반환(여러개 있는 단어면 처음 위치 12 반환)
		System.out.println(s.lastIndexOf("and")); // 문자열의 위치 반환(마지막 위치 23 반환)
		System.out.println(s.startsWith("I like")); // 이 문자열로 시작하면 true, 아니면 false
		System.out.println(s.endsWith("C.")); // 이 문자열로 끝나면 true, 아니면 false
		
		
		
		
		
		
	}
}
