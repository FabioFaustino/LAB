
/**
 * Escreva a descrição da classe Operation aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Operation
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private double firstNumber;
    private double secondNumber;
    
    public Operation()
    {
        firstNumber = 0;
        secondNumber = 0;
    }

    public double getFirstNumber(){
        return firstNumber;
    }
    public double getSecondNumber(){
        return secondNumber;
    }
    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber( double secondNumber){
        this.secondNumber= secondNumber;
    }
    
    public double add(){
        return firstNumber + secondNumber;
    }
    
    public double subtract(){
        return firstNumber - secondNumber;
    }
    
    public double multiply(){
        return firstNumber * secondNumber;
    }
    
    public double divide(){
        return (double) firstNumber / secondNumber;
    }
    
    
}
