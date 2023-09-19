package classExam;

public class Ex02 {
    public static void main(String[] args) {
        boolean newBoolean = (7>5) && (9<2) && (10==10);
//      boolean chk = m1() || m2() || m3();
        System.out.println(newBoolean);
//      식의 결과값이 이미 결정된 경우 자바는 연산을 멈춘다.
//      이와 같이 미리 멈추는 것을 '숏서킷연산'이라고 한다.
        
//      boolean chk = m1() || m2() || m3();
//      and 연산은 거짓일 확률이 높은 것 먼저, or 연산은 참일 확률이 높은 것 먼저
//      결국은 최적화에 관련된 개념이다


    }

}
