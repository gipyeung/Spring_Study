package Ioc.directBinding.v1;

public class Car {

    private GasEngine engine;

    //생성자 == 클래스 조립 설명서
    public Car(){
        this.engine = new GasEngine();
    }

    public void drive(){
        this.engine.run();
    }


}
