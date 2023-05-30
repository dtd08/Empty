package exam;

public class Ex06 {
	public static void main(String[] args) {
		// 1부터 20까지의 정수 중 3의 배수의 합을 구하시오
		int sum = 0;
		 
		for(int i = 1; i <= 20; i++){
			if(i % 3 == 0){
				sum += i;	
			}
		}
		System.out.println(sum);
	}
}
