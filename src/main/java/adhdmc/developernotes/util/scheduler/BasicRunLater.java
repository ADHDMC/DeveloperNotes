package adhdmc.developernotes.util.scheduler;

import adhdmc.developernotes.DeveloperNotes;
import org.bukkit.Bukkit;

public class BasicRunLater {

    public void someTask(){
        Bukkit.getScheduler().runTaskLater(DeveloperNotes.getInstance(), /*plugin instance*/ () -> {
            /*Whatever to do in here*/
            DeveloperNotes.getInstance().getLogger().info("Hello this task is being done later");
            }, 20L /*Time in ticks*/
        );
    }
}
