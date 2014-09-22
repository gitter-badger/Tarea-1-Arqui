/*
 * Programa hecho por:
 * Luis Velasquez - B06789
 * Marco Chacon - B11750
 * Ricardo Torres - B06324
 */

package tareaprog2.pipeline;

import tareaprog2.mipsRegister;
import tareaprog2.pipelineRegister;

public class Decode extends Thread{
    
    pipelineRegister if_id;
    pipelineRegister id_ex;
    mipsRegister registros;
    
    
    public Decode(pipelineRegister if_id, pipelineRegister id_ex, mipsRegister registros){
        
        this.if_id = if_id;
        this.id_ex = id_ex;
        this.registros = registros;
        
    }
    
    @Override
    public void run(){
        
        id_ex.setIR(if_id.getIR());
       
        if(if_id.getIR()[0] == 32 || if_id.getIR()[0] == 34 || if_id.getIR()[0] == 12 || if_id.getIR()[0] == 14){
            id_ex.setRegister(0, registros.getRegister(if_id.getIR()[1]));
            id_ex.setRegister(1, registros.getRegister(if_id.getIR()[2]));
            
        }else if(if_id.getIR()[0] == 8 || if_id.getIR()[0] == 35 || if_id.getIR()[0] == 43){
            id_ex.setRegister(0, registros.getRegister(if_id.getIR()[1]));
            id_ex.setRegister(2, registros.getRegister(if_id.getIR()[3]));
        }else {
            //fin
            id_ex.setRegister(0, 0);
            id_ex.setRegister(1, 0);
            id_ex.setRegister(2, 0);
        }
    }
    
}
