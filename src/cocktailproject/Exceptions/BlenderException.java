package cocktailproject.Exceptions;

public class BlenderException extends Exception {

    @Override
    public String getMessage() {
        return "Blender OverFLow!!";
    }

}
