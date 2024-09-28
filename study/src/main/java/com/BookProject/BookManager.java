package com.BookProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManager {
    List<BookDTO> booklist = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    BookDTO bookDTO = new BookDTO();

    // 기본 생성자
    public BookManager() {}

    // 책 추가
    public void addBook() {

        addBook();
    }

    public void deleteBook() {}

    public void searchBook() {}

    public void displayAll() {

        if (booklist.isEmpty()) {
            System.out.println("출력 결과가 없습니다.");
        } else {
            for (BookDTO bookDTO : booklist) {
                System.out.println(bookDTO);
            }
        }

    }

//    public List<BookDTO> sortedBookList() {
//
//
//    }

    public void printBookList() {}

}