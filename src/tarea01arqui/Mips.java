/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tarea01arqui;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author b06789
 */
public class Mips {
    
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

            Mips mips = new Mips(args[0]);
          
            }catch (Exception e){//Catch exception if any
              System.err.println("Error: " + e.getMessage());
            }
        
        
        
    }
    
    public Mips(String archivo) throws IOException{
        
        Scanner scanner = new Scanner(new File(archivo));
        memInstrucciones = new int[400];
        
        int i = 0;
        
        while(scanner.hasNextInt()){
            memInstrucciones[i++]=scanner.nextInt();
        }
        
        
        
        //System.out.println(Arrays.toString(memInstrucciones));
        
    }
    
    
}
