package hLuta.Player;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import hLuta.Utils.DataBaseArray;

public class hPlayerDeathListener implements Listener {

	@EventHandler
	void Listener(PlayerDeathEvent e) {
		Player p = e.getEntity().getPlayer();
		if (DataBaseArray.containsPlayer(p)) {
			e.getDrops().clear();
		}
	}
	
}
