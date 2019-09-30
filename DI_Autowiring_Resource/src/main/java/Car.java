import javax.annotation.Resource;

public class Car {
    String carName;

    public void setCarName(String carName) {
        this.carName = carName;
    }

    @Resource
    Engine engine;

    public void printCarInfo(){
        System.out.println(String.format("My Car Info, Car Name:%s Car Engine Model Name:%s", carName, engine.getModelName()));
    }
}
