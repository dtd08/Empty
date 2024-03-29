package classExam;

public class NullEx {
//   자바에서 null은 '비어있음'이다.
//   null은 참조형 변수만 가질 수 있는 값이다.
    public static void main(String[] args){
//      Person p1 = null;
//      System.out.println(p1);
//      p1.getName();
//      만약 null을 보관하고 있는 변수의 메소드를 호출하면
//      NullPointerException 이라는 오류가 발생한다는 점을 주의해야 한다

        Person[] peoples = new Person[5];
        peoples[0] = new Person("홍길동", 52);
        peoples[2] = new Person("장발장", 29);
        peoples[3] = new Person("임꺽정", 46);

        for(int i = 0; i < peoples.length; i++){
            Person p = peoples[i];
            if(p != null){
                System.out.println(p.getName());
            } else{
                System.out.println("비어있음");
            }
        }


    }

}
