/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailproject1;

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


    public Cubs(Cocktail cocktail) {
        this.capacity=150;
        this.cubCalorie=0;
        this.cubsNo=0;
        this.testVolume=cocktail.getVolume();
        this.cocktail=cocktail;
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
            throw new CubExp();
        }
        else{
            throw new CocktailExp();
        }
    }  
    
    public double cubCalories(){
         return cocktail.getCalories()*capacity/(cocktail.getVolume());
    }
    
    public String getInfo() {
//        return "Cub{" + "capacity= " + capacity +", cubCalories= "+cubCalorie+",numberOfFullCubs= "+cubsNo+'}';
    return "Cups\nNumber of full cups: " + cubsNo + " Cups.\nCup capacity: " + capacity + " ml.\nCalories in each cup: " + cubCalorie + " Cal.\n___________________________________________________________";
    }
    
    
    
}
