/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailproject1;
/**
 *
 * @author hp
 */
public class Cubs {
    private int capacity;
    private double cubCalorie;
    private double cubsNo;
    private double testVolume;
    private Cocktail cocktail;


    public Cubs(Cocktail cocktail) {
        this.capacity=20;
        this.cubCalorie=0;
        this.cubsNo=0;
        this.testVolume=cocktail.getVolume();
        this.cocktail=cocktail;
    }

    public int getCapacity() {
        return capacity;
    }
     
    public void pour()throws CocktailExp{
        if(testVolume != 0){
            while(testVolume >= this.capacity)
            {
              testVolume-=this.capacity;
              cubsNo++; 
            }

            System.out.println("can't pour more complete cubs!!"+" The number of full cubs= "+cubsNo);   
        }
        else{
            throw new CocktailExp();
        }
        cubCalorie=cubCalories();
    }  
    
    public double cubCalories(){
         return cocktail.getCalories()*capacity/(cocktail.getVolume());
    }
    
    public String getInfo() {
        return "Cub{" + "capacity= " + capacity +", cubCalories= "+cubCalorie+",numberOfFullCubs= "+cubsNo+'}';
    }
    
    
    
}
