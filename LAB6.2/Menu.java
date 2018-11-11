
/**
 * Escreva a descrição da classe Menu aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Menu
{
    InputReader reader;

    
    public Menu()
    {
       reader = new InputReader();
    }

    public void display(){
        System.out.println("*** Calculadora Básica ***");
        System.out.println();
        System.out.println("1 - Adicionar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("0 - Sair");
        System.out.println("Escolha a sua opção:");
    }
    
    public int readOption(){
        int answer = reader.getIntegerNumber("opção") ;
        
        while(answer < 0 || answer > 4){
            System.out.println(" Escolha uma opção correta de 0 a 4");
            answer = reader.getIntegerNumber("opção");
        }   
            
        
        
        return answer;
    }
    
    
    
    
}
