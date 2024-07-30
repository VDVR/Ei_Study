package rocket.stages; 


public class SecondStage implements Stage {


    private boolean completed;


    
    @Override
    public void update(int time) {

        

        if (time >= 15) { 

            completed = true;
        }

    }

   
    @Override
    public boolean isCompleted() {

        return completed;
    }


    
    @Override
    public int getFuelConsumption() {

        return 2; 
    }


    
    @Override
    public int getAltitudeChange() {

        return 10; 
    }


    
    @Override
    public int getKilometersTravelled() {

        return 2; 
    }


   
    @Override
    public String getStatus() {

       
        return completed ? "Stage 2 complete" : "Stage 2 in progress";

    }
}
