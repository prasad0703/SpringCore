import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyDriver {
    public static void main(String... args){
        String[] files = {"car.xml","engine.xml"};
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(files);
        Car c = (Car) applicationContext.getBean("c");
        c.printCarInfo();
    }
}