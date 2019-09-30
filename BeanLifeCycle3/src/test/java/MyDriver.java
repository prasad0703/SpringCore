import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyDriver {
    public static void main(String... args) {
        ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("spring.xml");
        Test t = (Test) cap.getBean("t");
        t.printData();
        cap.close();
    }
}
