package hLuta.Eventos;

import java.util.ArrayList;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import hLuta.Main;
import hLuta.Utils.ActionBar;
import hLuta.Utils.DataBaseArray;
import hLuta.Utils.hLutaAPI;

public class hBlockBreakListener implements Listener{

	@SuppressWarnings("static-access")
	@EventHandler
	void Listener(BlockBreakEvent e) {
		Player p = e.getPlayer();
		if (DataBaseArray.containsPlayer(p)) {
			if (e.getBlock().getType() == Material.COAL_ORE || e.getBlock().getType() == Material.IRON_ORE || e.getBlock().getType() == Material.LAPIS_ORE || e.getBlock().getType() == Material.EMERALD_ORE || e.getBlock().getType() == Material.DIAMOND_ORE || e.getBlock().getType() == Material.GOLD_ORE) {
				Material bloco;
				bloco = e.getBlock().getType();
				
				e.getBlock().setType(Material.AIR);
				Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getInstance(), new Runnable() {
					
					@Override
					public void run() {
						e.getBlock().setType(Material.BEDROCK);
					}
				}, 10);
				Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getInstance(), new Runnable() {
					
					@Override
					public void run() {
						e.getBlock().setType(bloco);
					}
				}, 60*20);
				
				hLutaAPI.hPlayer_Minerios_QuantidadeAdd(p, 1);
				
				//Create Random Add Items !
				ArrayList<String> list_random = new ArrayList<>();
				int random = new Random().nextInt(100);
				for (String nomes : Main.getInstance().getConfig().getConfigurationSection("Items.item").getKeys(false)) {
					list_random.add(nomes);
				}
				int random_2 = new Random().nextInt(list_random.size());
				if (!list_random.isEmpty()) {
					random_2 = new Random().nextInt(list_random.size());
				}
				
				if (Main.getInstance().getInstance().getConfig().getString("Items.item") == null) {
					
				}else {
					
					if (random < 30) {
						ItemStack item = Main.getInstance().getConfig().getItemStack("Items.item." + list_random.get(random_2));
						p.getInventory().addItem(item);
						ActionBar.sendActionText(p, "§aVoce acaba de ganhar um item especial !");
					}else {
						ActionBar.sendActionText(p, "§cVoce nao achou nada a minerar isso");
					}
				}
				
			}else {
				e.setCancelled(true);
			}
		}
	}
}
