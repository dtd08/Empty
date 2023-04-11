package chap_01;

public class _07_TypeCasting {

	public static void main(String[] args) {
		// 형변환 (Casting)
		// 정수형 -> 실수형
		// 실수형 -> 정수형
		
		// int to float, double
		int score = 93;
		System.out.println(score); // 93
		System.out.println((float)score); // 93.0
		System.out.println((double)score); // 93.0
		
//		float, double to int
		float score_f = 93.3f;
		double score_d = 98.8;
		System.out.println(score_f); // 93
		System.out.println(score_d); // 98
		
//		정수 + 실수 연산
		score = 93 + (int)98.8; // double형이 더 커서 값의 손실이 나므로 int형으로 변환
		System.out.println(score); // 93 + 98 = 191
		
		score_d = 93 + 98.8; // 작은 것에서 큰 수로 사는 것은 상관없음(자동 변환/(double)생략)
		
		// 변수에 형변환된 데이터 집어넣기
		double convertedScoreDouble = score; // 191 -> 191.0
		// int -> long -> float -> double (자동 형변환)
		
		int convertedScoreInt = (int)score_d; // 191.8 -> 191
		// double -> float -> long -> int (수동 형변환)
		
		
	}

}
