class TV {
    // Member 변수
    String brand;
    int size;
    int price;
    String resolution;
    boolean powerOn;

    // 생성자
    TV(String brand, int size, int price, String resolution) {
        this.brand = brand;
        this.size = size;
        this.price = price;
        this.resolution = resolution;
        this.powerOn = false;
    }

    // 전원 기능
    void power() {
        powerOn = !powerOn;
        System.out.println("TV 전원: " + (powerOn ? "ON" : "OFF"));
    }
}