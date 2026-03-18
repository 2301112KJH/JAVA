public class Main {
    public static void main(String[] args) {
        TV myTV = new TV("Samsung", 55, 1200000, "4K");

        // format으로 한 번에 출력
        System.out.format(
                "브랜드: %s\n크기: %d인치\n가격: %d원\n해상도: %s\n",
                myTV.brand, myTV.size, myTV.price, myTV.resolution
        );

        myTV.power(); // 전원 켜기
    }
}