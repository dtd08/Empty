package chap06;

public class _03_Return {
	
	// 리턴값이 있는 함수 
	public static String getPhoneNumber() {
		String phoneNumber = "02-1234-5678";
		return phoneNumber;
		// 누군가 나를 호출했다면 이 리턴값을 돌려주겠다는 뜻
		// 변수 리턴
	}
	
	public static String getAddress() {
		return "서울시 강남구";
		// 값을 변수에 담지 않고 그대로 리턴
	}
	
	public static String getActivity() {
		return "탁구장, 볼링장, 노래방, 사우나";
	}
	
	public static void main(String[] args) {
		String phoneNumber = getPhoneNumber();
		System.out.println(phoneNumber);
		
		String address = getAddress();
		System.out.println(address);
		
		System.out.println(getActivity());
	}
}
