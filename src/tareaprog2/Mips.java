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
    
    private final memoryInstruction memInstructions;
    //private final int memDatos[];
    private final mipsRegister registros;
    private final programCounter pc;
    
    private final pipelineRegister if_id;
    private final pipelineRegister id_ex;
    private final pipelineRegister ex_mem;
    private final pipelineRegister mem_wb;
    
    private final Fetch fetch;
    private final Decode decode;
    private final Execute execute;
    private final Memory memory;
    private final Writeback writeback;
    
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
    
    @SuppressWarnings("CallToThreadRun")
    public Mips(String archivo) throws IOException{
        
        Scanner scanner = new Scanner(new File(archivo));
        
        memInstructions = new memoryInstruction(scanner);
        //memDatos = new int[100];       
        registros = new mipsRegister();
        pc = new programCounter();
        
        if_id = new pipelineRegister(5);
        id_ex = new pipelineRegister(7);
        ex_mem = new pipelineRegister(6);
        mem_wb = new pipelineRegister(6);     
        
        fetch = new Fetch(if_id,memInstructions,pc);
        decode = new Decode(if_id,id_ex,registros);
        execute = new Execute(ex_mem,id_ex);
        memory = new Memory();
        writeback = new Writeback();
        
        fetch.run();
        
        //System.out.println(Arrays.toString(memInstrucciones));
    }
}
