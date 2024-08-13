package Ioc.looseCoupling;

public class Car {

    private Engine engine;

    //생성자 == 클래스 조립 설명서
    public Car(Engine engine){
       // this.engine = new GasEngine();
        this.engine = engine;
    }

    public void drive(){

        this.engine.run();
    }


}
