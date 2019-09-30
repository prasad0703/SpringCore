import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
    String carName;

    public void setCarName(String carName) {
        this.carName = carName;
    }

    @Autowired
    @Qualifier("e1")
    Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public void printCarInfo(){
        System.out.println(String.format("My Car Info, Car Name:%s Car Engine Model Name:%s", carName, getEngine().getModelName()));
    }
}
