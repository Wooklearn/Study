package com.BookProject;

import java.util.List;
import java.util.Scanner;

public class BookMenu {

    Scanner sc = new Scanner(System.in);
    BookManager bm = new BookManager();

    // 기본 생성자
    public BookMenu() {}

    // 메인메뉴
    public void mainMenu() {
//    도서관리 프로그램에 해당하는
//    메인 메뉴 출력, 각 메뉴에 해당
//    하는 BookManager 클래스의 메
//    소드 실행  반복 출력되게 한
//    다.


        while (true) {
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서 정렬 후 출력");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색 출력");
            System.out.println("5. 도서 전체 출력");
            System.out.println("6. 프로그램 종료");
            System.out.print("메뉴 번호를 입력하세요 : ");
            int menuNum = sc.nextInt();

            switch (menuNum) {
                case 1:
                    //새 도서 추가
                    inputBook();
                    break;

                case 2:
                case 3:
                case 4:
                case 5:
                    bm.displayAll();
                    break;
                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.print("잘못 누르셨습니다. 다시 입력해주세요 : ");
                    break;
            }
            System.out.println("=======================================");
        }
    }


    public BookDTO inputBook() {
        BookDTO bookDTO = new BookDTO();

        System.out.println("새 도서를 추가합니다.");
        System.out.print("도서 번호를 입력하세요 : ");
        int bNo = sc.nextInt();
        System.out.print("도서 분류 번호를 입력하세요 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
        int category = sc.nextInt();
        sc.nextLine();
        System.out.print("도서 제목을 입력하세요 : ");
        String title = sc.nextLine();
        System.out.print("도서 저자를 입력하세요 : ");
        String author = sc.nextLine();

        BookDTO bookAdd = new BookDTO(bNo, category, title, author);

        System.out.println(bookAdd + "가 추가되었습니다.");

        return bookAdd;

    }

//    public int inputBookNo() {}
//
//    public String inputBookTitle() {}
//
//    public List<BookDTO> selectSortedBook() {}

}