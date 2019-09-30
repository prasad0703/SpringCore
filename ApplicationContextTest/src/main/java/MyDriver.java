import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyDriver {
    public static void main(String... args){
        System.out.println("before applicationContext");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println("after applicationContext");
        MyTest t1 = (MyTest) applicationContext.getBean("t");
        MyTest t2 = (MyTest) applicationContext.getBean("t");
        MyTest t3 = (MyTest) applicationContext.getBean("t");
        System.out.println("after getting bean");
        t1.hello();
    }
}