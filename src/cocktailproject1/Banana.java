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
public class Banana extends Fruit{
     
    public Banana() {
        super(60,"Banana",40,new Color(255,255,53));
 
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
