public class ElectricCar extends Car{

    public ElectricCar(String model) {
        super(model);
    }

    public void charge() {
        System.out.println(model + "가 충전 중입니다.");
    }

    @Override
    public String toString() {
        return super.toString(); //System.format("%s", model);도 됨
    }
}
