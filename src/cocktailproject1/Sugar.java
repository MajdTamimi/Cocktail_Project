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
public class Sugar extends Ingredients {

    public Sugar() {
       super(150, "Sugar", 0,new Color(0,0,0,0));

    }
    /**
     *
     * @return
     */
    @Override
    public String getInfo(){
        return name+": { "+" calories= "+calories+" }\n";
        
    }
    
    
}
