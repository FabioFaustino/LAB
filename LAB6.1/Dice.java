import java.util.Random;
/**
 * Escreva a descrição da classe Dice aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Dice
{
    private int faces;
    
    public Dice()
    {
       faces = 6;
    }
    
    public int getFaces(){
        return faces;
    }
    
    public int roll(){
        Random randomFace = new Random(System.currentTimeMillis());
        return randomFace.nextInt(faces) + 1 ;
    }
 
   
}
