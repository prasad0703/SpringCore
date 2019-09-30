public class CarFactory {
    private String carName;

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public Car getInstance() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Car c = (Car) Class.forName(carName).newInstance();
        return c;
    }
}
