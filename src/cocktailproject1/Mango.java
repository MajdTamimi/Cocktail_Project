package cocktailproject1;

import java.awt.Color;

public class Mango extends Fruit {

    public Mango() {
        super(60, "Mango", 100, new Color(255, 204, 0));
    }

    @Override
    public String getInfo() {
        return name + ": { " + " calories = " + calories + " ,volume = " + volume + " ,color in RGB = (" + getColor().getRed() + ", " + getColor().getGreen() + ", " + getColor().getBlue() + ")" + " }\n";
    }
}
