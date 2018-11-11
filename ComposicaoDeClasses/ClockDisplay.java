
/**
 * Escreva a descrição da classe ClockDisplay aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class ClockDisplay
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    
    public ClockDisplay(){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
    }
    
    public String getTime(){
        return hours.getDisplayValue() + ":" +
        minutes.getDisplayValue();
    }
    
    public void timeTick(){
        minutes.increment();
        if(minutes.getValue()==0){
            hours.increment();
        }
    }
    
    public int getHours(){
        return hours.getValue();
    }
    
    public void setHours(int newHours){
        hours.setValue(newHours);
    }
    
    public int getMinutes(){
        return minutes.getValue();
    }
    
    public void setMinutes(int newMinutes){
        minutes.setValue(newMinutes);
    }
    
    public void setTime(int hour, int minute){
        hours.setValue(hour);
        minutes.setValue(minute);
    }
    
    public ClockDisplay(int hour, int minute){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        hours.setValue(hour);
        minutes.setValue(minute);
    }
    
    
    
    
    
}
