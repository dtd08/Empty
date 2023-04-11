package chap_01;

public class _04_Comment {

	public static void main(String[] args) {
		// public은 공용의라는 뜻으로 어디서든 접근 가능하다.
		//위의 문장은 주석. // 주석이란 컴퓨터가 읽지 못하는 추가 설명을 뜻한다.
		
		// 코드를 잠시 실행하지 않도록 주석으로 처리할 수 있다.
		// 한 줄 주석: // 사용, ctrl + shift + c or ctrl + /
		// 여러 줄 주석: /* ~~ */, 블록 설정 후 ctrl + shift + /
		
		System.out.println("(10분 전) 잠시 후 특강이 시작됩니다. 학생 여러분들께선 자리에 착석해주시길 바랍니다.");
		//System.out.println("(5분 전) 잠시 후 특강이 시작됩니다. 학생 여러분들께선 자리에 착석해주시길 바랍니다.");
		//System.out.println("지금부터 특강을 시작하겠습니다.");
		
		int size = 120;
		size = size + 10; // 어린이는 발이 빨리 자라기 때문에 사이즈 10만큼 더 큰 신발을 구매할려고 한다.
		System.out.println("신발 사이즈 " + size + "으로 보여주세요.");
		// 프로그래머의 의도를 주석으로 나타내어 다른 사람이 봤을 때 이해하기 쉽도록 주석을 활용할 수 있다.
		
		
		
	}

}
