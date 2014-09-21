/*
 * Programa hecho por:
 * Luis Velasquez - B06789
 * Marco Chacon - B11750
 * Ricardo Torres - B06324
 */
package tareaprog2;

public class mipsRegister {
    
    private int mipsRegister[];
    
    public mipsRegister(){
        
        mipsRegister = new int[32];
        
    }
    
    /**
     *
     * @param registro
     * @param valor
     */
    public void setRegister(int registro, int valor){
        
        mipsRegister[registro] = valor;
        
    }
    
    /**
     *
     * @param registro
     * @return
     */
    public int getRegister(int registro){
        
        return mipsRegister[registro];
        
    }
    
}
