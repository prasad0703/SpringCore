import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Test implements InitializingBean, DisposableBean {
    String myVar;

    public void setMyVar(String myVar) {
        this.myVar = myVar;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Myvar variable value: "+ myVar);
        System.out.println("Inside afterPropertiesSet method");
    }

    public void printData() {
        System.out.println("This is PrintData method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Inside destroy method");
    }
}
