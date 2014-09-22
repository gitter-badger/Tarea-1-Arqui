/*
 * Programa hecho por:
 * Luis Velasquez - B06789
 * Marco Chacon - B11750
 * Ricardo Torres - B06324
 */

package tareaprog2.pipeline;

import tareaprog2.pipelineRegister;

public class Execute extends Thread{
    
    pipelineRegister ex_mem;
    pipelineRegister id_ex;
    
    public Execute(pipelineRegister ex_mem, pipelineRegister id_ex){
         this.ex_mem = ex_mem;
         this.id_ex = id_ex;
        
        
    }
    @Override
    public void run(){
        
        ex_mem.setIR(id_ex.getIR());
        
        ex_mem.setRegister(1, id_ex.getRegister(1));
        
        switch(id_ex.getIR()[0]){
            case 32:
                ex_mem.setRegister(0, (id_ex.getRegister(0) + id_ex.getRegister(1)));
                break;
            case 34:
                ex_mem.setRegister(0, (id_ex.getRegister(0) - id_ex.getRegister(1)));
                break;
            case 12:
                ex_mem.setRegister(0, (id_ex.getRegister(0) * id_ex.getRegister(1)));
                break;
            case 14:
                ex_mem.setRegister(0, (id_ex.getRegister(0) / id_ex.getRegister(1)));
                break;
            case 8:
                ex_mem.setRegister(0, (id_ex.getRegister(0) + id_ex.getRegister(2)));
                break;
            case 35:
                
        }
        
    }
    
}
