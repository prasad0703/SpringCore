import java.util.*;

public class Test {
    Vector<String> fruits;
    TreeSet<String> cricketers;
    Hashtable<String, String> countryToCapital;

    public void setFruits(Vector<String> fruits) {
        this.fruits = fruits;
    }

    public void setCricketers(TreeSet<String> cricketers) {
        this.cricketers = cricketers;
    }

    public void setCountryToCapital(Hashtable<String, String> countryToCapital) {
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
