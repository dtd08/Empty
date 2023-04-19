package chap_04;

public class _04_SwitchCase {
	public static void main(String[] args) {
		/* 
		 * Switch Case문
		 * switch(입력값) {
		 *		// 입력값에 문자, 숫자, 수식 다 들어올 수 있지만 수식은 넣을 일이 웬만하면 없음
		 * 		case 입력값1: // 입력값이 입력값1에 해당되는 경우에 실행하는 문장
		 * 				break;
		 *  	case 입력값2: // ""
		 *  			break;
		 *  	default: // 입력값이 모든 케이스에 해당되지 않을 경우 실행하는 문장
		 *  			// default에서 break는 선택
		 * }
		 */
		
		// 석차에 따라 장학금 지급
		// 1등 : 전액 장학금
		// 2등 : 반액 장학금
		// 3등 : 반액 장학금
		// 그 외 : 대상 제외
		
		
		// if문으로 작성해보기
		int rank = 1;
		if(rank == 1) System.out.println("전액 장학금 지급");
		else if(rank == 2 || rank == 3) System.out.println("반액 장학금 지급");
		else System.out.println("대상 제외");
		
		// switch문으로 작성해보기
		// if문으로 모든 switch문을 쓸 수 있지만 케이스가 명확한 경우에는 switch문을 사용하는 것을 고려해볼만 하다!
		switch(rank) {
		case 1: System.out.println("전액 장학금 지급");
				break;
		// case의 결과가 같을 경우 통합하는 방법
		case 2:
		case 3: System.out.println("반액 장학금 지급");
				break;
		default: System.out.println("지급 대상 제외");
		}
		
		// break 없는 응용 문제
		// 중고 상품을 등급에 따라 가격을 책정 (1급: 최상, 4급: 최하)
		// 등급별 천원씩 차등
		int grade = 3;
		int price = 7000;	// 기본가격 (최하 기준)
		switch(grade) {
			case 1:
				price += 1000;
			case 2:
				price += 1000;
			case 3:
				price += 1000;
		}
		System.out.println(grade + "등급의 제품 가격 : " + price);
	}
}
