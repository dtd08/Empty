package chap_02;

public class _03_Operator3 {
	
	public static void main(String[] args) {
		// �� ������ ( >, >=, <, <=, ==, !=)
		// ��ȯ���� boolean
		System.out.println(5 > 3); // 5�� 3���� ũ��. (���̸� true, �����̸� false)
		System.out.println(5 >= 3); // 5�� 3���� ũ�ų� ����. (���̸� true, �����̸� false)
		System.out.println(5 >= 7); // 5�� 7���� ũ��. (���̸� true, �����̸� false)
		
		System.out.println(5 < 3); // 5�� 3���� �۴�. (���̸� true, �����̸� false)
		System.out.println(5 <= 3); // 5�� 3���� �۰ų� ����. (���̸� true, �����̸� false)
		
		System.out.println(5 == 5); // 5�� 5�� ����. (���̸� true, �����̸� false)
		System.out.println(5 == 3); // 5�� 3�� ����. (���̸� true, �����̸� false)
		System.out.println(5 == 5); // 5�� 5�� �ٸ���. (���̸� true, �����̸� false)
		System.out.println(5 != 3); // 5�� 3�� �ٸ���. (���̸� true, �����̸� false)
		
		
		// ������ ������ Ÿ�Կ����� �� �����ڸ� ����� �� ������?
		String s = "������";
		String t = "�󸶹�";
		
		// ����
		// System.out.println(s > t);
		// System.out.println(s >= t);
		// System.out.println(s < t);
		// System.out.println(s <= t);
		
		System.out.println(s == t);
		System.out.println(s != t);
		// �������� ==�� !=�� ����� �� �ִ�.
		// �������� ������ �ּҸ� ��� �����Ƿ� ==�̳� !=�� ���� �ּҸ� ���ϰ� �ȴ�
		// �������� equals()��� �޼ҵ带 ����Ѵ�

		// char��
		System.out.println('A' < 'B');  
		// A�� �ƽ�Ű�ڵ� ���� 65�̰�, B�� 66�̱� ������ 65 < 66���� �����ؼ� �����غ��� �ȴ�
		
		System.out.println('0' == 0 ); 
		// '0'�� �ƽ�Ű�ڵ� ���� 48
		// ������ 48 == 0 ���̹Ƿ� false
		
		
		// �Ǽ� Ÿ��
		System.out.println(10.d == 10.0f);
		// 10.0d == 10.0f --> 10.0d == 10.0d ==> true
		
		System.out.println(0.1d == 0.1f); 
		// 0.1d == 0.1f --> 0.1d == 0.1d ==> false
		
		System.out.println(0.1d);
		System.out.println(0.1f);
		System.out.println((double)0.1f);
		// float���� double�� ����ȯ �Ǹ� �Ҽ��� ���ڸ� ���� 0�� �ƴϸ� ���� �߰��� �� �ִ�
		
		
	}
}
