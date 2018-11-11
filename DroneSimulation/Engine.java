
/**
 * Escreva a descrição da classe Engine aqui.
 * 
 * @author (Fabio Faustino & Rafael Prospero) 
 * @version (número de versão ou data)
 */
//LEVEL 5
public class Engine
{
    private double consumption;
    private boolean turnedOn;

    
    public Engine(double consumption)
    {
       if(consumption < 100 ){
           this.consumption = 100;
       } else {
           this.consumption = consumption;
       }
       turnedOn = false;
    }

    public double getConsumption(){
        return consumption;
    }
    public boolean turnedOn(){
        return turnedOn;
    }
    
    public void turnOn(){
        turnedOn = true;
    }
    public void turnOff(){
        turnedOn = false;
    }
    
    
        
    /**
     * Exemplo de método - substitua este comentário pelo seu próprio
     * 
     * @param  y   exemplo de um parâmetro de método
     * @return     a soma de x com y 
     */
    
}
