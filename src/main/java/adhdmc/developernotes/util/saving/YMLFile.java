package adhdmc.developernotes.util.saving;

import adhdmc.developernotes.DeveloperNotes;
import org.bukkit.OfflinePlayer;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class YMLFile extends AbstractSaving {
    private final File dataFile = new File(DeveloperNotes.getInstance().getDataFolder(), "nickname_data.yml");
    private final FileConfiguration dataConfig = new YamlConfiguration();

    /**
     * Init is called.
     * This setup is used to ensure that a data file exists if it does not exist.
     * This also loads any existing file configuration.
     */
    @Override
    public void init() {
        if (!dataFile.exists()) {
            dataFile.getParentFile().mkdirs();
            try { dataConfig.save(dataFile); }
            catch (IOException e) { e.printStackTrace(); }
        }
        try { dataConfig.load(dataFile); }
        catch (IOException | InvalidConfigurationException e) { e.printStackTrace(); }
    }

    /**
     * This method can do stuff if the player is offline, since data
     * can be pulled straight from the file.
     * @param p OfflinePlayer object, can take Player or OfflinePlayer.
     */
    @Override
    public void exampleMethod(OfflinePlayer p) {
        ConfigurationSection playerData = dataConfig.getConfigurationSection(p.getUniqueId().toString());
        if (playerData == null) playerData = dataConfig.createSection(p.getUniqueId().toString());
        playerData.set("helloData", "HELLO");
        if (!saveData()) {
            /* TODO: FAILED TO SAVE, ERROR MESSAGE */
        }
    }

    /**
     * Helper method for saving data after changes are made.
     * @return True if successful, False on Exception.
     */
    private boolean saveData() {
        try { dataConfig.save(dataFile); }
        catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
