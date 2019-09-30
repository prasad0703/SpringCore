import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Test {
    String myVar;

    public void setMyVar(String myVar) {
        this.myVar = myVar;
    }

    @PostConstruct
    public void myInitMethod() throws Exception {
        System.out.println("Myvar variable value: "+ myVar);
        System.out.println("Inside myInitMethod method");
    }

    public void printData() {
        System.out.println("This is PrintData method");
    }

    @PreDestroy
    public void myDestroyMethod() throws Exception {
        System.out.println("Inside myDestroyMethod method");
    }
}
