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
public class Mango extends Fruit {
    
    public Mango() {
        super(50, "Mango", 20, new Color(255,204,0));
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
