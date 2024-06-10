package cocktailproject;

import cocktailproject.Exceptions.BlenderException;
import java.util.ArrayList;
import java.awt.Color;
import java.util.Calendar;

public class Blender {

    private double capacity;
    private Logger logger;
    private double testCapacity;
    ArrayList<Ingredient> ingredients;
    Calendar c = Calendar.getInstance();

    public Blender(Logger logger) {
        this.capacity = 1500;
        this.ingredients = new ArrayList<>();
        this.testCapacity = capacity;
        this.logger = logger;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public ArrayList<Ingredient> getIngredients() {
        return this.ingredients;
    }

    public String getInfo() {
        String allIngredients = "";
        for (int i = 0; i < ingredients.size(); i++) {
            String getName = ingredients.get(i).getName();
            allIngredients = allIngredients + getName + " ,";
        }
        return "Blender\nCapacity: " + this.capacity + "ml.\nIngredients are: [" + allIngredients + "]" + "\n";
    }

    public void add(Ingredient item) throws BlenderException {
        if (testCapacity >= item.getVolume()) {
            ingredients.add(item);
            testCapacity -= item.getVolume();
            this.logger.log(DateTimeLogger.historyLogger() + "\nName of added ingredient: " + item.getName() + "\n___________________________________________________________\n");
        } else {
            this.logger.log(DateTimeLogger.historyLogger() + new BlenderException().getMessage() + "\n___________________________________________________________\n");
            throw new BlenderException();
        }
    }

    public double getTotalVolume() {
        double totalVolume = 0;
        for (int i = 0; i < ingredients.size(); i++) {
            double ingredientVolume = ingredients.get(i).getVolume();
            totalVolume += ingredientVolume;
        }
        return totalVolume;
    }

    public double getTotalCalories() {
        double totalcalory = 0;
        for (int i = 0; i < ingredients.size(); i++) {
            double ingredientCalory = ingredients.get(i).getCalories();
            totalcalory += ingredientCalory;
        }
        return totalcalory;
    }

    public void blend(Cocktail cocktail) {
        Color mergedColor = new Color(255, 250, 250);
        int mergedR1 = 0;
        int mergedG1 = 0;
        int mergedB1 = 0;
        for (int i = 0; i < ingredients.size(); i++) {
            Ingredient get1 = ingredients.get(i);
            mergedR1 += get1.getColor().getRed();
            mergedG1 += get1.getColor().getGreen();
            mergedB1 += get1.getColor().getBlue();

        }
        if(ingredients.size()!= 0){
        int mergedR = mergedR1 / ingredients.size();
        int mergedG = mergedG1 / ingredients.size();
        int mergedB = mergedB1 / ingredients.size();
        
        mergedColor = new Color(mergedR, mergedG, mergedB);
        cocktail.setColor(mergedColor);
        cocktail.setCalories(getTotalCalories());
        cocktail.setVolume(getTotalVolume());
        this.logger.log(DateTimeLogger.historyLogger() + "\n" + this.getInfo() + "\n" + cocktail.getInfo());
        }
    }

    public void clear(Cocktail cocktail) {
        ingredients.clear();
        cocktail.setVolume(0);
        cocktail.setCalories(0);
        cocktail.setColor(new Color(255, 250, 250));
        testCapacity = capacity;
        this.logger.log(DateTimeLogger.historyLogger() + "\nClear\n" + this.getInfo() + "\n" + cocktail.getInfo());
    }

}
