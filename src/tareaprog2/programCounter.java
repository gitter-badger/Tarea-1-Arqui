/*
 * Programa hecho por:
 * Luis Velasquez - B06789
 * Marco Chacon - B11750
 * Ricardo Torres - B06324
 */
package tareaprog2;

public class programCounter {
    
    private int pc;
    
    public programCounter(){
        
        pc = 0;
        
    }
    
    /**
     *
     */
    public void nextIns(){
        
        pc = pc+4;
        
    }
    
    /**
     *
     * @param salto
     */
    public void nextIns(int salto){
        
        int desplazamiento = salto * 4;
        pc = pc + desplazamiento;
        
    }
    
    /**
     *
     * @return
     */
    public int getPC(){
        
        return pc;
        
    }
    
}
