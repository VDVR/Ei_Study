package rocket.stages; 

public class PreLaunchStage implements Stage {

    private boolean completed; 


   
    @Override
    public void update(int time) {

        
    }


    @Override
    public boolean isCompleted() {
        return completed;
    }


    
    public void configure() {

        
        completed = true; 

    }


    
    @Override
    public int getFuelConsumption() {

        return 0;

    }


    
    @Override
    public int getAltitudeChange() {
        
        return 0;
    }


    
    @Override
    public int getKilometersTravelled() {

        return 0; 
    }


    
    @Override
    public String getStatus() {

        
        return completed ? "Pre-Launch Stage complete" : "Pre-Launch Stage in progress";

    }
}
