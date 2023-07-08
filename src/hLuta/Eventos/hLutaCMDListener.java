package hLuta.Eventos;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import hLuta.Config.hLocationCFG;
import hLuta.Utils.DataBaseArray;
import hLuta.Utils.Inventario;
import hLuta.Utils.Item_Plugin;

public class hLutaCMDListener implements Listener{

	@EventHandler
	void Listener(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		if (e.getInventory().getTitle().equals("§7Luta")) {
			e.setCancelled(true);
			
			if (e.getCurrentItem().hasItemMeta()) {
				if (e.getCurrentItem().getItemMeta().hasDisplayName()) {
					
					if (e.getCurrentItem().getType() == Material.GRASS) {
						
						if (hLocationCFG.get().get("Mundo.Setada") == null) {
							p.sendMessage("§cEssa area ainda nao foi setada, aguarde...");
							p.closeInventory();
							return;
						}else if (hLocationCFG.get().getBoolean("Mundo.Setada") == true) {
							
			            	if (DataBaseArray.containsPlayer(p)) {
			            		if (hLocationCFG.get().get("Saida.Setada") == null) {
									p.sendMessage("§cEssa area ainda nao foi setada, relogue no servidor");
									return;
								}else if (hLocationCFG.get().getBoolean("Saida.Setada") == true) {
					            	p.sendMessage("§aVoce Saiu do mundo de §aluta §acom sucesso");
					            	p.teleport((Location) hLocationCFG.get().get("Saida.Loc"));
					            	p.getInventory().setItem(1, null);
					            	p.getInventory().setItem(0, null);
					            	p.getInventory().setHelmet(null);
					            	p.getInventory().setChestplate(null);
					            	p.getInventory().setLeggings(null);
					            	p.getInventory().setBoots(null);
					            	DataBaseArray.removePlayer(p);
					            	return;
								}
			            	}
							
				            boolean isEmpty = true;
				            for (ItemStack item : p.getInventory().getContents()) {
				                if(item != null) {
				                    isEmpty = false;
				                    break;
				                }
				            }
				            if(isEmpty) {
				            	
				            	if (!DataBaseArray.containsPlayer(p)) {
					            	p.sendMessage("§aVoce Entrou no mundo de §cluta §acom sucesso !");
					            	p.sendMessage("");
					            	p.sendMessage("§aAqui voce pode conseguir §eItem especiais §aminerando ou lutando !!");
					            	p.sendMessage("");
					            	DataBaseArray.addPlayer(p);
					            	p.teleport((Location) hLocationCFG.get().get("Mundo.Loc"));
					            	Item_Plugin.Give_MundoLuta(p);
					            	return;
				            	}else {
				            		
				            	}
				            	p.closeInventory();
				            }else {
				            	
					           p.sendMessage("§eLimpe seu inventario para entrar nessa area primeiro !");
					           p.closeInventory();
					           return;
				            }
						}
					}
					
					if (e.getCurrentItem().getType() == Material.EMERALD) {
						Inventario.Inventario_Upgrade_Menu(p);
					}
					
				}
			}
		}
	}
}
