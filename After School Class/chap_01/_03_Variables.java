package chap_01;

public class _03_Variables {

	public static void main(String[] args) {
		// 변수의 선언과 할당
		// 변수타입 변수명 = 값;
		String name = "장발장";
		int hour = 15;
		
		System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다. ");
		System.out.println(name + "님, 배송이 완료되었습니다.");
		
		double score = 91.5;
		char grade = 'A';
		name = "유재석";
		
		System.out.println(name + "님 의 평균 점수는 " + score+ "점 입니다.");
		System.out.println("귀하의 학점은 " + grade + "입니다. ");
		
		boolean pass = true;
		System.out.println(name + "님은 이번 시험에 합격했을까요? " + pass);
		
		double d = 3.141592658579; // 이 값이 그대로 f에 들어가면 오류 ==> double형 > float형이기 때문에 오류
		float f1 = 3.141592658579f; // 실수의 기본형은 double 이므로 float는 표시를 해줘야 함
		float f2 = 3.141592658579F;
		System.out.println(d);
		System.out.println(f1);
		
		int i = 1000000000; // int i = 1000000000000 ==> 오류 ==> int형이 표현할 수 있는 범위를 넘어섬
		long l1 = 1000000000000l; // 위의 float와 비슷 
		long l2 = 1000000000000L;
		long l3 = 1000_000_000_000L;
		System.out.println(l3);
		
		byte b = 120; // 얘네는 별로 신경안씀
		short s = 230;
		
	}

}
