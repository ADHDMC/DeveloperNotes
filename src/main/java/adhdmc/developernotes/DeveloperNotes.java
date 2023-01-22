package adhdmc.developernotes;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class DeveloperNotes extends JavaPlugin {

    public static Plugin instance;

    @Override
    public void onEnable() {
        instance = this;
        // TODO: PlaceholderAPI Notes
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static Plugin getInstance() { return instance; }
}
