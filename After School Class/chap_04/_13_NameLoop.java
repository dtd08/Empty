package chap04;

public class _13_NameLoop {
	public static void main(String[] args) {
		
		// for문의 이름 정의하기
		Loop1 : 
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				if(j == 5) continue Loop1;
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}
	}
}
