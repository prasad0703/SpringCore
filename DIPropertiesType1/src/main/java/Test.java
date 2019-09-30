import java.util.Map;
import java.util.Properties;

public class Test {
    Properties p;

    public void setP(Properties p) {
        this.p = p;
    }

    public void printData(){
        for (Map.Entry e :
                p.entrySet()) {
            System.out.println("Key:"+e.getKey()+" value:"+e.getValue());
        }
    }
}
