package Ioc.directBinding.v2;

public class Main {

    public static void main(String[] args) {

        //가솔린
        Car gascar = new Car("gas");
        gascar.drive();

        //전기
        Car eletiricCar = new Car("electric");
        eletiricCar.drive();
    }
}
