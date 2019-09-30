import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyDriver {

    public static void main(String... args){
        ApplicationContext ap = new ClassPathXmlApplicationContext("spring.xml");
        Car c = (Car) ap.getBean("c");
        System.out.println(c.myCarEngine().getName());
        Bus b = (Bus) ap.getBean("b");
        System.out.println(b.myBusEngine().getName());
        Truck t = (Truck) ap.getBean("t");
        System.out.println(t.myTruckEngine().getName());
    }
}

