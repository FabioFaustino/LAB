
/**
 * Escreva a descrição da classe BankAccount aqui.
 * 
 * L2 -> Level 2
 * L3 -> Level 3
 * L4 -> Level 4
 * L5 -> Level 5
 * PEO -> Personal Educational Optimization 
 *
 *@author Fábio Faustino
 * @version 23/10/2018 
 */
public class BankAccount{
    
    private String name;
    private int number;
    private char type;
    private double balance;
    private boolean isActive;
    private String printType; // PEO

    /**
     * COnstrutor para objetos da classe BankAccount
     */
    public BankAccount(String accountName, int accountNumber){
        name = accountName;
        number = accountNumber;
        type = 'I';
        printType = "Individual";
        balance = 0.0;
        isActive = false;
        
    }
    
    /* Metodos seletores*/
   
    public String getName(){
      return name;
    }
    public int getNumber(){
        return number;
    }
    public char getType(){
        return type;
    }
    public double getBalance(){
        return balance;
    }
    public boolean getIsActive(){
        return isActive;
    }
    
    public void changeType(char newType){
        if(newType != type){
            switch(newType){
                case 'M': type = newType;
                printType = "Mista"; //PEO
                break;
                case 'S': type = newType;
                printType = "Solidária"; // PEO
                break;
                case 'J': type = newType;
                printType = "Conjunta"; // PEO 
                break;
                case 'I': type = newType;
                printType = "Individual"; // PEO
                break;
                default: System.out.println("O tipo introduzido não existe, reveja as opções!");
                break;
            }
        }
    }
   
    // L2
    
    public void open(double initialBalance){
        if(initialBalance >= 100){
            if( isActive || balance >0){
                System.out.println("A conta já foi aberta");
            }
            balance = initialBalance;
            isActive = true;
        }else{
            System.out.println("O montante minimo para ativar são 100€");
        }
    }
    
    public void deposit(double depositAmount){
        if(!isActive){
            System.out.println("Conta Inativa");
        } else if (depositAmount <1){
            System.out.println("O valor para depósito é inválido");
        }else{
            balance += depositAmount;
        }
    }
    
    public void withdraw(double withdrawAmount){
        if(!isActive){
            System.out.println("Levantamento indisponivel porque a conta está inativa!");
        }else if(withdrawAmount <= 0){
            System.out.println(" O valor do levantamento é inválido!");
        }else if(balance<withdrawAmount){
            System.out.println("O seu saldo só lhe permite levantar " + balance + " Euros.");
        }else{
            balance -= withdrawAmount;
        }
    }
    
    // L3
    public void showInfo(){
        System.out.println("               ***Dados da Conta***");
        System.out.println("Nome da conta: "+ name);
        System.out.println("Numero da conta: " + number);
        /* substituido por PEO
        switch(type){
               case 'M':  System.out.println("Mista");
               break;
               case 'S': System.out.println("Solidária");
               break;
               case 'J': System.out.println("Conjunta");
               break;
               default: System.out.println("Individual");
               break;   
            }
        */
        System.out.println(printType); //PEO
        System.out.println("Saldo: "+ balance);
        if(isActive){
            System.out.println("Conta Ativa? Sim");
        }else{
            System.out.println("Conta Ativa? Não");
        }
    }
    
    //L4
    public double annualInterest(){
        double interest;
        if (balance > 0){
           if(balance < 2000){
                interest = 0.9;
           }else if(balance < 5000){
                interest = 1;
           }else if(balance < 10000 ){
                interest = 1.5;
                }else {
                interest = 2;
                }
           return interest;
        }else{
            interest = 0 ;
            return interest;
        }
    }

    public void creditAnnualInterest(){
        /*double interest;
        interest = annualInterest();
        balance = balance * interest; */
        balance += balance/100 * annualInterest();
    }
    
    // L5 
    /* ja -> Juro anual
     * jm -> Juro Mensal
     * x,y -> Variáveis de apoio ao calculo
     */
    public double monthInterest(){
        double ja = annualInterest();
        double jm, x, y;
        x = 1+ja;
        y = (double)1/12;
        jm = Math.pow(x,y) - 1;
         
        return jm;    
    }
}
