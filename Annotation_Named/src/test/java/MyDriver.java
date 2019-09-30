import myPackage.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyDriver {
    public static void main(String... args){
        ApplicationContext ap = new ClassPathXmlApplicationContext("spring.xml");
        Car c = (Car) ap.getBean(Car.class);
        c.printData();
    }
}
