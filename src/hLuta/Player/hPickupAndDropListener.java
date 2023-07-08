package hLuta.Player;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;

import hLuta.Utils.DataBaseArray;

public class hPickupAndDropListener implements Listener {

	@EventHandler
	void Listener_1(PlayerPickupItemEvent e) {
		Player p = e.getPlayer();
		
		if (DataBaseArray.containsPlayer(p)) {
			e.setCancelled(true);
		}
		
	}
	
	@EventHandler
	void Listener_2(PlayerDropItemEvent e) {
		Player p = e.getPlayer();
		
		if (DataBaseArray.containsPlayer(p)) {
			e.setCancelled(true);
		}
	}
}
