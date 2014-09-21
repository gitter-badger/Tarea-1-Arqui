/*
 * Programa hecho por:
 * Luis Velasquez - B06789
 * Marco Chacon - B11750
 * Ricardo Torres - B06324
 */
package tareaprog2;

import java.util.Arrays;

public class pipelineRegister {
    
    private int pipelineRegister[];
    private int dimension;
    
    public pipelineRegister(int dimensionPR){
        
        pipelineRegister = new int[dimensionPR];
        dimension = dimensionPR;
        
    }
    
    public void setIR(int IR[]){
        
        int inicioIR = dimension-4;
        int j = 0;
        
        for(int i = inicioIR; i < dimension; ++i){
            
            pipelineRegister[i] = IR[j];
            j++;
            
        }
        
    }
    
    public int[] getIR(){
        
        int inicioIR = dimension-4;
        int[] IR = Arrays.copyOfRange(pipelineRegister, inicioIR, dimension);
        return IR;
        
    }
    
    public void setRegister(int registro, int valor){
        
        pipelineRegister[registro] = valor;
        
    }
    
    public int getRegister(int registro){
        
        return pipelineRegister[registro];
        
    }
    
    
}
