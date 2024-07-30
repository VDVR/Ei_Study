package rocket.commands;

public class Command {
    private String action; 

    private int value; 

   
    public Command(String input) {

       
        String[] parts = input.split(" ");

       
        this.action = parts[0];

       
        if (parts.length > 1) {
            try {

                
                this.value = Integer.parseInt(parts[1]);
                
            } catch (NumberFormatException e) {
                
                this.value = 0;
            }
        }
    }

   
    public String getAction() {
        return action;
    }

   
    public int getValue() {
        return value;
    }
}
