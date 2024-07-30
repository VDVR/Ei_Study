package rocket.commands;

public class CommandFactory {
    
    public static Command createCommand(String input) {

        
        return new Command(input);
        
    }
}
