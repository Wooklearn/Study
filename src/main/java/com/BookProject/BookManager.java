package com.BookProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManager {
    List<BookDTO> booklist = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    // 기본 생성자
    public BookManager() {}

    // 책 추가
    public void addBook() {





    }

    public void deleteBook() {}

    public void searchBook() {}

    public void displayAll() {}

    public List<BookDTO> sortedBookList() {


    }

    public void printBookList() {}

}
//- booklist:ArrayList<BookDTO>
//- sc : Scanner
//+ BookManager()
//+ addBook(book:Book) : void
//+ deleteBook(index:int) : void
//+ searchBook(btitle:String) : void
//+ displayAll():void
//+ sortedBookList(type:int):List<BookDTO>
//+ printBookList(printList:List<BookDTO>):void