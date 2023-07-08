package hLuta.Player;

import java.util.ArrayList;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import hLuta.Main;
import hLuta.Utils.DataBaseArray;

public class hPlayerCommandCancelListener implements Listener {

	@EventHandler
	void Listener(PlayerCommandPreprocessEvent e) {
		
		Player p = e.getPlayer();
		
		ArrayList<String> list = new ArrayList<>(Main.getInstance().getConfig().getStringList("ComandosPermitidos"));
		if (DataBaseArray.containsPlayer(p)) {
			for (String cmd : list) {
				if (e.getMessage().contains(cmd)) {
					e.setCancelled(false);
					return;
				}else {
					e.setCancelled(true);
					p.sendMessage("§cVoce nao pode executar esse comando agora");
					return;
				}
			}
		}
	}
}
