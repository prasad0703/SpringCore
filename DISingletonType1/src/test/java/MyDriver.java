import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;


public class MyDriver {
    public static void main(String... args){
        ApplicationContext ap = new ClassPathXmlApplicationContext("spring.xml");
        MySingleton s1 = (MySingleton) ap.getBean("s");
        MySingleton s2 = (MySingleton) ap.getBean("s");
        //check if singleton
        System.out.println(s1==s2);
        Calendar c1 = (Calendar) ap.getBean("c");
        Calendar c2 = (Calendar) ap.getBean("c");
        System.out.println(c1==c2);
    }


}