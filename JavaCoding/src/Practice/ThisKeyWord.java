package Practice;

class Country {
    String continent;
    int noOfTimeZone;
    boolean hasControlOverBigArea;

    Country(String continent, int noOfTimeZone) {
        this(continent, noOfTimeZone, noOfTimeZone > 2);

    }

    Country(String continent, int onOfTimeZOne, boolean hasControlOverBigArea){
        this.continent = continent;
        this.noOfTimeZone = onOfTimeZOne;
        this.hasControlOverBigArea = hasControlOverBigArea;
    }


}
public class ThisKeyWord {

    public static void main(String[] args) {
        Country c = new Country("Asia", 3);
        System.out.println(c.continent);
        System.out.println(c.noOfTimeZone);
        System.out.println(c.hasControlOverBigArea);
    }
}
