package cocktailproject1;

import java.awt.Color;

public class Apple extends Fruit {

    public Apple() {
        super(52, "Apple", 100, new Color(102, 204, 51));
    }

    @Override
    public String getInfo() {
        return name + ": { " + " calories= " + calories + " ,volume= " + volume + " ,color in RGB= (" + getColor().getRed() + ", " + getColor().getGreen() + ", " + getColor().getBlue() + ")" + " }\n";
    }

}
