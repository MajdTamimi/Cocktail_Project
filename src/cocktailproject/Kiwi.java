package cocktailproject1;

import java.awt.Color;

public class Kiwi extends Fruit {

    public Kiwi() {
        super(61, "Kiwi", 100, new Color(97, 171, 90));
    }

    @Override
    public String getInfo() {
        return name + ": { " + " calories = " + calories + " ,volume = " + volume + " ,color in RGB = (" + getColor().getRed() + ", " + getColor().getGreen() + ", " + getColor().getBlue() + ")" + " }\n";
    }
}
