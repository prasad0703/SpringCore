import javax.inject.Inject;

public class Car {
    String carName;

    public void setCarName(String carName) {
        this.carName = carName;
    }

    @Inject
    Engine engine;

    public void printCarInfo(){
        System.out.println(String.format("My Car Info, Car Name:%s Car Engine Model Name:%s", carName, engine.getModelName()));
    }
}
