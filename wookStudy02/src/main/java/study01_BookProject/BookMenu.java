package study01_BookProject;

import java.util.Scanner;

public class BookMenu {
    public void mainMenu() {

        // BookManager 호출
        BookManager bm = new BookManager();

        // while문 사용으로 반복
        while(true) {
            // Scanner 사용으로 메뉴 번호 선택
            Scanner sc = new Scanner(System.in);
            System.out.println("========== 도서 관리 프로그램 ==========");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서정보 정렬 후 출력");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색 출력");
            System.out.println("5. 전체 도서 출력");
            System.out.println("6. 끝내기");
            System.out.println();
            System.out.print("입력하실 번호를 선택하세요 : ");
            int select = sc.nextInt();

            // switch문 사용으로 번호 입력받기
            switch (select) {
                case 1:
                    bm.addBook();
                    break;
                case 3:
                    bm.deleteBook();
                    break;
                case 4:
                    bm.searchBook();
                    break;
                case 5:
                    bm.displayAll();
                    break;

                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못 누르셨습니다. 다시 입력해주세요");
                    break;

                    // 개발 순서
                    // CRUD
                    // CREATE / READ / UPDATE / DELETE
            }
        }
    }

    public BookDTO inputBook(){
        Scanner sc = new Scanner(System.in);
        System.out.print("도서 번호를 입력하세요 : ");
        int bNO = sc.nextInt();
        System.out.print("도서 장르를 입력하세요 (1:인문 / 2:자연과학 / 3: 의료 / 4: 기타) : ");
        int category = sc.nextInt();
        System.out.print("도서 제목을 입력하세요 : ");
        sc.nextLine();
        String title = sc.nextLine();
        System.out.print("도서 저자를 입력하세요 : ");
        String author = sc.nextLine();

        // getter,setter를 활용해서 리턴
        BookDTO bookDTO = new BookDTO();
        bookDTO.setbNO(bNO);
        bookDTO.setCategory(category);
        bookDTO.setTitle(title);
        bookDTO.setAuthor(author);

        // 초기화 된 생성자를 활용하여 리턴
        // return new BookDTO(bookNum,bookGenre,bookName,bookAuthor);

        return bookDTO;

    }
     public int inputBookNo() {
         Scanner sc = new Scanner(System.in);
         System.out.print("도서 번호를 입력하세요 : ");
         int bookNum = sc.nextInt();

         return bookNum;
     }
    public String inputBookTitle(){
        Scanner sc = new Scanner(System.in);

        System.out.print("도서 이름을 입력하세요 : ");
        String inputTitle = sc.nextLine();

        return inputTitle;

    }

}
