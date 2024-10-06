package study01_BookProject;

public class BookDTO {
    // 필드 값 설정
    private int bNO;        // 도서번호
    private int category;   // 장르 분류 번호
    private String title;   // 도서 제목
    private String author;  // 도서 저자

    // 기본생성자
    BookDTO () {}

    // 초기화 된 생성자
    public BookDTO(int bNO, int category, String title, String author) {
        this.bNO = bNO;
        this.category = category;
        this.title = title;
        this.author = author;
    }

    // getter/setter
    public int getbNO() {
        return bNO;
    }

    public void setbNO(int bNO) {
        this.bNO = bNO;
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
                "bNO=" + bNO +
                ", category=" + category +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
