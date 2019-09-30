import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class MyDriver {
    public static void main(String... args){
        Resource r = new ClassPathResource("spring.xml");
        System.out.println("before beanfactory");
        BeanFactory beanFactory = new XmlBeanFactory(r);
        System.out.println("after beanfactory");
        MyTest t1 = (MyTest) beanFactory.getBean("t");
        MyTest t2 = (MyTest) beanFactory.getBean("t");
        MyTest t3 = (MyTest) beanFactory.getBean("t");
        System.out.println("after getting bean");
        t1.hello();
    }
}