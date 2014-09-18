/*
 * Programa hecho por:
 * Luis Velasquez - B06789
 * Marco Chacon - B11750
 * Ricardo Torres - B06324
 */

package tareaprog2;

import java.io.File;
import java.io.IOException;
//import java.util.Arrays;
import java.util.Scanner;
import tareaprog2.pipeline.Decode;
import tareaprog2.pipeline.Execute;
import tareaprog2.pipeline.Fetch;
import tareaprog2.pipeline.Memory;
import tareaprog2.pipeline.Writeback;


public class Mips {
    
    private final int memInstrucciones[];
    private final int memDatos[];
    
    private final int registros[];
    
    private final int if_id[];
    private final int id_ex[];
    private final int ex_mem[];
    private final int mem_wb[];
    
    private final Fetch fetch;
    private final Decode decode;
    private final Execute execute;
    private final Memory memory;
    private final Writeback writeback;
    
    private final int pc;
    
    public static void main(String args[]){
        
        if(args.length != 1){
            System.err.println("Comando invalido, se requiere exactamente un argumento");
            System.exit(1);
        }else{
            
            try{
                
                Mips mips = new Mips(args[0]);
                
            }catch(Exception e){
                System.err.println("Error: " + e.getMessage());
            }
            
        }  
        
    }
    
    public Mips(String archivo) throws IOException{
        
        Scanner scanner = new Scanner(new File(archivo));
        
        memInstrucciones = new int[400];
        memDatos = new int[100];
        
        registros = new int[32];
        
        if_id = new int[5];
        id_ex = new int[7];
        ex_mem = new int[6];
        mem_wb = new int[6]; 
        
        pc = 0;
        
        int i = 0;      
        while(scanner.hasNextInt()){
            memInstrucciones[i++]=scanner.nextInt();
        }     
        
        fetch = new Fetch();
        decode = new Decode();
        execute = new Execute();
        memory = new Memory();
        writeback = new Writeback();
        
        //System.out.println(Arrays.toString(memInstrucciones));
    }
}
