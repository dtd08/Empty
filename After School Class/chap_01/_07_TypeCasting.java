package chap_01;

public class _07_TypeCasting {

	public static void main(String[] args) {
		// ����ȯ (Casting)
		// ������ -> �Ǽ���
		// �Ǽ��� -> ������
		
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
		
//		���� + �Ǽ� ����
		score = 93 + (int)98.8; // double���� �� Ŀ�� ���� �ս��� ���Ƿ� int������ ��ȯ
		System.out.println(score); // 93 + 98 = 191
		
		score_d = 93 + 98.8; // ���� �Ϳ��� ū ���� ��� ���� �������(�ڵ� ��ȯ/(double)����)
		
		// ������ ����ȯ�� ������ ����ֱ�
		double convertedScoreDouble = score; // 191 -> 191.0
		// int -> long -> float -> double (�ڵ� ����ȯ)
		
		int convertedScoreInt = (int)score_d; // 191.8 -> 191
		// double -> float -> long -> int (���� ����ȯ)
		
		
	}

}
