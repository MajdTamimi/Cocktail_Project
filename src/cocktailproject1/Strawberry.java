package cocktailproject1;

import cocktailproject1.Fruit;
import java.awt.Color;

public class Strawberry extends Fruit {

    public Strawberry() {
        super(33, "Strawberry", 100, new Color(229,57,57));
    }

    @Override
    public String getInfo() {
        return name + ": { " + " calories = " + calories + " ,volume = " + volume + " ,color in RGB = (" + getColor().getRed() + ", " + getColor().getGreen() + ", "+getColor().getBlue() + ")" + " }\n";
    }
    
}
