package chap_02;

public class _05_Operator5 {
	public static void main(String[] args) {
		// ���� ������
		// ��� = (����) ? (���� ��� �����) : (������ ��� �����)
		// ���� �⺻���� if��
		int x = 3;
		int y = 5;
		int max = (x > y) ? x : y;
		System.out.println(max);
		
		int min = (x > y) ? x : y;
		System.out.println(min);
		
		boolean b = (x > y) ? true : false;
		System.out.println(b);
		
		String s = (x != y) ? "�ٸ���" : "����";
		System.out.println(s);
		
		System.out.println((x > y) ? x : y);
		
		int num = -10;
		// ���׿����ڸ� num ���� ���� ��� ������� ���밪�� ����ؼ� absNum�� �����ÿ�.
		int absNum = (num < 0) ? -num : num ; // ���밪
		System.out.println(absNum);
		
	}
}
