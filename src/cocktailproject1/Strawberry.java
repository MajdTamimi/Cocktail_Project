/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailproject1;
import cocktailproject1.Fruit;
import java.awt.Color;

/**
 *
 * @author hp
 */
public class Strawberry extends Fruit{

    public Strawberry() {
        super(35, "Strawberry", 22, new Color(229,57,57));
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
