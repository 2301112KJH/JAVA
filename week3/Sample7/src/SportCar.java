public class SportCar extends Car{

    public SportCar(String model) {
        super(model);
    }

    public void turbo() {
        System.out.println(model + "%s가 터보 부스터를 가동합니다.");
    }
}
