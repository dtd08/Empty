package chap05;

public class _06_Ex01 {
	public static void main(String[] args) {
		// alphabets 이라는 배열 생성
		// 알파벳 대문자 A부터 Z까지 반복문을 통해 할당, for-each문으로 출력
		// 데이터 타입 - char
		// 배열의 크기 - 26
		char alphabets[] = new char[26];
		char ch = 'A';
		// for문 안에서 변수 두 개 이상을 증감할때 for문의 증감식에서 같이 증감할 수 있음
		for(int i = 0; i < alphabets.length; i++, ch++) {
			alphabets[i] = ch;
		}
		for(char c : alphabets) System.out.println(c + ", " + (int)c);
		
	}
}
