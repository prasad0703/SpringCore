import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyDriver {

    public static void main(String... args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Test t = (Test) applicationContext.getBean("t");
        t.printVariables();
    }
}
