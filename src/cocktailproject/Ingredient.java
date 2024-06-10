package cocktailproject;

import java.awt.Color;

public abstract class Ingredient {

    protected double calories;
    protected Color IngredientsColor;
    protected String name;
    protected double volume;

    public Ingredient(double calories, String name, double volume, Color IngredientsColor) {
        this.calories = calories;
        this.name = name;
        this.volume = volume;
        this.IngredientsColor = IngredientsColor;
    }

    public double getVolume() {
        return volume;
    }

    public double getCalories() {
        return calories;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return IngredientsColor;
    }

    public String getInfo() {
        return name + ": { " + " calories = " + calories + " ,volume = " + volume + " ,color in RGB = (" + getColor().getRed() + ", " + getColor().getGreen() + ", " + getColor().getBlue() + ")" + " }\n";
    }
}
