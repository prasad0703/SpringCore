public class Car {
    String carName;
    Engine engine;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void printCarInfo(){
        System.out.println(String.format("My Car Info, Car Name:%s Car Engine Model Name:%s", getCarName(), getEngine().getModelName()));
    }
}
