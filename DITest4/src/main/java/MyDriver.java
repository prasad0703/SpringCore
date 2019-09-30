import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyDriver {
    public static void main(String... args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("car.xml");
        Car c = (Car) applicationContext.getBean("c");
        c.printCarInfo();
    }
}