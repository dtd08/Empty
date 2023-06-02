배열의 단점
 1. 크기가 정해져있어 변동하기 어려움.
 2. 어디가 비었는지 찾기 어려움.
==> 이런 단점을 보완한게 ArrayList

ArrayList란
- 배열과 리스트의 장점을 합친 것.
 크기가 가변적이고, 값을 삭제하면 인덱스값이 당겨짐.
- 선언
  - ArrayList<데이터 타입 클래스명(제너럴 타입)> 변수명 = new ArrayList<>();
  타입을 제너럴 타입으로 선언해 확장성이 좋아짐
  클래스를 타입으로 쓸 수 있음
- 값 넣기
 - 변수명.add(데이터);
- 크기 알아내기
 - 변수명.size();
- 값 지우기
 - 변수명.remove(인덱스값);
* 추가 팁 : 한 파일에 public 클래스는 하나다.

package arrayList;

import java.util.ArrayList;

class Stack {
  ArrayList<Integer>;
  
  public void push(int data){
    System.out.println("Push is succeeding");
  }
  
  public void pop() {
    System.out.println("Pop is succeeding");
  }
  
}
