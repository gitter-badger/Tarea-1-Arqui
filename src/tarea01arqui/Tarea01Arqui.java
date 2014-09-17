/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tarea01arqui;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 *
 * @author b06789
 */
public class Tarea01Arqui {
    
    public int memInstrucciones[];
    public int memDatos[];
    
    public static void main(String args[]){
        try{
            // Open the file that is the first 
            // command line parameter
            if(args.length != 1) {
                System.err.println("Invalid command line, exactly one argument required");
                System.exit(1);
            }
            
            FileInputStream fstream = new FileInputStream(args[0]);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            //Read File Line By Line
            while ((strLine = br.readLine()) != null)   {
              // Print the content on the console
              System.out.println (strLine);
            }
            //Close the input stream
            br.close();
            }catch (Exception e){//Catch exception if any
              System.err.println("Error: " + e.getMessage());
            }
        
        
        
    }
    
    
}
