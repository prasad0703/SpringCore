public class Bus {
    String busName;
    Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public String getBusName() {
        return busName;
    }

    public Bus(String busName, Engine engine) {
        this.busName = busName;
        this.engine = engine;
    }

    public void printBusInfo(){
        System.out.println(String.format("My Bus Info, Bus Name:%s Bus Engine Model Name:%s", getBusName(), getEngine().getModelName()));
    }
}
