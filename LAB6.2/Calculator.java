
/**
 * Escreva a descrição da classe Calculator aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Calculator
{
    private Menu menu;
    private Operation operation;
    private InputReader reader;
    
    public Calculator()
    {
        menu = new Menu();
        operation = new Operation();
        reader = new InputReader();
    }

    public void readOperators(){
        System.out.println("Introduza os numeros da operação.");
        operation.setFirstNumber(reader.getRealNumber("Primeiro Numero "));
        operation.setSecondNumber(reader.getRealNumber("Segundo Numero "));
       
        
        
    }
    
    public void start(){
        int option ;
        menu.display();
        
        do{
            
            option = menu.readOption();
            if ( option > 0){
            readOperators();
            
            switch(option){
               
                case 1:
                System.out.println(operation.getFirstNumber()
                                    +"+"+ operation.getSecondNumber()
                                    +"="+ operation.add());
                break;                                
                case 2:
                
                System.out.println(operation.getFirstNumber()
                                    +"-"+ operation.getSecondNumber()
                                    +"="+ operation.subtract());
                break;
                case 3:
                
                System.out.println(operation.getFirstNumber()
                                    +"*"+ operation.getSecondNumber()
                                    +"="+ operation.multiply());
                break;              
                case 4:
                
                System.out.println(operation.getFirstNumber()
                                    +"/"+ operation.getSecondNumber()
                                    +"="+ operation.divide());
                break;
            }
          }
        }while(option != 0);
        
        System.out.println("Saiu da caluladora");
    
    }
        
}