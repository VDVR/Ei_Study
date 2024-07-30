package rocket.stages; 

public interface Stage {
    
    void update(int time);
    
    
    boolean isCompleted();
    
    
    int getFuelConsumption();
    
    
    int getAltitudeChange();
    
    
    int getKilometersTravelled();
    
    
    String getStatus();
}
