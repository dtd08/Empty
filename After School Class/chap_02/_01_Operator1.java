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
		
		// ���� ���� ++, --
		int val;
		val = 10;
		System.out.println(val); // 10
		System.out.println(val++); // 10 // �ش� ������ ���� �Ϸ�� �Ŀ� 1 ����
		System.out.println(val); // 11
		
		
		val = 10;
		System.out.println(val); // 10
		System.out.println(++val); // 11 // �ش� ���� ���� ���� 1 ���� ��Ų �� ���� ����
		System.out.println(val); // 11
		
		/*
		 * ���� ������ ��ġ�� ���� �� ���� �������� �з�
		 * 
		 * ����������(++) : �ǿ������� ���� 1 ������Ų��
		 * ���ҿ�����(--) : �ǿ������� ���� 1 ���ҽ�Ų��
		 * 
		 * ������ / j = ++i; // ���� �����Ǳ� ���� ������Ų��.
		 * ������ / j = i++; // ���� ������ �Ŀ� ������Ų��.
		 * 
		 */
		
		val = 10; 
		System.out.println(val); // 10
		System.out.println(--val); // 9
		
		val = 10;
		System.out.println(val); // 10
		System.out.println(val--); // 10
		System.out.println(val); // 9
		
		// ���� ����ȣǥ
		int waiting = 0;
		System.out.println("��� �ο� : " + waiting++);
		System.out.println("��� �ο� : " + waiting++);
		System.out.println("��� �ο� : " + waiting++);
		System.out.println("�� ��� �ο� : " + waiting);
	}
}
