package cocktailproject1;

import java.awt.Color;

public class Banana extends Fruit {

    public Banana() {
        super(88, "Banana", 100, new Color(255, 255, 53));
    }

    @Override
    public String getInfo() {
        return name + ": { " + " calories = " + calories + " ,volume = " + volume + " ,color in RGB = (" + getColor().getRed() + ", " + getColor().getGreen() + ", " + getColor().getBlue() + ")" + " }\n";
    }

}
