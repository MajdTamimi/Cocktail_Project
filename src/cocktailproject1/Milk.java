package cocktailproject1;

import java.awt.Color;

public class Milk extends Ingredients {

    public Milk() {
        super(42, "Milk", 100, new Color(255, 255, 255));
    }

    @Override
    public String getInfo() {
        return name + ": { " + " calories = " + calories + " ,volume = " + volume + " ,color in RGB = (" + getColor().getRed() + ", " + getColor().getGreen() + ", " + getColor().getBlue() + ")" + " }\n";
    }
}
