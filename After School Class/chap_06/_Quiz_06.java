package chap_06;

public class _Quiz_06 {
	//	실행결과
	//	이름 : 김**
	//	주민등록번호 : 990824-2******
	//	전화번호 : 010-5684-****
	//	
	//	subString() : 문자열 자르기
	//	length() : 문자열 길이
	
	public static String getHiddenData(String data, int index) {
		String hidden = data.substring(0, index);
		for(int i = 0; i < (data.length() -index); i++) {
			hidden += "*";
		}
		return hidden;
	}
	
	public static void main(String[] args) {
		String name = "김성일";
		String id = "990824-214534";
		String phone = "010-5684-2325";
		
		System.out.printf("이름 : %s\n", getHiddenData(name, 1));
		System.out.printf("주민등록번호 : %s\n", getHiddenData(id, 8));
		System.out.printf("전화번호 : %s\n", getHiddenData(phone, 9));
		
	}
}
