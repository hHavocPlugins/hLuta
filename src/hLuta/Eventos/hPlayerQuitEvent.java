package hLuta.Eventos;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import hLuta.Utils.DataBaseArray;

public class hPlayerQuitEvent implements Listener{

	@EventHandler
	void Listener(PlayerQuitEvent e) {
		Player p = e.getPlayer();
		if (DataBaseArray.containsPlayer(p)) {
			p.getInventory().clear();
			DataBaseArray.removePlayer(p);
		}
	
	}
	
}
