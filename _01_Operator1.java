package chap_02; // ������

public class _01_Operator1 {
	public static void main(String[] args) {
		// ������(Operator)
		// �ǿ�����(Operand)
		// ���� ������ : + - (Ÿ��(ĳ����)) ++ -- ~ !
		// ���� ������
		//	- ��� : + - * / % << >> >>>
		//	- �� : > < >= <= == !=
		//	- �� : && || ! ^ ...
		// ���� ������ : =
		// �������� �켱 ���� ���ǻ���
		// >> << >>> �� ���� �����ں��� �켱������ ����
		// ||, |(OR)�� &&, &(AND)���� �켱������ ����
		
		// ��� ���� - ���� ����
		System.out.println(4 + 2);
		System.out.println(4 - 2);
		System.out.println(4 * 2);
		System.out.println(4 / 2);
		System.out.println(5 % 2);
		System.out.println(8 % 3); // 2
		System.out.println(8 % -3); // 2
		System.out.println(-8 % 3); // -2
		System.out.println(-8 % -3); // -2
		
		// �켱���� ����
		System.out.println(2 + 2 * 2);
		System.out.println((2 + 2) * 2);
		
		// ������ �̿��� ����
		int num1 = 20;
		int num2 = 10;
		int result;
		
		result = num1 + num2;
		System.out.println(result); // 20 + 10 = 30
		
		result = num1 - num2;
		System.out.println(result); // 20 - 10 = 30
		
		result = num1 * num2;
		System.out.println(result); // 20 * 10 = 200
		
		result = num1 / num2;
		System.out.println(result); // 20 / 10 = 2
		
		result = num1 % num2;
		System.out.println(result); // 20 % 10 = 0
		
		
		
		
		
	}
}
