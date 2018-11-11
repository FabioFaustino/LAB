

/**
 * Escreva a descrição da classe Car aqui.
 * Classe utilizada para medir a eficiência do carro e gerir
 * o nivel do depósito após cada viagem
 * 
 * @authors (Fábio Faustino & Rafael Prospero) 
 * @version (2018/10/22)
 */
public class Car
{
    // variáveis de instância 
    private String brand;
    private String model;
    private int tankCapacity;
    private float tankLevel;
    private float tripDistance;
    private float totalDistance;
    private int numberOfTrips; // level 3
    /* Level 4 */
    private float averageConsumption; 
    private float estimatedRange;
    
    
    /**
     * COnstrutor para objetos da classe Car
     */
    public Car(String carBrand, String carModel, int carTankCapacity)
    {
        // inicializa variáveis de instância
        brand = carBrand;
        model = carModel;
        tankCapacity = carTankCapacity;
        tankLevel = 0.0f;
        tripDistance = 0.0f;
        totalDistance = 0.0f;
        numberOfTrips = 0; // level 3
        /* level 4 */
        averageConsumption = 0.0f;
        estimatedRange = 0.0f;
        
        
        
    }
    
    /**
     * Métodos seletores
     */
    public int getTankCapacity()
    {
        return tankCapacity;
    }
    public float getTankLevel()
    {
        return tankLevel;
    }   
    public float getTripDistance()
    {
       return tripDistance;
    }
    public float getTotalDistance()
    {
        return totalDistance;
    }
    //level 3
    public float getNumberOfTrips()
    {
        return numberOfTrips;
    }
    //level 4
    public float getAverageConsumption()
    {
        return averageConsumption;
    }
    public float getEstimatedRange()
    {
        return estimatedRange;
    }
    //Método para encher o depósito
    public void fillTank() 
    {
        tankLevel = tankCapacity;
        estimatedRange(); //level 4
    }
    //Método para viagens
    public void makeTrip(float partialTripDistance, float fuelConsumed)
    {
        tripDistance = partialTripDistance;
        totalDistance += partialTripDistance;
        tankLevel -= fuelConsumed; 
        numberOfTrips ++; // level 3
        //level 4
        averageConsumption(tripDistance, fuelConsumed);
        estimatedRange();
    }
    
    public void printMeters()
    {
    
        System.out.println("          #"+ brand + " " + model + "#");      //level5        
        System.out.println("Capacidade do depósito:                         "+ tankCapacity +  " Litros");
        System.out.println("Nível do depósito:                              " + tankLevel + " Litros");
        System.out.println("Distância percorrida na viagem:                 " + tripDistance + " Km");
        System.out.println("Distância total percorrida:                     " + totalDistance + " Km");
    }
    
    // level 3 
    public void resetTrip()
    {
        numberOfTrips = 0;
        totalDistance = 0;
    }
    //level 4
    private float averageConsumption(float currentTripDistance, float currentTripFuelConsumed)
    {
       
        averageConsumption = ( currentTripFuelConsumed * 100) / currentTripDistance;
        return averageConsumption;
    }
    
    private float estimatedRange()
    {
        estimatedRange = (tankLevel / 6) * 100;
        return estimatedRange;
    }
}
