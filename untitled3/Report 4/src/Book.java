class Book {
    String title;
    String author;

    // 생성자
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // 문자열 출력
    public String toString() {
        return "책 이름: " + title + ", 저자: " + author;
    }
}