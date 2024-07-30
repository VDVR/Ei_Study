
package rocket; 

import rocket.commands.CommandProcessor; 

import rocket.utils.Logger; 

public class RocketLaunchSimulator {

    
    public static void main(String[] args) {

        
        System.out.println("---------------------------------------------------------");
        
       
        Logger.log("Rocket Launch Simulator started.");
        
       
        System.out.println("-------------------------------------------");
        
       
        CommandProcessor commandProcessor = new CommandProcessor();
        
        
        commandProcessor.run();
    }
}
