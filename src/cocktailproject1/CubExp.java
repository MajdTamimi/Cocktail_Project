package cocktailproject1;

public class CubExp extends Exception {
    
    @Override
    public String getMessage() {
       return "The number of full cups are: " + Cubs.cubsNo + " Cups.\nCan't pour more full cups !!";
    } 
}
