package study01_BookProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManager {
    List<BookDTO> booklist = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    // 기본 생성자
    public  BookManager() {}

    public void addBook() {
        // 도서 추가하는 기능
        BookMenu bookMenu = new BookMenu();
        booklist.add(bookMenu.inputBook());
        System.out.println("도서가 추가되었습니다.");

    }

    public void deleteBook() {
        // 도서를 삭제하는 기능
        BookMenu bookMenu = new BookMenu();
        int bookNum = bookMenu.inputBookNo();

        BookDTO bookDTO = new BookDTO();

        for (int i = 0; i < booklist.size(); i++) {
            // 인덱스 값을 찾음
            if (bookNum == (booklist.get(i).getbNO())) {
                booklist.remove(bookNum);
            }

        }


    }

    public void searchBook() {

        // inputBookTitle 이 리턴한 도서제목 실행
        BookMenu bookMenu = new BookMenu();
        String bookTitle = bookMenu.inputBookTitle();

        // 이걸 밖으로 뺀 이유가 for문 안에있으면 책10권이면 10권다 출력하기 때문
        BookDTO bookDTO = null;

        for (int i = 0; i < booklist.size(); i++) {
            // 책의 제목을 찾음

            if (bookTitle.equals(booklist.get(i).getTitle())) {
                // bookDTO 에 booklist에 있는 정보를 담아줌
                bookDTO = booklist.get(i);
            }

        }

        if(bookDTO == null){
            System.out.println("입력하신 책 제목이 없습니다.");
        } else {
            System.out.println("책의 이름은 : " + bookDTO.getbNO());
            System.out.println("책의 장르는 : " + bookDTO.getCategory());
            System.out.println("책의 제목은 : " + bookDTO.getTitle());
            System.out.println("책의 저자는 : " + bookDTO.getAuthor());
        }

    }

    public void displayAll() {
        // 도서목록 전체 출력
        System.out.println("전체 도서를 출력합니다.");

        if (booklist.isEmpty()) {
            System.out.println("출력 결과가 없습니다.");
        } else {

            // DTO 1개를 포맷으로 지정해서 출력
//            BookDTO test = new BookDTO(1,1,"test","test");
//
//            System.out.println("책의 번호는 : " + test.getbNO());
//            System.out.println("책의 카테고리는 : " + test.getCategory());
//            System.out.println("책의 제목은 : " + test.getTitle());
//            System.out.println("책의 저자는 : " + test.getAuthor());

            // DTO 리스트를 포맷 지정해서 출력
            // List에 있는 걸 불러올 때는 .get(몇번지의 index값)  /  .size()는 갯수
            for (int i = 0; i < booklist.size(); i++) {
                System.out.println("책의 번호는 : " + booklist.get(i).getbNO());
                System.out.println("책의 카테고리는 : " + booklist.get(i).getCategory());
                System.out.println("책의 제목은 : " + booklist.get(i).getTitle());
                System.out.println("책의 저자는 : " + booklist.get(i).getAuthor());
                System.out.println("===================================================");
            }
            // stream 객체를 활용하여 반복문 사용  /  요즘 트렌드
//            booklist.stream().forEach(item->{
//                System.out.println("책의 번호는 : " + item.getbNO());
//                System.out.println("책의 카테고리는 : " + item.getCategory());
//                System.out.println("책의 제목은 : " + item.getTitle());
//                System.out.println("책의 저자는 : " + item.getAuthor());
//            });
        }

    }

    // sortedBookList(type:int):List<BookDTO> 생성

    // printBookList(printList:List<BookDTO>):void 생성

}
