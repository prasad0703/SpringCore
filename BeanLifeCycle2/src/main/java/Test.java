import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Test {
    String myVar;

    public void setMyVar(String myVar) {
        this.myVar = myVar;
    }

    public void myInitMethod() throws Exception {
        System.out.println("Myvar variable value: "+ myVar);
        System.out.println("Inside myInitMethod method");
    }

    public void printData() {
        System.out.println("This is PrintData method");
    }

    public void myDestroyMethod() throws Exception {
        System.out.println("Inside myDestroyMethod method");
    }
}
