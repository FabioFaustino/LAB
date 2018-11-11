import java.time.LocalDate;
/**
 * Escreva a descrição da classe Date aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Date
{
    private int day;
    private int month;
    private int year;
    /**
     * COnstrutor para objetos da classe Date
     */
    public Date(int day, int month, int year){
        if (validateDate( day, month, year)){
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            this.day = 15;
            this.month = 10;
            this.year = 1582;
        }
    }
    
    private boolean validateDate(int day, int month, int year){
        if ( year < 1582 ){
            return false;
        }
        if(month < 1 || month > 12){
            return false;
        }
        if (day <1 || day > daysOfMonth(month, year)){
            return false;
        }
        if( year == 1582){
            if(month < 10 || month == 10 && day < 15){
                return false;
            }
        }
        return true;
    }
    
    private int daysOfMonth(int month, int year){
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            return 31;
            
            case 4:
            case 6:
            case 9:
            case 11:
            return 30;
            
        }
        if(month == 2) {
            if(isLeapYear(year)){
                return 29;
                } else {
                    return 28;
                }
        }
        
        return 0;
    }
        
    private boolean isLeapYear(int year){
       /*
        if ( year % 4 != 0){
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        }
            
        return true;
        */
       return ((year % 4 == 0) && (year % 100 != 0 )) || ( year % 400 == 0);
    }
    
    public int getDay(){
        return day;
    }
    public void setDay(int day){
        if(validateDate(day, this.month, this.year)){
            this.day = day;
        }
    }
    
    public int getMonth(){
        return month;
    }
    public void setMonth(int month){
        if(validateDate(this.day, month, this.year)){
            this.month = month;
        }
    }
    
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        if(validateDate(this.day, this.month, year)){
            this.year = year;
        }
    }
    
    public int getYearsTillToday(){
        int yearsTillToday = getCurrentYear() - year;
        if(month > getCurrentMonth() ||
            month == getCurrentMonth() &&
            day > getCurrentDay()){
                yearsTillToday -= 1;
            }
            return yearsTillToday;
        }
    
    private int getCurrentYear() {
        return LocalDate.now().getYear();
    }
    
    private int getCurrentMonth(){
        return LocalDate.now().getMonthValue();
    }
    
    private int getCurrentDay() {
        return LocalDate.now().getDayOfMonth();
    }
       

}