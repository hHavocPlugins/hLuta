package hLuta.Eventos;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import hLuta.Config.hPlayerCFG;

public class hJoinListener implements Listener {

	@EventHandler
	void Listener(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		
		if (hPlayerCFG.get().get(p.getName() + ".minerios") == null) {
			hPlayerCFG.get().set(p.getName() + ".minerios", Float.valueOf(0));
			hPlayerCFG.save();
		}
	
		if (hPlayerCFG.get().get(p.getName() + ".picareta.level") == null) {
			hPlayerCFG.get().set(p.getName() + ".picareta.level", Float.valueOf(0));
			hPlayerCFG.save();
		}
		
		if (hPlayerCFG.get().get(p.getName() + ".capacete.level") == null) {
			hPlayerCFG.get().set(p.getName() + ".capacete.level", Float.valueOf(0));
			hPlayerCFG.save();
		}
		
		if (hPlayerCFG.get().get(p.getName() + ".peitoral.level") == null) {
			hPlayerCFG.get().set(p.getName() + ".peitoral.level", Float.valueOf(0));
			hPlayerCFG.save();
		}
		
		if (hPlayerCFG.get().get(p.getName() + ".calcas.level") == null) {
			hPlayerCFG.get().set(p.getName() + ".calcas.level", Float.valueOf(0));
			hPlayerCFG.save();
		}
		
		if (hPlayerCFG.get().get(p.getName() + ".botas.level") == null) {
			hPlayerCFG.get().set(p.getName() + ".botas.level", Float.valueOf(0));
			hPlayerCFG.save();
		}
	}
	
}
