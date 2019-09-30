import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyDriver {
    public static void main(String... args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        MyTest t = (MyTest) applicationContext.getBean("t");
        t.hello("Prasad");
    }
}