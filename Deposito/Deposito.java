
/**
 * Escreva a descrição da classe Deposito aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Deposito{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int maxCapacity;
    private int currentLevel;
    

    /**
     * COnstrutor para objetos da classe Deposito
     */
    public Deposito(int newMaxCapacity){
        if(newMaxCapacity<1){
            maxCapacity=100;
        }else{
        maxCapacity = newMaxCapacity;
        }
        currentLevel=0;
    }
    public int fillDeposit(){
        currentLevel = maxCapacity
}
