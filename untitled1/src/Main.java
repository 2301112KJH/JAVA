public class Main {
    public static void main(String[] args) {

        Movie movie1 = new Movie("헤라클레스", "레니 할렌", 2014, "켈란 루츠", 6.9);
        Movie movie2 = new Movie("노아", "대런 아로노프스키", 2004, "러셀 크로우", 7.3);

        // 평점 변경
        movie2.setRankPoint(8.2);

        // 전체 출력
        movie1.printInfo();
        movie2.printInfo();

        // movie1 감독 성만 출력
        System.out.println("movie1 감독: " + movie1.getDirector());
    }
}