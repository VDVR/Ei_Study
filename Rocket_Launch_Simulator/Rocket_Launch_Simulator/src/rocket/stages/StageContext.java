package rocket.stages; 

public class StageContext {

    private Stage currentStage; 

    private int fuelLevel; 

    private int altitude;

    private int kilometers; 

   
    public StageContext(Stage initialStage) {

        this.currentStage = initialStage; 

        this.fuelLevel = 100; 
        
        this.altitude = 0;

        this.kilometers = 0; 
    }

    
    public Stage getStage() {
        return currentStage;
    }

    
    public void setStage(Stage newStage) {
        this.currentStage = newStage;
    }

    
    public void update(int time) {

        currentStage.update(time); 

        fuelLevel -= currentStage.getFuelConsumption(); 

        altitude += currentStage.getAltitudeChange(); 
        
        kilometers += currentStage.getKilometersTravelled(); 
    }

   
    public int getFuelLevel() {
        return fuelLevel;
    }

    
    public int getAltitude() {
        return altitude;
    }

    
    public int getKilometers() {
        return kilometers;
    }

    public boolean isStageCompleted() {
        return currentStage.isCompleted();
    }

  
    public String getStatus() {
        return currentStage.getStatus();
    }
}
