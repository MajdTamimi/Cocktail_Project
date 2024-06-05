package cocktailproject1;

import cocktailproject1.Ingredients;
import java.awt.Color;

public abstract class Fruit extends Ingredients {

    public Fruit(double calories, String name, double volume, Color color) {
        super(calories, name, volume, color);
    }      
}
