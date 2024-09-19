package practice.practice02_ArrayList_Book;

public class BookDTO {
    private int bookNum;
    private String bookName;
    private String bookAuthor;
    private int bookPrice;

    // 기본 생성자
    public BookDTO() {}

    // 생성자 초기화
    public BookDTO(int bookNum, String bookName, String bookAuthor, int bookPrice) {
        this.bookNum = bookNum;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
    }

    // getter / setter
    public int getBookNum() {
        return bookNum;
    }

    public void setBookNum(int bookNum) {
        this.bookNum = bookNum;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    // 오버라이딩
    @Override
    public String toString() {
        return "BookDTO{" +
                "bookNum=" + bookNum +
                ", bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookPrice=" + bookPrice +
                '}';
    }

}
