package hLuta.Eventos;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import hLuta.Utils.hLutaAPI;

public class hUpgradeClickEvent implements Listener {

	public static int price() {
		return 3670;
	}
	
	@EventHandler
	void Listener(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		if (e.getInventory().getTitle().equals("§aUpgrade")) {
			e.setCancelled(true);
			
			if (e.getCurrentItem().hasItemMeta()) {
				if (e.getCurrentItem().getItemMeta().hasDisplayName()) {
					
					if (e.getCurrentItem().getType() == Material.DIAMOND_CHESTPLATE) {
						int calc = price() * hLutaAPI.hPlayer_Peitoral_Level(p);
						if (hLutaAPI.hPlayer_Peitoral_Level(p) >= 4) {
							p.sendMessage("§cVoce ja esta no nivel maximo melhoria !");
							p.closeInventory();
							return;
						}else {
							if (hLutaAPI.hPlayer_Minerios_Quantidade(p) >= calc) {
								p.sendMessage("§aVoce melhorou um nivel com sucesso !");
								hLutaAPI.hPlayer_Peitoral_setLevel(p, hLutaAPI.hPlayer_Peitoral_Level(p) + 1);
								hLutaAPI.hPlayer_Minerios_QuantidadeRemove(p, calc);
								p.closeInventory();
								return;
							}else {
								p.sendMessage("§cVoce nao tem blocos suficientes pra isso");
								p.closeInventory();
								return;
							}
						}
					}
					
					if (e.getCurrentItem().getType() == Material.DIAMOND_LEGGINGS) {
						int calc = price() * hLutaAPI.hPlayer_Calças_Level(p);
						if (hLutaAPI.hPlayer_Calças_Level(p) >= 4) {
							p.sendMessage("§cVoce ja esta no nivel maximo melhoria !");
							p.closeInventory();
							return;
						}else {
							if (hLutaAPI.hPlayer_Minerios_Quantidade(p) >= calc) {
								p.sendMessage("§aVoce melhorou um nivel com sucesso !");
								hLutaAPI.hPlayer_Calças_setLevel(p, hLutaAPI.hPlayer_Calças_Level(p) + 1);
								hLutaAPI.hPlayer_Minerios_QuantidadeRemove(p, calc);
								p.closeInventory();
								return;
							}else {
								p.sendMessage("§cVoce nao tem blocos suficientes pra isso");
								p.closeInventory();
								return;
							}
						}
						
					}
					
					if (e.getCurrentItem().getType() == Material.DIAMOND_BOOTS) {
						int calc = price() * hLutaAPI.hPlayer_Botas_Level(p);
						if (hLutaAPI.hPlayer_Botas_Level(p) >= 4) {
							p.sendMessage("§cVoce ja esta no nivel maximo melhoria !");
							p.closeInventory();
							return;
						}else {
							if (hLutaAPI.hPlayer_Minerios_Quantidade(p) >= calc) {
								p.sendMessage("§aVoce melhorou um nivel com sucesso !");
								hLutaAPI.hPlayer_Botas_setLevel(p, hLutaAPI.hPlayer_Botas_Level(p) + 1);
								hLutaAPI.hPlayer_Minerios_QuantidadeRemove(p, calc);
								p.closeInventory();
								return;
							}else {
								p.sendMessage("§cVoce nao tem blocos suficientes pra isso");
								p.closeInventory();
								return;
							}
						}
					}
					
					if (e.getCurrentItem().getType() == Material.DIAMOND_PICKAXE) {
						int calc = price() * hLutaAPI.hPlayer_Picareta_Level(p);
						if (hLutaAPI.hPlayer_Picareta_Level(p) >= 4) {
							p.sendMessage("§cVoce ja esta no nivel maximo melhoria !");
							p.closeInventory();
							return;
						}else {
							
							if (hLutaAPI.hPlayer_Minerios_Quantidade(p) >= calc) {
								p.sendMessage("§aVoce melhorou um nivel com sucesso !");
								hLutaAPI.hPlayer_Picareta_setLevel(p, hLutaAPI.hPlayer_Picareta_Level(p) + 1);
								hLutaAPI.hPlayer_Minerios_QuantidadeRemove(p, calc);
								p.closeInventory();
								return;
							}else {
								p.sendMessage("§cVoce nao tem blocos suficientes pra isso");
								p.closeInventory();
								return;
							}
								
						}
					}
				}
			}
		}
	}
}
