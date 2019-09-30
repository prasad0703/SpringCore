public class MySingleton {
    private static MySingleton mySingleton;
    private MySingleton() throws IllegalAccessException {
        System.out.println("Creating Singleton Object");
    }
    public static MySingleton getInstance() throws IllegalAccessException {
        System.out.println("Inside get Instance method");
        if(mySingleton==null){
            mySingleton = new MySingleton();
            return mySingleton;
        }else
            return mySingleton;
    }
}
