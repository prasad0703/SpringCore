import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class NewCalcInt implements MethodReplacer {

    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        System.out.println("New Implementation from NewCalcInt Class");
        return obj;
    }
}
