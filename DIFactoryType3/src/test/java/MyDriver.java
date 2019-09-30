import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyDriver {

    public static void main(String... args){
        ApplicationContext ap = new ClassPathXmlApplicationContext("spring.xml");
        Car c1 = (Car) ap.getBean("cf");
        c1.drive();
        Car c2 = (Car) ap.getBean("cf");
        System.out.println(c1==c2);
    }
}

