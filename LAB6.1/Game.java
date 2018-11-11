
/**
 * Escreva a descrição da classe Game aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Game
{
    private Player player1;
    private Player player2;
    private Dice dice;
    private int pointsToWin;
    private int numberOfThrows;
    
    public Game(String name1, String name2, int pointsToWin){
        if(name1 == null ){
            name1 = "";
        } else if (name2 == null){
            name2 = "";
        }
        player1 = new Player(name1);
        player2 = new Player(name2);
        dice = new Dice();
        
        if ( pointsToWin >= dice.getFaces() && pointsToWin <= 50){
            this.pointsToWin = pointsToWin;
        } else {
            pointsToWin = dice.getFaces();
        }   
        
        numberOfThrows = 0;
        
    }
    
    public boolean nextPlay(Player playerThrowing){
      int pointsPlay = dice.roll();
      
      while (playerThrowing.getPoints() + pointsPlay > pointsToWin){
          System.out.println("A jogada de "+ pointsPlay +
                               " pontos do jogador "+playerThrowing.getName()+
                               " ultrapassa o limite de pontos a alcançar e não conta.");
      
          pointsPlay = dice.roll(); 
      }
      
      playerThrowing.addScore(pointsPlay);
      
        if(playerThrowing.getPoints() == pointsToWin) {
           System.out.print("O jogador " + playerThrowing.getName() +
                             " venceu em " + numberOfThrows + " jogadas");
          playerThrowing.incrementVictories();
          return true;                                        
         }else{
                   
          System.out.println("Jogador " + playerThrowing.getName() + ":"
                             + playerThrowing.getPoints() + " pontos.");
        } 
            
        return false;
        }
    
    public void play(){
        
        
        do{
            numberOfThrows++;
            System.out.println("Jogada :" + numberOfThrows + ">");
           
            
        } while(!nextPlay(player1) && !nextPlay(player2));
        
        resetGame();
        
            
    }
    
    public void resetGame(){
        numberOfThrows = 0;
        player1.reset();
        player2.reset();
    }
}
