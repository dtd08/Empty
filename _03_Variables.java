package chap_01;

public class _03_Variables {

	public static void main(String[] args) {
		// ������ ����� �Ҵ�
		// ����Ÿ�� ������ = ��;
		String name = "�����";
		int hour = 15;
		
		System.out.println(name + "��, ����� ���۵˴ϴ�. " + hour + "�ÿ� �湮 �����Դϴ�. ");
		System.out.println(name + "��, ����� �Ϸ�Ǿ����ϴ�.");
		
		double score = 91.5;
		char grade = 'A';
		name = "���缮";
		
		System.out.println(name + "�� �� ��� ������ " + score+ "�� �Դϴ�.");
		System.out.println("������ ������ " + grade + "�Դϴ�. ");
		
		boolean pass = true;
		System.out.println(name + "���� �̹� ���迡 �հ��������? " + pass);
		
		double d = 3.141592658579; // �� ���� �״�� f�� ���� ���� ==> double�� > float���̱� ������ ����
		float f1 = 3.141592658579f; // �Ǽ��� �⺻���� double �̹Ƿ� float�� ǥ�ø� ����� ��
		float f2 = 3.141592658579F;
		System.out.println(d);
		System.out.println(f1);
		
		int i = 1000000000; // int i = 1000000000000 ==> ���� ==> int���� ǥ���� �� �ִ� ������ �Ѿ
		long l1 = 1000000000000l; // ���� float�� ��� 
		long l2 = 1000000000000L;
		long l3 = 1000_000_000_000L;
		System.out.println(l3);
		
		byte b = 120; // ��״� ���� �Ű�Ⱦ�
		short s = 230;
		
	}

}
