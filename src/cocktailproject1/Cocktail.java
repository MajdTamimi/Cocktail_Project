package cocktailproject1;

import java.awt.Color;

public class Cocktail {

    private double calories;
    private Color color;
    private double volume;

    public Cocktail() {
        this.calories = 0;
        this.color = new Color(255, 250, 250);
        this.volume = 0;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getInfo() {
        return "Cocktail\nCalories: " + Math.round(calories) + " Cal.\nVolume: " + volume + " ml.\nColor in RGB: (" + color.getRed() + ", " + color.getGreen() + ", " + color.getBlue() + ")\n___________________________________________________________\n";
    }

}
