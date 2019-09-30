import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Car {

    String[] carNames;
    Engine[] engines;

    public String[] getCarNames() {
        return carNames;
    }

    public void setCarNames(String[] carNames) {
        this.carNames = carNames;
    }

    public Engine[] getEngines() {
        return engines;
    }

    public void setEngines(Engine[] engines) {
        this.engines = engines;
    }

    public void printCarInfo(){
        System.out.println("Car Names: "+ Arrays.toString(getCarNames()));
        List<String> modelNames = Arrays.stream(getEngines()).map(engine -> engine.getModelName()).collect(Collectors.toList());
        System.out.println("Car Engines: "+ modelNames.toString());
    }
}
