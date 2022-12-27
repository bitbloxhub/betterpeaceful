package betterpeaceful;

import java.util.Arrays;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason;
import org.bukkit.event.EventPriority;
import org.bukkit.plugin.java.JavaPlugin;

public class BetterPeacefulPlugin extends JavaPlugin implements Listener {
	private SpawnReason[] reasons = {
		SpawnReason.JOCKEY
	};
	
	@Override
	public void onEnable() {
		
	}

	@EventHandler(priority = EventPriority.HIGH)
	public void onCreatureSpwan(CreatureSpawnEvent e) {
		if (e == null)
			return;
		
		if (Arrays.asList(reasons).contains(e.getSpawnReason())) {
			e.setCancelled(true);
		}
	}
}
