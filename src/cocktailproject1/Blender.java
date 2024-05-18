/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailproject1;
import java.util.ArrayList;
import java.awt.Color;
/**
 *
 * @author hp
 */
public class Blender {
    private double capacity;
    ArrayList<Ingredients> ingredients;
    private double testCapacity;

    public Blender() {
    this.capacity=2000;
    this.ingredients =new ArrayList<>();
    this.testCapacity=capacity;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public ArrayList<Ingredients> getIngredients() {
        return this.ingredients;
    }

    public void setIngredients(ArrayList<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }

    public String getInfo() {
         String all="";
        for (int i = 0; i < ingredients.size(); i++) {
            String getName = ingredients.get(i).getName();
           all=all+getName+",";
        }
        return "Blender:{" + "capacity:" + this.capacity +" , Ingredients are:["+ all+"]"+ '}';
        
    }
    
    public void add(Ingredients item) throws BlenderExp{
        ingredients.add(item);
        if(testCapacity>=item.getVolume()){
           testCapacity-=item.getVolume();
       }
       else{
           throw new BlenderExp();
       }

    }    

    public double totalVolume(){
        double totalvol=0;
        for (int i = 0; i < ingredients.size(); i++) {
            double get = ingredients.get(i).getVolume();
            totalvol+=get;
        }
        return totalvol;
    }
    public double totalCalories(){
        double totalcal=0;
        for (int i = 0; i < ingredients.size(); i++) {
            double get = ingredients.get(i).getCalories();
            totalcal+=get;
        }
        return totalcal;
        
    }
    public void blend(Cocktail cocktail) {
          
          Color mergedColor = new Color(0,0,0,0);
          for (int i = 0; i < ingredients.size(); i++) {
              Ingredients get1 = ingredients.get(i);

              int mergedR = (get1.getColor().getRed() + mergedColor.getRed()) / 2;
              int mergedG = (get1.getColor().getGreen() +mergedColor.getGreen()) / 2;
              int mergedB = (get1.getColor().getBlue() + mergedColor.getBlue()) / 2;
              mergedColor=new Color(mergedR,mergedG,mergedB);
          }
          cocktail.setColor(mergedColor);
          cocktail.setCalories(totalCalories());
          cocktail.setVolume(totalVolume());   
    }
}
