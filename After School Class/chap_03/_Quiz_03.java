package chap_03;

public class _Quiz_03 {
	public static void main(String[] args) {
		// "901231-1234567" 인 경우 "901231-1" 까지만 출력
		// "070627-4128342" 인 경우 "070627-4" 까지만 출력
		
		String id = "070627-4128342";
		System.out.println(id.substring(0, id.indexOf("-")+2)); // substring()은 인자값-1 까지 포함함
		
	}
}
