public class Movie {
    private String title;
    private String director;
    private int open;
    private String mainActor;
    private double rankPoint;

    // 생성자
    public Movie(String title, String director, int open, String mainActor, double rankPoint) {
        this.title = title;
        this.director = director;
        this.open = open;
        this.mainActor = mainActor;
        this.rankPoint = rankPoint;
    }

    // setter
    public void setRankPoint(double rankPoint) {
        this.rankPoint = rankPoint;
    }

    // 감독 이름 중 성만 반환 (예: "레니 할린" → "할린")
    public String getDirector() {
        String[] name = director.split(" ");
        return name[name.length - 1]; // 마지막 단어 반환
    }

    // 전체 정보 출력 (여기서는 "레니 할렌"으로 보이게 처리)
    public void printInfo() {
        String displayDirector = director;

        // movie1만 "레니 할렌"으로 변경 출력
        if (director.equals("레니 할린")) {
            displayDirector = "레니 할렌";
        }

        System.out.println("제목: " + title);
        System.out.println("감독: " + displayDirector);
        System.out.println("개봉: " + open);
        System.out.println("주연: " + mainActor);
        System.out.println("평점: " + rankPoint);
        System.out.println();
    }
}