package rocket.commands;

import rocket.stages.StageContext;
import rocket.stages.LaunchStage;
import rocket.stages.PreLaunchStage;
import rocket.stages.SecondStage;
import rocket.utils.Logger;
import rocket.utils.QualityCheck;

import java.util.Scanner;

public class CommandProcessor {

    
    private StageContext stageContext = new StageContext(new PreLaunchStage());

    
    private Scanner scanner = new Scanner(System.in);

    public void run() {

       
        boolean exitRequested = false;

       
        while (!exitRequested) {
            try {
               
                Logger.log("Enter command:");        
                String input = scanner.nextLine();

                
                Command command = new Command(input);

               
                switch (command.getAction()) {

                    case "start_checks":
                        
                        if (QualityCheck.performChecks()) {

                           
                            if (stageContext.getStage() instanceof PreLaunchStage) {
                                ((PreLaunchStage) stageContext.getStage()).configure();
                                Logger.log("Pre-Launch Checks: All systems are 'Go' for launch.");
                                
                               
                                Logger.log(QualityCheck.checkFuelQuality());
                                Logger.log(QualityCheck.checkRocketStatus());
                            }
                        } else {
                            
                            Logger.log("Pre-Launch checks failed.");
                        }
                        break;

                    case "launch":
                        
                        if (stageContext.getStage() instanceof PreLaunchStage && !((PreLaunchStage) stageContext.getStage()).isCompleted()) {
                            Logger.log("Pre-Launch checks not completed. Cannot launch.");
                            break;
                        }

                       
                        stageContext.setStage(new LaunchStage());
                        if (!simulate(10)) exitRequested = true; // End the simulation if needed
                        break;

                    case "fast_forward":

                        
                        if (!simulate(command.getValue())) exitRequested = true;
                        break;

                    case "exit":

                        
                        exitRequested = true;
                        break;

                    default:

                        
                        Logger.log("Unknown command");
                        
                }

              
                if (stageContext.isStageCompleted()) {

                    if (stageContext.getStage() instanceof LaunchStage) {

                        Logger.log("Stage 1 complete. Transitioning to Stage 2.");
                        stageContext.setStage(new SecondStage());

                    } 
                   
                    else if (stageContext.getStage() instanceof SecondStage) {

                        if (stageContext.getStatus().contains("Stage 2 complete")) {
                            Logger.log("Orbit achieved! Mission Successful.");
                            exitRequested = true;
                        }

                    }
                }
            } catch (Exception e) {

               
                Logger.log("Error: " + e.getMessage());

            }
        }

        
        Logger.log("Exiting Rocket Launch Simulator. Goodbye!");
        scanner.close();
    }

    
    private boolean simulate(int seconds) {
        for (int i = 0; i < seconds; i++) {

           
            stageContext.update(i);

           
            Logger.log(stageContext.getStatus());
            Logger.log("Fuel Level: " + stageContext.getFuelLevel() + " || " + "Altitude: " + stageContext.getAltitude() + "km" + " || " + "Kilometers: " + stageContext.getKilometers());
            
            
            if (stageContext.getFuelLevel() <= 0) {

                Logger.log("Fuel is empty. Mission terminated.");
                return false; 

            }
            
          
            if (stageContext.isStageCompleted() && stageContext.getStatus().contains("Stage 2 complete")) {

                Logger.log("Orbit achieved! Mission Successful.");
                return false; 

            }
        }
        
        return true; 
    }
}
