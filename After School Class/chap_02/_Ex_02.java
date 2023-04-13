package chap_02;

public class _Ex_02 {
	public static void main(String[] args) {
		// 사과를 담는데 필요한 바구니의 수 구하기
		int numOfApple = 120;
		int sizeOfBucket = 10;
		int numOfBucket = (numOfApple % sizeOfBucket == 0) ? numOfApple / sizeOfBucket  : numOfApple / sizeOfBucket + 1;
		System.out.println("필요한 바구니의 수 : " + numOfBucket);
		
	}
	
	
}
