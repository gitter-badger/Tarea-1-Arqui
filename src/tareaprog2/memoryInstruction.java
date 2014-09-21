/*
 * Programa hecho por:
 * Luis Velasquez - B06789
 * Marco Chacon - B11750
 * Ricardo Torres - B06324
 */
package tareaprog2;

import java.util.Arrays;
import java.util.Scanner;

public class memoryInstruction {
    
    private int memInstructions[];
    
    public memoryInstruction(Scanner archivo){
        
        memInstructions = new int[400];
        
        int i = 0;      
        while(archivo.hasNextInt()){
            memInstructions[i++]=archivo.nextInt();
        }  
        
    }
    
    public int[] getInstruction(int pc){
        
        int[] instruction = Arrays.copyOfRange(memInstructions, pc, (pc+4));
        return instruction;
        
    }
    
}
