import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyDriver {

    public static void main(String... args){
        ApplicationContext ap = new ClassPathXmlApplicationContext("spring.xml");
        Bank b = (Bank) ap.getBean("b");
        b.calInt();
        b.deposit();
        b.withdraw();
    }
}

