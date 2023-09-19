package classExam;

import java.util.ArrayList;

public class BookArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<>();
        
//      리스트에 넣으면서 생성과 동시에 생성자를 통해 초기화
        library.add(new Book("태백산맥", "조정래"));
        library.add(new Book("데미안", "헤르만 헤세"));
        library.add(new Book("어린왕자", "생택쥐페리"));

//        library.get(0).showBookInfo();
//        library.get(1).showBookInfo();

//        for(Book book : library){
//            book.showBookInfo();
//        }

        for(int i = 0; i < library.size(); i++){
            Book book = library.get(i);
            book.showBookInfo();
        }
    }
}
