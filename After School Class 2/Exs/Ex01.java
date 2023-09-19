package classExam;

class AverageFinder {
//  파라미터로 정수 배열  intArray를 받고 배열의 모든 값의 평균을 리턴해주는 메소드 computerAverage를 작성하시오
    public double computerAverage(int[] intArray){
        double average = 0;
        for(int i = 0; i < intArray.length; i++){
            average += intArray[i];
        }
        return average/intArray.length;
    }
}

public class Ex01 {
    public static void main(String[] args) {
        AverageFinder af = new AverageFinder();

//      테스트 1
        int[] testArray = {3, 7, 3};
        System.out.println(af.computerAverage(testArray));

//      테스트 2
        int[] testArray2 = {12, 7, 5};
        System.out.println(af.computerAverage(testArray2));

//      테스트 3
        int[] testArray3 = {6, 7, 2};
        System.out.println(af.computerAverage(testArray3));
    }
}
