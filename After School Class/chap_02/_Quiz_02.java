package chap_02;

public class _Quiz_02 {
	public static void main(String[] args) {
		// 놀이공원
		// 키가 120cm 이상인 사람만 탑승이 가능하다.
		// height 변수에 키 값을 받아서,
		// 120 이상인 경우에는
		// 키가 ###cm 이므로 탑승 가능합니다.
		// 120미만인 경우에는
		// 키가 ###cm 이므로 탑승 불가능합니다.
		int height = 121;
		String res = (height >= 120) ? "탑승 가능합니다." : "탑승 불가능합니다.";
		System.out.println("키가 " + height + "cm 이므로 " + res);
	}
}
