package chap_02;

public class _04_Operator4 {
	public static void main(String[] args) {
		// �� ������
		boolean ġŲ = false;
		boolean ���� = true;
		boolean ������ = true;
		
		// &&(and)
		System.out.println(ġŲ && ���� && ������); // �ְ��� �Ĵ� -> ��� true�� �� true
		
		// ||(or)
		// ���� ���� \\\\\ ����Ʈ�� ���� ���¿��� |||||
		System.out.println(ġŲ || ���� || ������); // ������ �Ĵ� -> �ϳ��� true�� true
		
		System.out.println("==============");
		
		// And ����
		System.out.println((5 > 3) && (3 > 1)); // true && true -> true
		System.out.println((5 < 3) && (3 > 1)); // false �� ���� �ڿ� ������ ���� �ʰ� false  
		// �� �տ� ���� false�ε� �� ���� ��� ���Ұǵ� --> �����
		
		// Or ����
		System.out.println((5 > 3) || (3 > 1)); // true || true -> true
		System.out.println((5 < 3) || (3 > 1)); // false || true -> true
		System.out.println((5 < 3) || (3 < 1)); // false || false -> false 
		
		//System.out.println(1 < 3 < 5); ��� ���� ������ �Ұ����ϴ�
		System.out.println((1 < 3) && (3 < 5));
		
		// ! (�� ���� ������, not)
		System.out.println(!true); // false
		System.out.println(!false); // true
		System.out.println(!(5 == 5)); // false
		System.out.println(!(5 == 3)); // true
	}
}
