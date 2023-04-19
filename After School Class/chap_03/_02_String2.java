package chap_03;

public class _02_String2 {
	public static void main(String[] args) {
		String s = "I like Java and Python and C.";
		
		// 문자열 변환 - replace()
		System.out.println(s.replace("and", ",")); // and를 , 로 변환 
		
		// 원하는 위치의 문자열 출력 substring()
		System.out.println(s.substring(7)); // 인덱스 기준 7부터 시작(이전 내용 삭제)
		System.out.println(s.substring(7, 11)); // 인덱스 기준 7부터 10미만의 문자열을 출력
		System.out.println(s.substring(s.indexOf("Java"))); // Java부터 출력
		System.out.println(s.substring(s.indexOf("Java"), s.lastIndexOf(" and"))); // Java and Python 출력
		System.out.println(s.substring(s.indexOf("Java"), s.indexOf(" and C"))); // Java and Python 출력
		// 함수 중복 사용 가능
		
		// 공백제거 
		s = "      love java 	 ";
		System.out.println(s + ".");
		//       love java 	 .
		System.out.println(s.trim() + "."); // 앞뒤 공백 제거. 단어 사이 공백은 제거하지 않음
		// love java.
		
		// 문자열 결합 - + 기호 사용, concat()
		String s1 = "Java";
		String s2 = "Python";
		System.out.println(s1 + s2);
		System.out.println(s1 + ", " + s2);
		System.out.println(s1.concat(", ").concat(s2)); // s1 뒤에 ',' 추가, 그 뒤에 s2 추가
		// +보단 concat()이 메모리 효율이 더 좋지만 요새는 하드웨어가 너무 좋아서 딱히 신경쓰지 않아도 된다
		
		
	}
}
