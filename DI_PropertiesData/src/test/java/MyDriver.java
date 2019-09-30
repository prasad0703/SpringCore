import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyDriver {
    public static void main(String... args){
        String[] files = {"spring.xml"};
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(files);
        ConPool c = (ConPool) applicationContext.getBean("cp");
        c.createConnection();
    }
}