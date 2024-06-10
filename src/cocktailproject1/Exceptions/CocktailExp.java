package cocktailproject1.Exceptions;

public class CocktailExp extends Exception {

    @Override
    public String getMessage() {
        return "Blender is Empty!!";
    }

}
