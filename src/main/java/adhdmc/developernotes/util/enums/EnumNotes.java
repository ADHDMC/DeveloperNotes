package adhdmc.developernotes.util.enums;

import org.bukkit.configuration.file.FileConfiguration;

public enum EnumNotes {
    SOME_THING("a message here", 3);

    //Declare the things
    String message;
    int number;

    //Constructor
    EnumNotes(String message, int number){
        this.message = message;
        this.number = number;
    }

    //getter
    public int getNumber() {
        return number;
    }

    //setter
    public void setNumber(int number) {
        this.number = number;
    }

    //getter
    public String getMessage() {
        return message;
    }

    //setter
    public void setMessage(String message) {
        this.message = message;
    }

    //you can make a getter that gets multiple things too, if that's what you need, or like, other things. This is just a class

    public static void reloadMessages(){
        FileConfiguration config = null; //Don't actually make it null that'd be stupid, make it lead to the actual config
        SOME_THING.setMessage(config.getString("some path"));
    }
}
