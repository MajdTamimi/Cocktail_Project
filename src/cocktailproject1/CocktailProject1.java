/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cocktailproject1;

/**
 *
 * @author hp
 */
public class CocktailProject1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Logger logger = new ConsoleLogger();
        Blender blender = new Blender(logger);
        Cocktail c=new Cocktail();

        try{
        Milk m1=new Milk();
        blender.add(m1);
        Sugar s1=new Sugar();
        blender.add(s1);
        Mango fruit1=new Mango();
        blender.add(fruit1);
        Kiwi fruit2=new Kiwi();
        blender.add(fruit2);
        Strawberry fruit3=new Strawberry();
        blender.add(fruit3);
        Strawberry fruit5=new Strawberry();
        blender.add(fruit5);
        Strawberry fruit6=new Strawberry();
        blender.add(fruit6);
        Strawberry fruit7=new Strawberry();
        blender.add(fruit7);
        Banana fruit4=new Banana();
        blender.add(fruit4);
        Apple fruit8=new Apple();
        blender.add(fruit8);
        blender.blend(c);
        Cubs cub = new Cubs(c, logger);
        cub.pour();
        }
        catch(BlenderExp ex){
            System.out.println(ex.getMessage());
        }
        catch(CocktailExp ex){
            System.out.println(ex.getMessage());
        }
        catch(CubExp ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
