package adhdmc.developernotes.util.saving;

import org.bukkit.entity.Player;

public class SaveHandler {

    private static SaveHandler instance;
    private AbstractSaving saving;

    /**
     * Generally this would be kept in the Configuration.
     */
    public enum SavingType { PDC, FILE }

    private SaveHandler() {}

    /**
     * Singleton Pattern, only one instance of this can exist at any time.
     * @return SaveHandler instance.
     */
    public static SaveHandler getInstance() {
        if (instance != null) return instance;
        instance = new SaveHandler();
        instance.loadSavingType();
        return instance;
    }

    public void loadSavingType() {
        // Generally this would be pulled from the Configuration.
        SavingType type = SavingType.FILE;
        switch (type) {
            case PDC -> saving = new PlayerPDC();
            case FILE -> saving = new YMLFile();
        }
        saving.init();
    }



}
