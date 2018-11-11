
/**
 * Escreva a descrição da classe Drone aqui.
 * 
 * @author (Fábio Faustino & Rafael Prospero) 
 * @version (número de versão ou data)
 */
//LEVEL3
public class Drone
{
    private boolean turnedOn;
    private Battery battery;
    private Engine engine;
   
    public Drone()
    {
        turnedOn = false;
        battery = new Battery(1100);
        engine = new Engine(100);
    }
    
    public Drone(double batteryCapacity, double engineConsumption){
        turnedOn = false;
        battery = new Battery(batteryCapacity);
        engine = new Engine(engineConsumption);
    } // LEVEL 5
    
    public void turnOn(){
        if( battery.getCurrentCharge() >= 100){
            turnedOn = true;
            battery.useCharge(10);
        }
    }
    public void turnOff(){
        turnedOn = false;
    }    
    //LEVEL 4
    public void chargeDrone(){
        if(!turnedOn){
            battery.charge();
        }
    }
    public void replaceBattery(double batteryCapacity){
        if(!turnedOn){
            if(batteryCapacity >= 800 ){
                battery = new Battery(batteryCapacity);
            } else {
                battery = new Battery(800);
            }
        }
    }
                
    //LEVEL 5
    
    public void fly(){
        double currentCharge = battery.getCurrentCharge();
        double minConsumption = engine.getConsumption()*2;
        if(turnedOn && currentCharge >= minConsumption ){
                engine.turnOn();
                battery.useCharge(minConsumption);
                System.out.println(battery.getPercentage() + "%");
                System.out.println("Drone em voo.");
        }
        
    }
    
    public void land(){
        if(engine.turnedOn()){
            engine.turnOff();
            System.out.println("Drone aterrado");
        }
    }
    
    public void fly(int flightDuration){
        double currentCharge = battery.getCurrentCharge();
        double consumption = engine.getConsumption() * flightDuration;
        if(turnedOn && currentCharge >= consumption){
                engine.turnOn();
                battery.useCharge(consumption);
                System.out.println("Drone em voo.");
                System.out.println(battery.getPercentage() + "%");
                land();
                System.out.println("Voo de " + flightDuration +
                " minutos realizados.");
                
        }
    }
}
            
    
    
            

    

