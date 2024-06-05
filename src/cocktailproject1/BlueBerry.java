package cocktailproject1;

import java.awt.Color;

public class BlueBerry extends Fruit {
    
    public BlueBerry() {
        super(80, "BlueBerry", 100, new Color(0,0,139));
    }

    @Override
    public String getInfo() {
        return name + ": { " + " calories = " + calories + " ,volume = " + volume + " ,color in RGB = (" + getColor().getRed() + ", " + getColor().getGreen() + ", "+getColor().getBlue() + ")" + " }\n";
    }
    
}
