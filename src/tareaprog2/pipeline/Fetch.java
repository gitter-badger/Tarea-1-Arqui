/*
 * Programa hecho por:
 * Luis Velasquez - B06789
 * Marco Chacon - B11750
 * Ricardo Torres - B06324
 */

package tareaprog2.pipeline;

import tareaprog2.memoryInstruction;
import tareaprog2.pipelineRegister;
import tareaprog2.programCounter;

public class Fetch extends Thread{
    
    private memoryInstruction memIns;
    private pipelineRegister if_id;
    private programCounter pc;
    
    public Fetch(pipelineRegister if_id,memoryInstruction memIns,
            programCounter pc){
        
        this.if_id = if_id;
        this.memIns = memIns;
        this.pc = pc;
        
    }
    
    @Override
    public void run(){
        
        if_id.setIR(memIns.getInstruction(pc.getPC()));
        pc.nextIns();
        
    }
    
}
