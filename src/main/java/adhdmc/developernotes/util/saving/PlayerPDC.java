package adhdmc.developernotes.util.saving;

import adhdmc.developernotes.DeveloperNotes;
import org.bukkit.NamespacedKey;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import javax.naming.Name;

public class PlayerPDC extends AbstractSaving {
    private final NamespacedKey key = new NamespacedKey(DeveloperNotes.getInstance(), "helloData");

    /**
     * Init is called but nothing happens.
     * Generally PDC does not require any setup on initialization.
     */
    @Override
    public void init() {

    }

    /**
     * Example Method will not do anything if the player is not online.
     * PersistentDataContainer requires the player to be online.
     * @param p OfflinePlayer object, can take Player or OfflinePlayer.
     */
    @Override
    public void exampleMethod(OfflinePlayer p) {
        if (!(p instanceof Player player)) return;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        pdc.set(key, PersistentDataType.STRING, "HELLO");
    }
}
