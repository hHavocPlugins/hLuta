package hLuta.Utils;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Inventario {

	public static void Inventario_Upgrade_Menu(Player p) {
		Inventory inv = Bukkit.createInventory(p, 3*9, "§aUpgrade");
		
		ItemStack peitoral = new ItemStack(Material.DIAMOND_CHESTPLATE);
		ItemStack calcas = new ItemStack(Material.DIAMOND_LEGGINGS);
		ItemStack botas = new ItemStack(Material.DIAMOND_BOOTS);
		ItemStack picareta = new ItemStack(Material.DIAMOND_PICKAXE);
		ItemStack espada = new ItemStack(Material.DIAMOND_SWORD);
		
		ItemMeta peitoralm = peitoral.getItemMeta();
		ItemMeta calcasm = calcas.getItemMeta();
		ItemMeta botasm = botas.getItemMeta();
		
		ItemMeta picaretam = picareta.getItemMeta();
		ItemMeta espadam = espada.getItemMeta();
		
		peitoralm.setDisplayName("§ePeitoral");
		calcasm.setDisplayName("§eCalças");
		botasm.setDisplayName("§eBotas");
		
		picaretam.setDisplayName("§eSua Picareta");
		espadam.setDisplayName("§eSua Espada");
		
		ArrayList<String> peitoral_lore = new ArrayList<>();
		peitoral_lore.add("");
		peitoral_lore.add("§7Melhore seu peitoral para se proteger dos inimigos");
		peitoral_lore.add("§7Nivel: " + hLutaAPI.hPlayer_Peitoral_Level(p) + "/4");
		peitoral_lore.add("§7Custo: " + 3670 * hLutaAPI.hPlayer_Peitoral_Level(p) + " Blocos");
		peitoral_lore.add("");
		
		ArrayList<String> calcas_lore = new ArrayList<>();
		calcas_lore.add("");
		calcas_lore.add("§7Melhore seu calças para se proteger dos inimigos");
		calcas_lore.add("§7Nivel: " + hLutaAPI.hPlayer_Calças_Level(p) + "/4");
		calcas_lore.add("§7Custo: " + 3670 * hLutaAPI.hPlayer_Calças_Level(p) + " Blocos");
		calcas_lore.add("");
		
		ArrayList<String> botas_lore = new ArrayList<>();
		botas_lore.add("");
		botas_lore.add("§7Melhore seu botas para se proteger dos inimigos");
		botas_lore.add("§7Nivel: " + hLutaAPI.hPlayer_Botas_Level(p) + "/4");
		botas_lore.add("§7Custo: " + 3670 * hLutaAPI.hPlayer_Botas_Level(p) + " Blocos");
		botas_lore.add("");
		
		ArrayList<String> picareta_lore = new ArrayList<>();
		picareta_lore.add("");
		picareta_lore.add("§7Melhore sua picareta para minerar mais rapido !");
		picareta_lore.add("§7Nivel: " + hLutaAPI.hPlayer_Picareta_Level(p) + "/4");
		picareta_lore.add("§7Custo: " + 3670 * hLutaAPI.hPlayer_Picareta_Level(p) + " Blocos");
		picareta_lore.add("");
		
		ArrayList<String> espada_lore = new ArrayList<>();
		espada_lore.add("");
		espada_lore.add("§7Esse item esta bloqueado de upar no momento !");
		espada_lore.add("");
		
		peitoralm.setLore(peitoral_lore);
		calcasm.setLore(calcas_lore);
		botasm.setLore(botas_lore);
		
		picaretam.setLore(picareta_lore);
		espadam.setLore(espada_lore);
		
		peitoral.setItemMeta(peitoralm);
		calcas.setItemMeta(calcasm);
		botas.setItemMeta(botasm);
		
		picareta.setItemMeta(picaretam);
		espada.setItemMeta(espadam);
		
		inv.setItem(10, peitoral);
		inv.setItem(11, calcas);
		inv.setItem(12, botas);
		
		inv.setItem(14, picareta);
		inv.setItem(16, espada);

		p.openInventory(inv);
	}
	
	public static void Inventario_hLutaCMD(Player p) {
		Inventory inv = Bukkit.createInventory(p, 3*9, "§7Luta");
		
		ItemStack upgrade = new ItemStack(Material.EMERALD);
		ArrayList<String> upgrade_lore = new ArrayList<>();
		upgrade_lore.add("");
		upgrade_lore.add("§7Melhore seus items do mundo de §cluta §7!");
		float quantidade_blocos_minerados = Float.valueOf(hLutaAPI.hPlayer_Minerios_Quantidade(p));
		if (quantidade_blocos_minerados < 1000) {
			upgrade_lore.add("§7Blocos minerados: " + quantidade_blocos_minerados);
		}else if (quantidade_blocos_minerados >= 1000 && quantidade_blocos_minerados < 1000000) {
			int quantidade_blocos_minerados_result = (int) (quantidade_blocos_minerados / 1000);
			upgrade_lore.add("§7Blocos minerados: " + quantidade_blocos_minerados_result + "k");
		}else if (quantidade_blocos_minerados >= 1000000 && quantidade_blocos_minerados < 1000000000) {
			int quantidade_blocos_minerados_result = (int) (quantidade_blocos_minerados / 1000000);
			upgrade_lore.add("§7Blocos minerados: " + quantidade_blocos_minerados_result + "M");
		}else if (quantidade_blocos_minerados >= 1000000000 && quantidade_blocos_minerados < 1000000000000.0) {
			int quantidade_blocos_minerados_result = (int) (quantidade_blocos_minerados / 1000000000);
			upgrade_lore.add("§7Blocos minerados: " + quantidade_blocos_minerados_result + "B");
		}
		upgrade_lore.add("");
		ItemMeta upgradem = upgrade.getItemMeta();
		upgradem.setDisplayName("§aUpgrade");
		upgradem.setLore(upgrade_lore);
		upgrade.setItemMeta(upgradem);
		inv.setItem(12, upgrade);
		
		ItemStack mundo = new ItemStack(Material.GRASS);
		ArrayList<String> mundo_lore = new ArrayList<>();
		mundo_lore.add("");
		mundo_lore.add("§7Entre em nosso mundo");
		mundo_lore.add("§7para começar a lutar nesse sistema");
		mundo_lore.add("");
		ItemMeta mundom = mundo.getItemMeta();
		mundom.setDisplayName("§7Mundo de Luta");
		mundom.setLore(mundo_lore);
		mundo.setItemMeta(mundom);
		inv.setItem(14, mundo);

		p.openInventory(inv);
	}
	
}
