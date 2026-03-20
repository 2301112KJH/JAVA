public class Car {
    protected String model;

    public Car(String model) {
        this.model = model;
    }

    public void start() {
        System.out.printf("%s이 달립니다\n",model);
    }

    public void stop() {
        System.out.printf("%s이 멈춥니다\n",model);
    }

    @Override
    public String toString() {
        return String.format("%s", model);
    }
}
