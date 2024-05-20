/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailproject1;

import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class Cubs {
    private int capacity;
    private double cubCalorie;
    public static int cubsNo;
    private double testVolume;
    private Cocktail cocktail;
    private Logger logger;
    Calendar c = Calendar.getInstance();


    public Cubs(Cocktail cocktail,Logger logger) {
        this.capacity = 150;
        this.cubCalorie = 0;
        this.cubsNo = 0;
        this.testVolume = cocktail.getVolume();
        this.cocktail = cocktail;
        this.logger = logger;
    }

    public int getCapacity() {
        return capacity;
    }
     
    public void pour()throws CocktailExp, CubExp{
        if(testVolume != 0){
            while(testVolume >= this.capacity)
            {
              testVolume-=this.capacity;
              cubsNo++; 
            }
            cubCalorie=cubCalories();
            System.out.println("The number of full cubs= "+cubsNo);
            this.logger.log(c.get(Calendar.DAY_OF_MONTH) + "/" + (c.get(Calendar.MONTH)+1) + "/" + c.get(Calendar.YEAR)  + "--" + c.get(Calendar.HOUR_OF_DAY)
                        + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND) + "\n" + this.getInfo() + "\n");
            throw new CubExp();
        }
        else{
            this.logger.log(c.get(Calendar.DAY_OF_MONTH) + "/" + (c.get(Calendar.MONTH)+1) + "/" + c.get(Calendar.YEAR)  + "--" + c.get(Calendar.HOUR_OF_DAY)
                       + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND) + "\n" +new CocktailExp().getMessage() +"\n___________________________________________________________\n" );
            throw new CocktailExp();
        }
        
              
        
    }  
    
    public double cubCalories(){
         return cocktail.getCalories()*capacity/(cocktail.getVolume());
    }
    
    public String getInfo() {
//        return "Cub{" + "capacity= " + capacity +", cubCalories= "+cubCalorie+",numberOfFullCubs= "+cubsNo+'}';
    return "Cups\nNumber of full cups: " + cubsNo + " Cups.\nCup capacity: " + capacity + " ml.\nCalories in each cup: " + Math.round(cubCalorie)+ " Cal.\n___________________________________________________________";
    }
    
    
    
}
