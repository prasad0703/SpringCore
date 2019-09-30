import org.springframework.beans.factory.annotation.Required;

public class Test {
    String var1;
    String var2;

    public String getVar1() {
        return var1;
    }

    public void setVar1(String var1) {
        this.var1 = var1;
    }

    public String getVar2() {
        return var2;
    }

    @Required
    public void setVar2(String var2) {
        this.var2 = var2;
    }

    public void printVariables(){
        System.out.println("var1: "+var1);
        System.out.println("var2: "+var2);
    }
}
