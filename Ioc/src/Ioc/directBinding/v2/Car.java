package Ioc.directBinding.v2;

public class Car {
    private String model;
    private GasEngine gasEngine;
    private ElectricEngine electricEngine;
    //생성자 == 클래스 조립 설명서

    public Car(String model){
        this.model = model;
        if(model.equals("gas")){
            gasEngine = new GasEngine();
        }
        else if(model.equals("electric")){
            electricEngine = new ElectricEngine();
        }
    }

    public void drive(){
    //    this.engine.run();

        if(model.equals("gas")){
            this.gasEngine.run();
        }
        else if(model.equals("electric")){
             this.electricEngine.run();
        }
    }


}
