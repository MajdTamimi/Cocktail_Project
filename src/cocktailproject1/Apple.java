/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailproject1;
import java.awt.Color;

/**
 *
 * @author hp
 */
public class Apple extends Fruit{
    
    public Apple() {
        super(36, "Apple", 13, new Color(102,204,51));
    }
    /**
     *
     * @return
     */
   @Override
    public String getInfo()
    {
        return name+": { "+" calories= "+calories+" ,volume= "+volume+" ,color in RGB= "+getColor().getRed()+", "+getColor().getGreen()+", "+getColor().getBlue()+")"+" }\n";
    }
    
}
