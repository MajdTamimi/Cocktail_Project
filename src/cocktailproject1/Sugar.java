package cocktailproject1;

import java.awt.Color;

public class Sugar extends Ingredients {

    public Sugar() {
        super(386, "Sugar", 100, new Color(255, 250, 250));
    }

    @Override
    public String getInfo() {
        return name + ": { " + " calories = " + calories + " ,volume = " + volume + " ,color in RGB = (" + getColor().getRed() + ", " + getColor().getGreen() + ", " + getColor().getBlue() + ")" + " }\n";
    }
}
