import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
    List<String> fruits;
    Set<String> cricketers;
    Map<String, String> countryToCapital;

    public List<String> getFruits() {
        return fruits;
    }

    public void setFruits(List<String> fruits) {
        this.fruits = fruits;
    }

    public Set<String> getCricketers() {
        return cricketers;
    }

    public void setCricketers(Set<String> cricketers) {
        this.cricketers = cricketers;
    }

    public Map<String, String> getCountryToCapital() {
        return countryToCapital;
    }

    public void setCountryToCapital(Map<String, String> countryToCapital) {
        this.countryToCapital = countryToCapital;
    }

    public void printData(){
        System.out.println("Fruits...........");
        System.out.println(fruits.toString());
        System.out.println("Cricketers...........");
        System.out.println(cricketers.toString());
        System.out.println("Country To Capitals......");
        System.out.println(countryToCapital.entrySet().toString());

    }

}
