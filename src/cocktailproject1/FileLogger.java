/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailproject1;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author majd2
 */
public class FileLogger implements Logger{
    private String filePath;
 
    public FileLogger(String filePath) {
        this.filePath = filePath;
    }
    
    @Override
    public void log(String msg) {
        try{
        FileWriter fw = new FileWriter(this.filePath, true);
        fw.write(msg);
        fw.close();
        } 
        catch(IOException ex){
            System.out.println(ex.getMessage());
             
        }
    
    } 
}
