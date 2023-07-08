package hLuta.Player;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryMoveItemEvent;

import hLuta.Utils.DataBaseArray;

public class hMoveInvListener implements Listener{

	@EventHandler
	void Listener(InventoryMoveItemEvent e) {
		Player p = (Player) e.getInitiator();
	
		if (e.getItem().getType() == Material.AIR) {
			return;
		}
		if (e.getItem().getType() == null) {
			return;
		}
		
		if (DataBaseArray.containsPlayer(p)) {
			if (e.getItem().hasItemMeta()) {
				if (e.getItem().getItemMeta().hasDisplayName()) {
					if (e.getItem().getItemMeta().getDisplayName().equals("§eCapacete") || e.getItem().getItemMeta().getDisplayName().equals("§ePeitoral") || e.getItem().getItemMeta().getDisplayName().equals("§eCalças") || e.getItem().getItemMeta().getDisplayName().equals("§eBotas") || e.getItem().getItemMeta().getDisplayName().equals("§eSua Picareta") || e.getItem().getItemMeta().getDisplayName().equals("§eSua Espada")) {
						if (e.getItem().getType() == Material.DIAMOND_PICKAXE || e.getItem().getType() == Material.DIAMOND_SWORD || e.getItem().getType() == Material.DIAMOND_HELMET || e.getItem().getType() == Material.DIAMOND_LEGGINGS || e.getItem().getType() == Material.DIAMOND_CHESTPLATE || e.getItem().getType() == Material.DIAMOND_BOOTS) {
							e.setCancelled(true);
						}
					}
				}
			}
		}
	}
}
