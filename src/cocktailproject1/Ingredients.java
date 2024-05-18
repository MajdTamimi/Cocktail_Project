/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailproject1;
import java.awt.Color;
/**

 *
 * @author hp
 */
public abstract class  Ingredients {
     protected double calories;
     protected String name;
     protected double volume;
     protected Color IngredientsColor;


    public Ingredients(double calories, String name, double volume, Color IngredientsColor) {
        this.calories = calories;
        this.name = name;
        this.volume=volume;
        this.IngredientsColor=IngredientsColor;
    }  
    
    public double getVolume() {
        return volume;
    }

    public double getCalories() {
        return calories;
    }

    public String getName() {
        return name;
    }
    
    
    public Color getColor(){
        return IngredientsColor;
    }
    
    public abstract String getInfo();
     
    
     
}
