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
 public class Cocktail {
     private double calories;
     private Color color;
     private double volume;

    public Cocktail() {
       this.calories=0;
       this.color=new Color(0,0,0,0);
       this.volume=0;
    } 
     
    public double getCalories() {
        return calories;
    }

     public void setCalories(double calories) {
        this.calories = calories;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getInfo() {
        return "Cocktail{" + "calories=" + calories + " ,color in RGB= ("+color.getRed()+", "+color.getGreen()+", "+color.getBlue()+ "), volume=" + volume + '}';
    }
     
    
}
