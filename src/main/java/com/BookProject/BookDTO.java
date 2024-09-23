package com.BookProject;

public class BookDTO {
//- bNo : int // 도서 번호
//- category : int // 장르 분류 번호
//- title : String // 도서 제목
//- author : String // 도서 저자

    // 필드 값 설정
    private int bNo;
    private int category;
    private String title;
    private String author;

    // 기본 생성자
    public BookDTO() {}

    // 초기화 된 생성자
    public BookDTO(int bNo, int category, String title, String author) {
        this.bNo = bNo;
        this.category = category;
        this.title = title;
        this.author = author;
    }

    // getter/settet
    public int getbNo() {
        return bNo;
    }

    public void setbNo(int bNo) {
        this.bNo = bNo;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // 오버라이딩
    @Override
    public String toString() {
        return "BookDTO{" +
                "bNo=" + bNo +
                ", category=" + category +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
