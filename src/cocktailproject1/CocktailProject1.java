/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cocktailproject1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;

/**
 *
 * @author hp
 */
public class CocktailProject1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        ArrayList<Ingredients> arr=new ArrayList<>();
        Logger logger1 = new FileLogger("ProjectLoger.log"); 
        Logger logger2 = new ConsoleLogger(); 
        Blender blender = new Blender(logger2);
        Cocktail cocktail=new Cocktail();
        Cubs cup=new Cubs(cocktail,logger2) ;
        Apple fruit1=new Apple();
        Banana fruit2=new Banana();
        BlueBerry fruit3=new BlueBerry();
        Kiwi fruit4=new Kiwi();
        Mango fruit5=new Mango();
        Strawberry fruit6=new Strawberry();
        Sugar s1=new Sugar();
        Milk m1=new Milk();
        do{
            System.out.println(
          "1. Add Ingredient: \n-Apple\n-Banana\n-BlueBerry\n-Kiwi\n-Mango\n-Strawberry\n-Milk:\n-Suger" +
          "\n2. Blend the Ingredients :\n" +
          "3. Pour on the Cubs:\n" +
          "4. Print the information about:\n-Blender\n-Cocktail\n-Cups\n" +
          "5. Clear:\n" +
          "6. Exit:");
        int x=input.nextInt();
        switch(x)
        {
            case 1:
                try{
                System.out.println("Enter Your choice: "+"\n___________________________\n");
                String ingredient=input.next();
                if(ingredient.equalsIgnoreCase("Apple") )
                    blender.add(fruit1);
                else if(ingredient.equalsIgnoreCase("Banana"))
                    blender.add(fruit2);
                else if(ingredient.equalsIgnoreCase("BlueBerry") )
                    blender.add(fruit3);
                else if(ingredient.equalsIgnoreCase("Kiwi") )
                    blender.add(fruit4);
                else if(ingredient.equalsIgnoreCase("Mango") )
                    blender.add(fruit5);
                else if(ingredient.equalsIgnoreCase("Strawberry") )
                    blender.add(fruit6);
                else if(ingredient.equalsIgnoreCase("Milk") )
                    blender.add(m1);
                else if(ingredient.equalsIgnoreCase("Sugar") )
                    blender.add(s1);
                }
                catch(BlenderExp ex){
                    System.out.println(ex.getMessage());
                }
                
                break;
            case 2:
                System.out.println("\n___________________________\n");
                blender.blend(cocktail);
                break;
            case 3:
                try {
                    cup=new Cubs(cocktail,logger2);
                    cup.pour();
                    System.out.println("\n___________________________\n");
                }
                catch(CocktailExp ex){
                    System.out.println(ex.getMessage());
                }
                catch(CubExp ex){
                    System.out.println(ex.getMessage());
                }
                    break;

            case 4:
                cup.setCocktail(cocktail);
                System.out.println("Enter Your choice: "+"\n___________________________\n");
                String information=input.next();
                if(information.equalsIgnoreCase("Blender") )
                    System.out.println(blender.getInfo());
                else if(information.equalsIgnoreCase("Cocktail") )
                    System.out.println(cocktail.getInfo());
                else if(information.equalsIgnoreCase("Cups") )
                    System.out.println(cup.getInfo());
                break;
            case 5:
                System.out.println("\n___________________________\n");
                blender.clear(cocktail);
                cup.setCubCalorie(0);
                cup.setTestVolume(0);
                Cubs.setCubsNo(0);
                break;  
            case 6:
                System.exit(0);
                break;
        } 
        
        }while(true);
    
}
}
