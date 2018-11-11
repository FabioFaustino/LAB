
/**
 * Escreva a descrição da classe Car aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Car
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String brand;
    private String model;
    private int tankCapacity;
    private float tankLevel;
    private float tripDistance;
    private float totalDistance;
    private int numberOfTrips;

    /**
     * COnstrutor para objetos da classe Car
     */
    public Car(String carBrand,String carModel,int carTankCapacity){
        brand = carBrand;
        model = carModel;
        tankCapacity = carTankCapacity;
        tankLevel = 0.0f;
        tripDistance = 0.0f;
        totalDistance = 0.0f;
        numberOfTrips = 0;
    }

     private int getTankCapacity(){
         return tankCapacity;
        }
     private float getTankLevel(){
         return tankLevel;
        }
     private float getTripDistance(){
         return tripDistance;
        }
     private float getTotalDistance(){
         return totalDistance;
        }
        
     public void fillTank(){
         tankLevel = tankCapacity;
        }
        
     public void makeTrip(float currentTripDistance,float consumedFuel){
         tripDistance = currentTripDistance;
         totalDistance += tripDistance;
         tankLevel -= consumedFuel;
         numberOfTrips ++;
        }
        
     public void showMeters(){
        System.out.println("Capacidade do depósito:                         "+ tankCapacity +  " Litros");
        System.out.println("Nível do depósito:                              " + tankLevel + " Litros");
        System.out.println("Distância percorrida na viagem:                 " + tripDistance + " Km");
        System.out.println("Distância total percorrida:                     " + totalDistance + " Km");
         
    }
    
    //Level 3
    
    public void 
    
    



}

