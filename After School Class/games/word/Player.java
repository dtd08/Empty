package games.word;

import java.util.Scanner;

public class Player {

	Scanner sc = new Scanner(System.in);
	
	public String name; // 이름
	public String word; // 말하는 단어
	
	public String speakWord() {
		word = sc.next();
		return word;
	}
	public boolean chkSuccess(char lastChar) {
		// word -> String은 인덱스를 가짐 --> w(0) o(1) r(2) d(3)
		// charAt() 메소드를 통해 해당 인덱스의 문자를 가지고 올 수 있음
		if(lastChar == word.charAt(0)) {
			return true;
		}
		return false;
	}
	
}
