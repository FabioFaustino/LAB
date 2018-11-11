import java.time.LocalDate;
/**
 * Escreva a descrição da classe Pessoa aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Person
{
    private String name;
    private double weight; //KG
    private double height;  // Meters
    private char genre;   // 'M' or ?F' or '?'
    private Date birthDate;

    /**
     * COnstrutor para objetos da classe Pessoa
     */
    public Person(String name, char genre, int dayOfBirth, int monthOfBirth,
                   int yearOfBirth)
    {
        if(name != null){
            this.name = name;
        } else {
            this.name = "";
        }
        if (genre == 'M' || genre == 'F'){
            this.genre = genre;
        } else {
            this.genre = '?';
        }
        
        birthDate = new Date(dayOfBirth, monthOfBirth, yearOfBirth);
        
        weight = 0.0;
        height = 0.0;
    }
    
    
        
    public double getWeight(){
        return weight;
    }
    
    public void setWeight(double weight){
        if ( weight > 0.0 ){
            this.weight = weight;
        }
    }
    
    public double getHeight(){
        return height;
    }
    
    public void setHeight(double height){
        if(height > 0.0) {
            this.height = height;
        }
    }
    
    public double getBodyMassIndex() {
        if( height == 0.0) {
            return 0.0;
        }
        return weight / (height * height) ;
    }
    
    public int getAge(){
        return birthDate.getYearsTillToday();
    }
    
    public int getDayOfBirth(){
        return birthDate.getDay();
    }
    public void setDayOfBirth(int dayOfBirth){
        birthDate.setDay(dayOfBirth);
    }
    
    public int getMonthOfBirth(){
        return birthDate.getMonth();
    }
    public void setMonthOfBirth(int monthOfBirth){
        birthDate.setMonth(monthOfBirth);
    }
    
    public int getYearOfBirth(){
        return birthDate.getYear();
    }
    public void setYearOfBirth(int yearOfBirth){
        birthDate.setYear(yearOfBirth);
    }
 
}
