public class Car {
    static String carName;

    public static void setCarName(String carName) {
        Car.carName = carName;
    }

    public static void printData(){
        System.out.println("carname: "+carName);
    }
}
