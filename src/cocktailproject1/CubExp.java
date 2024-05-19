/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailproject1;

/**
 *
 * @author hp
 */
public class CubExp extends Exception{
    @Override
    public String getMessage() {
       return "The number of full cups are: " + Cubs.cubsNo + " Cups.\nCan't pour more full cups !!"  ;
    }
    
}
