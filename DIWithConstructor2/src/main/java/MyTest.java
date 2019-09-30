public class MyTest {
    String name;
    int age;
    String email;

    MyTest(String name){
        this.name = name;
    }
    MyTest(int age){
        this.age = age;
    }
    MyTest(String name, int age, String email){
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public void hello(){
        System.out.println("Hello "+" "+name+"! age: "+age+" email: "+email);
    }
}
