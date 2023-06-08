package chap06;

public class _04_ParameterAndReturn {
	
	public static int getPower(int num) {
		int result = num * num;
		return result;
	}

	public static int getPowerByExp(int num, int exp) {
		int result = 1;
		for(int i = 0; i < exp; i++) result *= num;
		return result;
	}
	
	public static void main(String[] args) {
		
		// 어떤 결과값을 받아오는 함수를 쓸 땐 일반적으로 앞에 get을 씀
		int val = getPower(5);
		System.out.println(val);
		
		System.out.println(getPowerByExp(5,5));
		
	}
}
