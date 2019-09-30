import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyDriver {

    public static void main(String... args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("spring.xml");
        Test t = (Test) ap.getBean("t");
        t.printData();
    }
}
