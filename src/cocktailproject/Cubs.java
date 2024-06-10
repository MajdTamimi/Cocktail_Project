package cocktailproject1;

import cocktailproject1.Exceptions.CocktailExp;
import cocktailproject1.Exceptions.CubExp;
import java.util.Calendar;

public class Cubs {

    private int capacity;
    private Cocktail cocktail;
    private double cubCalorie;
    public static int cubsNo;    
    private Logger logger;
    private double testVolume; 
    Calendar c = Calendar.getInstance();

    public Cubs(Cocktail cocktail, Logger logger) {
        this.capacity = 150;
        this.cubCalorie = 0;
        this.cubsNo = 0;
        this.cocktail = cocktail;
        this.testVolume = cocktail.getVolume();
        this.logger = logger;
    }

    public void pour() throws CocktailExp, CubExp {
        if (testVolume != 0) {
            while (testVolume >= this.capacity) {
                testVolume -= this.capacity;
                cubsNo++;
            }
            cubCalorie = cubCalories();
            this.logger.log(c.get(Calendar.DAY_OF_MONTH) + "/" + (c.get(Calendar.MONTH) + 1) + "/" + c.get(Calendar.YEAR) + "--" + c.get(Calendar.HOUR_OF_DAY)
                    + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND) + "\n" + this.getInfo() + "\n");
            throw new CubExp();
        } else {
            this.logger.log(c.get(Calendar.DAY_OF_MONTH) + "/" + (c.get(Calendar.MONTH) + 1) + "/" + c.get(Calendar.YEAR) + "--" + c.get(Calendar.HOUR_OF_DAY)
                    + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND) + "\n" + new CocktailExp().getMessage() + "\n___________________________________________________________\n");
            throw new CocktailExp();
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public double cubCalories() {
        return cocktail.getCalories() * capacity / (cocktail.getVolume());
    }

    public double getCubCalorie() {
        return cubCalorie;
    }

    public void setCubCalorie(double cubCalorie) {
        this.cubCalorie = cubCalorie;
    }

    public static int getCubsNo() {
        return cubsNo;
    }

    public static void setCubsNo(int cubsNo) {
        Cubs.cubsNo = cubsNo;
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
        return "Cups\nNumber of full cups: " + cubsNo + " Cups.\nCup capacity: " + capacity + " ml.\nCalories in each cup: " + Math.round(cubCalorie) + " Cal.\n___________________________________________________________";
    }

}
