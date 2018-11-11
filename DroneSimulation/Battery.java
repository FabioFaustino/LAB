
/**
 * Escreva a descrição da classe Battery aqui.
 * 
 * @author (Fabio Faustino & Rafael Prospero) 
 * @version (número de versão ou data)
 */
public class Battery
{
    private double maxCharge;
    private double currentCharge;
   
    public Battery(double maxCharge)
    {
        if (maxCharge > 0 ){
            this.maxCharge = maxCharge;
        } else {
            this.maxCharge = 1100;
        }  // LEVEL 2
        currentCharge = 0;       
        
    }
    
    public double getMaxCharge(){
        return maxCharge;
    }
    
    public double getCurrentCharge(){
        return currentCharge;
    }
    
    public void charge(){
        maxCharge = maxCharge * 0.95;  
        currentCharge = maxCharge;
    }
    
    public void discharge(){
        currentCharge =0;
    }
    
    public boolean useCharge(double chargeUsed){
        if ( chargeUsed > 0 && chargeUsed <= maxCharge){
            currentCharge -= chargeUsed;
            return true;
        }
        return false;   
    }
    
    public double getPercentage(){
        return currentCharge * 100 / maxCharge;
    }
       
        
        
    

  
}
