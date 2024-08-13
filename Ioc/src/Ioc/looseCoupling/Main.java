package Ioc.looseCoupling;

public class Main {

    public static void main(String[] args) {
        // 1. DI: 의존성 주입
        GasEngine gasEngine = new GasEngine();
        Car car = new Car(gasEngine);
        car.drive();

        ElectricEngine electricEngine = new ElectricEngine();
        Car ele = new Car(electricEngine);
        ele.drive();
    }
}
