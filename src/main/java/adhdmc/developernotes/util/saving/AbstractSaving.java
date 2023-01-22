package adhdmc.developernotes.util.saving;

import org.bukkit.OfflinePlayer;

/**
 * Describes generally what all save handling methods needs.
 * These are all the methods that the SaveHandler class will use to read and write data.
 */
public abstract class AbstractSaving {

    /**
     * Initialization Method
     */
    public abstract void init();

    /**
     * Method that may vary depending on saving type and plugin use.
     * @param p OfflinePlayer object, can take Player or OfflinePlayer.
     */
    public abstract void exampleMethod(OfflinePlayer p);

}
