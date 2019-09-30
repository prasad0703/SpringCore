import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyDriver {
    public static void main(String... args){
        String[] files = {"springConstructor.xml"};
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(files);
        Bus a = (Bus) applicationContext.getBean("b");
        a.printBusInfo();
    }
}