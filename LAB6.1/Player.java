
/**
 * Escreva a descrição da classe Player aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Player
{
    private String name;
    private int points;
    private int victories;

    /**
     * COnstrutor para objetos da classe Player
     */
    public Player(String name)
    {
        if(name == null){
            this.name = "";
        }
        this.name = name;
        points = 0;
        victories = 0;
    }
   
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        if(name==null){
            this.name = "";
        }
        this.name = name;
    }
    
    public int getPoints(){
        return points;
    }
    
    public void setPoints(int points){
        if(points < 0){
            this.points = 0;
        }
        this.points = points;
    }
        
    public int getVictories(){
        return victories;
    }
    
    public void incrementVictories(){
        victories ++ ;
    }
    
    public void addScore(int points){
        this.points += points;
    }
    
    public void reset(){
        points = 0;
    }
 
    
}
