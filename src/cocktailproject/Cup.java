package cocktailproject;

import cocktailproject.Exceptions.CocktailException;
import cocktailproject.Exceptions.CupException;
import java.util.Calendar;

public class Cup {

    private int capacity;
    private Cocktail cocktail;
    private double cupCalorie;
    public static int cupsNo;
    private Logger logger;
    private double testVolume;
    Calendar c = Calendar.getInstance();

    public Cup(Cocktail cocktail, Logger logger) {
        this.capacity = 150;
        this.cupCalorie = 0;
        this.cupsNo = 0;
        this.cocktail = cocktail;
        this.testVolume = cocktail.getVolume();
        this.logger = logger;
    }

    public void pour() throws CocktailException, CupException {
        if (testVolume != 0) {
            while (testVolume >= this.capacity) {
                testVolume -= this.capacity;
                cupsNo++;
            }
            cupCalorie = getCupCalories();
            this.logger.log(DateTimeLogger.historyLogger() + "\n" + this.getInfo() + "\n");
            throw new CupException();
        } else {
            this.logger.log(DateTimeLogger.historyLogger() + "\n" + new CocktailException().getMessage() + "\n___________________________________________________________\n");
            throw new CocktailException();
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public double getCupCalories() {
        return cocktail.getCalories() * capacity / (cocktail.getVolume());
    }

    public double getCupCalorie() {
        return cupCalorie;
    }

    public void setCupCalorie(double cubCalorie) {
        this.cupCalorie = cubCalorie;
    }

    public static int getCupsNo() {
        return cupsNo;
    }

    public static void setCupsNo(int cubsNo) {
        Cup.cupsNo = cubsNo;
    }

    public double getTestVolume() {
        return testVolume;
    }

    public void setTestVolume(double testVolume) {
        this.testVolume = testVolume;
    }

    public Cocktail getCocktail() {
        return cocktail;
    }

    public void setCocktail(Cocktail cocktail) {
        this.cocktail = cocktail;
    }

    public String getInfo() {
        return "Cups\nNumber of full cups: " + cupsNo + " Cups.\nCup capacity: " + capacity + " ml.\nCalories in each cup: " + Math.round(cupCalorie) + " Cal.\n___________________________________________________________";
    }

}
