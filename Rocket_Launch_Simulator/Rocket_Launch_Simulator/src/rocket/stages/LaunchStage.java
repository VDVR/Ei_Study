package rocket.stages; 
public class LaunchStage implements Stage {

    private boolean completed; 


    
    @Override
    public void update(int time) {

       
        if (time >= 10) { 
            completed = true; 
        }

    }

    
    @Override
    public boolean isCompleted() {

        return completed;

    }

    
    @Override
    public int getFuelConsumption() {

        return 1; 
    }

  
    @Override
    public int getAltitudeChange() {

        return 5;

    }

    
    @Override
    public int getKilometersTravelled() {

        return 1;

    }

   
    @Override
    public String getStatus() {

        
        return completed ? "Stage 1 complete" : "Stage 1 in progress";
        
    }
}
