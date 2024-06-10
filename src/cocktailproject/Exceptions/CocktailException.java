package cocktailproject.Exceptions;

public class CocktailException extends Exception {

    @Override
    public String getMessage() {
        return "Blender is Empty!!";
    }

}
