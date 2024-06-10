package cocktailproject.Exceptions;

import cocktailproject.Cup;

public class CupException extends Exception {
    
    @Override
    public String getMessage() {
       return "The number of full cups are: " + Cup.cupsNo + " Cups.\nCan't pour more full cups !!";
    } 
}
