import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

public class ConPool {
    private String driver,url;

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void createConnection(){
        System.out.println("driver: "+driver+" url: "+url);
    }
}
