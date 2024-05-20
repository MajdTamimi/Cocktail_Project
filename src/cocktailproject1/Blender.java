/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailproject1;
import java.util.ArrayList;
import java.awt.Color;
import java.util.Calendar;
/**
 *
 * @author hp
 */
public class Blender {
    private double capacity;
    ArrayList<Ingredients> ingredients;
    private double testCapacity;
    private Logger logger;
    Calendar c = Calendar.getInstance();
    

    public Blender(Logger logger) {
    this.capacity = 1500;
    this.ingredients = new ArrayList<>();
    this.testCapacity = capacity;
    this.logger = logger;
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
           all = all + getName+" ,";
        }
        return "Blender\nCapacity: " + this.capacity +"ml.\nIngredients are: ["+ all+"]"+ "\n";
        
    }
    
    public void add(Ingredients item) throws BlenderExp{
        if(testCapacity >= item.getVolume()){
           ingredients.add(item);
           testCapacity -= item.getVolume();
           this.logger.log(c.get(Calendar.DAY_OF_MONTH) + "/" + (c.get(Calendar.MONTH)+1) + "/" + c.get(Calendar.YEAR)  + "--" + c.get(Calendar.HOUR_OF_DAY)
                        + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND) + "\nName of added ingredient: " + item.getName() + "\n___________________________________________________________\n");
       }
       else{
            this.logger.log(c.get(Calendar.DAY_OF_MONTH) + "/" + (c.get(Calendar.MONTH)+1) + "/" + c.get(Calendar.YEAR)  + "--" + c.get(Calendar.HOUR_OF_DAY)
                       + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND) + "\n" +new BlenderExp().getMessage() +"\n___________________________________________________________\n" );
           throw new BlenderExp();        
       }
    }    

    public double totalVolume(){
        double totalVolume = 0;
        for (int i = 0; i < ingredients.size(); i++) {
            double get = ingredients.get(i).getVolume();
            totalVolume += get;
        }
        return totalVolume;
    }
    public double totalCalories(){
        double totalcal = 0;
        for (int i = 0; i < ingredients.size(); i++) {
            double get = ingredients.get(i).getCalories();
            totalcal+=get;
        }
        return totalcal;
        
    }
    public void blend(Cocktail cocktail) {
          
          Color mergedColor = new Color(255, 250,250);
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
          this.logger.log(c.get(Calendar.DAY_OF_MONTH) + "/" + (c.get(Calendar.MONTH)+1) + "/" + c.get(Calendar.YEAR)  + "--" + c.get(Calendar.HOUR_OF_DAY)
                       + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND) + "\n" + this.getInfo() + "\n" + cocktail.getInfo());
          
    }
    public void clear(Cocktail cocktail){
        ingredients.clear();
        cocktail.setVolume(0);
        cocktail.setCalories(0);
        cocktail.setColor(new Color(255, 250, 250));
        testCapacity = capacity;
        this.logger.log(c.get(Calendar.DAY_OF_MONTH) + "/" + (c.get(Calendar.MONTH)+1) + "/" + c.get(Calendar.YEAR)  + "--" + c.get(Calendar.HOUR_OF_DAY)
                       + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND) + "\nClear\n" + this.getInfo() + "\n" + cocktail.getInfo());
        
    }
}
