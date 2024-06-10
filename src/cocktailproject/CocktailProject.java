package cocktailproject;

import cocktailproject.Exceptions.CocktailException;
import cocktailproject.Exceptions.BlenderException;
import cocktailproject.Exceptions.CupException;
import java.util.Scanner;

public class CocktailProject {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Logger logger2 = new ConsoleLogger();
        Blender blender = new Blender(logger2);
        Cocktail cocktail = new Cocktail();
        Cup cup = new Cup(cocktail, logger2);

        do {
            System.out.println(
                    "1. Add Ingredient: \n-Apple\n-Banana\n-BlueBerry\n-Kiwi\n-Mango\n-Strawberry\n-Milk:\n-Suger" +
                     "\n2. Blend the Ingredients :\n" +
                     "3. Pour on the Cubs:\n" +
                     "4. Print the information about:\n-Blender\n-Cocktail\n-Cups\n" +
                     "5. Clear:\n" +
                     "6. Exit:");

            int x = input.nextInt();

            switch (x) {
                case 1:
                    try {
                        System.out.println("Enter Your choice: " + "\n___________________________\n");
                        String ingredient = input.next();
                        if (ingredient.equalsIgnoreCase("Apple")) {
                            blender.add(new Apple());
                        } else if (ingredient.equalsIgnoreCase("Banana")) {
                            blender.add(new Banana());
                        } else if (ingredient.equalsIgnoreCase("BlueBerry")) {
                            blender.add(new BlueBerry());
                        } else if (ingredient.equalsIgnoreCase("Kiwi")) {
                            blender.add(new Kiwi());
                        } else if (ingredient.equalsIgnoreCase("Mango")) {
                            blender.add(new Mango());
                        } else if (ingredient.equalsIgnoreCase("Strawberry")) {
                            blender.add(new Strawberry());
                        } else if (ingredient.equalsIgnoreCase("Milk")) {
                            blender.add(new Milk());
                        } else if (ingredient.equalsIgnoreCase("Sugar")) {
                            blender.add(new Sugar());
                        }
                    } catch (BlenderException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;

                case 2:
                    System.out.println("\n___________________________\n");
                    blender.blend(cocktail);
                    break;

                case 3:
                    try {
                        cup = new Cup(cocktail, logger2);
                        cup.pour();
                        System.out.println("\n___________________________\n");
                    } catch (CocktailException ex) {
                        System.out.println(ex.getMessage());
                    } catch (CupException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;

                case 4:
                    cup.setCocktail(cocktail);
                    System.out.println("Enter Your choice: " + "\n___________________________\n");
                    String information = input.next();
                    if (information.equalsIgnoreCase("Blender")) {
                        System.out.println(blender.getInfo());
                    } else if (information.equalsIgnoreCase("Cocktail")) {
                        System.out.println(cocktail.getInfo());
                    } else if (information.equalsIgnoreCase("Cups")) {
                        System.out.println(cup.getInfo());
                    }
                    break;

                case 5:
                    System.out.println("\n___________________________\n");
                    blender.clear(cocktail);
                    cup.setCupCalorie(0);
                    cup.setTestVolume(0);
                    Cup.setCupsNo(0);
                    break;

                case 6:
                    System.exit(0);
                    break;
            }
        } while (true);
    }

}
