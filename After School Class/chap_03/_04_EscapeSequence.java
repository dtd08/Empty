package chap_03;

public class _04_EscapeSequence {
	public static void main(String[] args) {
		System.out.println("자바가");
		System.out.println("너무");
		System.out.println("좋아요!");
		
		// 줄바꿈 : \n
		System.out.println("자바가\n너무\n좋아요!");
		
		// 탭 : \t
		System.out.println("자바\t\t홍길동");
		System.out.println("파이썬\t\t장발장");
		System.out.println("C#\t\t로미오");
		
		// C:\workspace_java_basic - \ 를 문자열로 출력하고 싶을 때는 \\ 로 사용한다.
		System.out.println("C:\\workspace_java_basic");
		
		// 우리집 고양이가 "냐옹~"하고 운다.
		// 따옴표를 문자열로 표시하고 싶을 때는 \" (\') 로 사용한다.
		System.out.println("우리집 고양이가 \"냐옹~\" 하고 운다.");
		System.out.println("우리집 고양이가 '냐옹~' 하고 운다."); // 출력은 가능(정확한 문법은 아님)
		System.out.println("우리집 고양이가 \'냐옹~\' 하고 운다."); // 정확한 문법
		
		
	}
}
