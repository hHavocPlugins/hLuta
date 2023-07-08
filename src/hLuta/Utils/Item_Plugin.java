package hLuta.Utils;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Item_Plugin {

	public static void Give_MundoLuta(Player p) {
		p.getInventory().clear();
		p.getInventory().setArmorContents(null);
		
		//Capacete
		if (hLutaAPI.hPlayer_Capacete_Level(p) == 0) {
			ItemStack item = new ItemStack(Material.DIAMOND_HELMET);
			ItemMeta itemm = item.getItemMeta();
			itemm.setDisplayName("§eCapacete");
			ArrayList<String> item_lore = new ArrayList<>();
			item_lore.add("");
			item_lore.add("§7Lute com o seu capacete !");
			item_lore.add("");
			itemm.setLore(item_lore);
			itemm.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item.setItemMeta(itemm);
			p.getInventory().setItem(1, item);
		}
		
		if (hLutaAPI.hPlayer_Capacete_Level(p) == 1) {
			ItemStack item = new ItemStack(Material.DIAMOND_HELMET);
			ItemMeta itemm = item.getItemMeta();
			itemm.setDisplayName("§eCapacete");
			ArrayList<String> item_lore = new ArrayList<>();
			item_lore.add("");
			item_lore.add("§7Lute com o seu capacete !");
			item_lore.add("");
			itemm.setLore(item_lore);
			itemm.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
			item.setItemMeta(itemm);
			p.getInventory().setItem(1, item);
		}
		
		if (hLutaAPI.hPlayer_Capacete_Level(p) == 2) {
			ItemStack item = new ItemStack(Material.DIAMOND_HELMET);
			ItemMeta itemm = item.getItemMeta();
			itemm.setDisplayName("§eCapacete");
			ArrayList<String> item_lore = new ArrayList<>();
			item_lore.add("");
			item_lore.add("§7Lute com o seu capacete !");
			item_lore.add("");
			itemm.setLore(item_lore);
			itemm.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
			item.setItemMeta(itemm);
			p.getInventory().setItem(1, item);
		}
		
		if (hLutaAPI.hPlayer_Capacete_Level(p) == 3) {
			ItemStack item = new ItemStack(Material.DIAMOND_HELMET);
			ItemMeta itemm = item.getItemMeta();
			itemm.setDisplayName("§eCapacete");
			ArrayList<String> item_lore = new ArrayList<>();
			item_lore.add("");
			item_lore.add("§7Lute com o seu capacete !");
			item_lore.add("");
			itemm.setLore(item_lore);
			itemm.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
			item.setItemMeta(itemm);
			p.getInventory().setItem(1, item);
		}
		
		if (hLutaAPI.hPlayer_Capacete_Level(p) == 4) {
			ItemStack item = new ItemStack(Material.DIAMOND_HELMET);
			ItemMeta itemm = item.getItemMeta();
			itemm.setDisplayName("§eCapacete");
			ArrayList<String> item_lore = new ArrayList<>();
			item_lore.add("");
			item_lore.add("§7Lute com o seu capacete !");
			item_lore.add("");
			itemm.setLore(item_lore);
			itemm.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
			item.setItemMeta(itemm);
			p.getInventory().setHelmet(item);
		}
		
		//Peitor
		if (hLutaAPI.hPlayer_Peitoral_Level(p) == 0) {
			ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE);
			ItemMeta itemm = item.getItemMeta();
			itemm.setDisplayName("§ePeitoral");
			ArrayList<String> item_lore = new ArrayList<>();
			item_lore.add("");
			item_lore.add("§7Lute com o seu peitoral !");
			item_lore.add("");
			itemm.setLore(item_lore);
			itemm.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item.setItemMeta(itemm);
			p.getInventory().setChestplate(item);
		}
		
		if (hLutaAPI.hPlayer_Peitoral_Level(p) == 1) {
			ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE);
			ItemMeta itemm = item.getItemMeta();
			itemm.setDisplayName("§ePeitoral");
			ArrayList<String> item_lore = new ArrayList<>();
			item_lore.add("");
			item_lore.add("§7Lute com o seu peitoral !");
			item_lore.add("");
			itemm.setLore(item_lore);
			itemm.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
			item.setItemMeta(itemm);
			p.getInventory().setChestplate(item);
		}

		if (hLutaAPI.hPlayer_Peitoral_Level(p) == 2) {
			ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE);
			ItemMeta itemm = item.getItemMeta();
			itemm.setDisplayName("§ePeitoral");
			ArrayList<String> item_lore = new ArrayList<>();
			item_lore.add("");
			item_lore.add("§7Lute com o seu peitoral !");
			item_lore.add("");
			itemm.setLore(item_lore);
			itemm.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
			item.setItemMeta(itemm);
			p.getInventory().setChestplate(item);
		}
		
		if (hLutaAPI.hPlayer_Peitoral_Level(p) == 3) {
			ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE);
			ItemMeta itemm = item.getItemMeta();
			itemm.setDisplayName("§ePeitoral");
			ArrayList<String> item_lore = new ArrayList<>();
			item_lore.add("");
			item_lore.add("§7Lute com o seu peitoral !");
			item_lore.add("");
			itemm.setLore(item_lore);
			itemm.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
			item.setItemMeta(itemm);
			p.getInventory().setChestplate(item);
		}
		
		if (hLutaAPI.hPlayer_Peitoral_Level(p) == 4) {
			ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE);
			ItemMeta itemm = item.getItemMeta();
			itemm.setDisplayName("§ePeitoral");
			ArrayList<String> item_lore = new ArrayList<>();
			item_lore.add("");
			item_lore.add("§7Lute com o seu peitoral !");
			item_lore.add("");
			itemm.setLore(item_lore);
			itemm.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
			item.setItemMeta(itemm);
			p.getInventory().setChestplate(item);
		}
		
		//Calças
		if (hLutaAPI.hPlayer_Calças_Level(p) == 0) {
			ItemStack item = new ItemStack(Material.DIAMOND_LEGGINGS);
			ItemMeta itemm = item.getItemMeta();
			itemm.setDisplayName("§eCalças");
			ArrayList<String> item_lore = new ArrayList<>();
			item_lore.add("");
			item_lore.add("§7Lute com a sua calças !");
			item_lore.add("");
			itemm.setLore(item_lore);
			itemm.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item.setItemMeta(itemm);
			p.getInventory().setLeggings(item);
		}
		
		if (hLutaAPI.hPlayer_Calças_Level(p) == 1) {
			ItemStack item = new ItemStack(Material.DIAMOND_LEGGINGS);
			ItemMeta itemm = item.getItemMeta();
			itemm.setDisplayName("§eCalças");
			ArrayList<String> item_lore = new ArrayList<>();
			item_lore.add("");
			item_lore.add("§7Lute com a sua calças !");
			item_lore.add("");
			itemm.setLore(item_lore);
			itemm.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
			item.setItemMeta(itemm);
			p.getInventory().setLeggings(item);
		}
		
		if (hLutaAPI.hPlayer_Calças_Level(p) == 2) {
			ItemStack item = new ItemStack(Material.DIAMOND_LEGGINGS);
			ItemMeta itemm = item.getItemMeta();
			itemm.setDisplayName("§eCalças");
			ArrayList<String> item_lore = new ArrayList<>();
			item_lore.add("");
			item_lore.add("§7Lute com a sua calças !");
			item_lore.add("");
			itemm.setLore(item_lore);
			itemm.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
			item.setItemMeta(itemm);
			p.getInventory().setLeggings(item);
		}
		
		if (hLutaAPI.hPlayer_Calças_Level(p) == 3) {
			ItemStack item = new ItemStack(Material.DIAMOND_LEGGINGS);
			ItemMeta itemm = item.getItemMeta();
			itemm.setDisplayName("§eCalças");
			ArrayList<String> item_lore = new ArrayList<>();
			item_lore.add("");
			item_lore.add("§7Lute com a sua calças !");
			item_lore.add("");
			itemm.setLore(item_lore);
			itemm.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
			item.setItemMeta(itemm);
			p.getInventory().setLeggings(item);
		}
		
		if (hLutaAPI.hPlayer_Calças_Level(p) == 4) {
			ItemStack item = new ItemStack(Material.DIAMOND_LEGGINGS);
			ItemMeta itemm = item.getItemMeta();
			itemm.setDisplayName("§eCalças");
			ArrayList<String> item_lore = new ArrayList<>();
			item_lore.add("");
			item_lore.add("§7Lute com a sua calças !");
			item_lore.add("");
			itemm.setLore(item_lore);
			itemm.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
			item.setItemMeta(itemm);
			p.getInventory().setLeggings(item);
		}
		
		//Botas
		if (hLutaAPI.hPlayer_Botas_Level(p) == 0) {
			ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
			ItemMeta itemm = item.getItemMeta();
			itemm.setDisplayName("§eBotas");
			ArrayList<String> item_lore = new ArrayList<>();
			item_lore.add("");
			item_lore.add("§7Lute com a sua bota !");
			item_lore.add("");
			itemm.setLore(item_lore);
			itemm.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item.setItemMeta(itemm);
			p.getInventory().setBoots(item);
		}
		
		if (hLutaAPI.hPlayer_Botas_Level(p) == 1) {
			ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
			ItemMeta itemm = item.getItemMeta();
			itemm.setDisplayName("§eBotas");
			ArrayList<String> item_lore = new ArrayList<>();
			item_lore.add("");
			item_lore.add("§7Lute com a sua bota !");
			item_lore.add("");
			itemm.setLore(item_lore);
			itemm.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
			item.setItemMeta(itemm);
			p.getInventory().setBoots(item);
		}
		
		if (hLutaAPI.hPlayer_Botas_Level(p) == 2) {
			ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
			ItemMeta itemm = item.getItemMeta();
			itemm.setDisplayName("§eBotas");
			ArrayList<String> item_lore = new ArrayList<>();
			item_lore.add("");
			item_lore.add("§7Lute com a sua bota !");
			item_lore.add("");
			itemm.setLore(item_lore);
			itemm.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
			item.setItemMeta(itemm);
			p.getInventory().setBoots(item);
		}
		
		if (hLutaAPI.hPlayer_Botas_Level(p) == 3) {
			ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
			ItemMeta itemm = item.getItemMeta();
			itemm.setDisplayName("§eBotas");
			ArrayList<String> item_lore = new ArrayList<>();
			item_lore.add("");
			item_lore.add("§7Lute com a sua bota !");
			item_lore.add("");
			itemm.setLore(item_lore);
			itemm.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
			item.setItemMeta(itemm);
			p.getInventory().setBoots(item);
		}
		
		if (hLutaAPI.hPlayer_Botas_Level(p) == 4) {
			ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
			ItemMeta itemm = item.getItemMeta();
			itemm.setDisplayName("§eBotas");
			ArrayList<String> item_lore = new ArrayList<>();
			item_lore.add("");
			item_lore.add("§7Lute com a sua bota !");
			item_lore.add("");
			itemm.setLore(item_lore);
			itemm.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
			item.setItemMeta(itemm);
			p.getInventory().setBoots(item);
		}
		
		//Picareta
		if (hLutaAPI.hPlayer_Picareta_Level(p) == 0) {
			ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE);
			ItemMeta itemm = item.getItemMeta();
			itemm.setDisplayName("§eSua Picareta");
			ArrayList<String> item_lore = new ArrayList<>();
			item_lore.add("");
			item_lore.add("§7Minere com a sua picareta para receber items");
			item_lore.add("");
			itemm.setLore(item_lore);
			itemm.addEnchant(Enchantment.DIG_SPEED, 1, true);
			item.setItemMeta(itemm);
			p.getInventory().setItem(1, item);
		}
		
		if (hLutaAPI.hPlayer_Picareta_Level(p) == 1) {
			ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE);
			ItemMeta itemm = item.getItemMeta();
			itemm.setDisplayName("§eSua Picareta");
			ArrayList<String> item_lore = new ArrayList<>();
			item_lore.add("");
			item_lore.add("§7Minere com a sua picareta para receber items");
			item_lore.add("");
			itemm.setLore(item_lore);
			itemm.addEnchant(Enchantment.DIG_SPEED, 2, true);
			item.setItemMeta(itemm);
			p.getInventory().setItem(1, item);
		}

		if (hLutaAPI.hPlayer_Picareta_Level(p) == 2) {
			ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE);
			ItemMeta itemm = item.getItemMeta();
			itemm.setDisplayName("§eSua Picareta");
			ArrayList<String> item_lore = new ArrayList<>();
			item_lore.add("");
			item_lore.add("§7Minere com a sua picareta para receber items");
			item_lore.add("");
			itemm.setLore(item_lore);
			itemm.addEnchant(Enchantment.DIG_SPEED, 3, true);
			item.setItemMeta(itemm);
			p.getInventory().setItem(1, item);
		}
		
		if (hLutaAPI.hPlayer_Picareta_Level(p) == 3) {
			ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE);
			ItemMeta itemm = item.getItemMeta();
			itemm.setDisplayName("§eSua Picareta");
			ArrayList<String> item_lore = new ArrayList<>();
			item_lore.add("");
			item_lore.add("§7Minere com a sua picareta para receber items");
			item_lore.add("");
			itemm.setLore(item_lore);
			itemm.addEnchant(Enchantment.DIG_SPEED, 4, true);
			item.setItemMeta(itemm);
			p.getInventory().setItem(1, item);
		}
		
		if (hLutaAPI.hPlayer_Picareta_Level(p) == 4) {
			ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE);
			ItemMeta itemm = item.getItemMeta();
			itemm.setDisplayName("§eSua Picareta");
			ArrayList<String> item_lore = new ArrayList<>();
			item_lore.add("");
			item_lore.add("§7Minere com a sua picareta para receber items");
			item_lore.add("");
			itemm.setLore(item_lore);
			itemm.addEnchant(Enchantment.DIG_SPEED, 5, true);
			item.setItemMeta(itemm);
			p.getInventory().setItem(1, item);
		}

		ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta itemm = item.getItemMeta();
		itemm.setDisplayName("§eSua Espada");
		ArrayList<String> item_lore = new ArrayList<>();
		item_lore.add("");
		item_lore.add("§7Batalhe com a sua espada para receber items");
		item_lore.add("");
		itemm.setLore(item_lore);
		item.setItemMeta(itemm);
		p.getInventory().setItem(0, item);
		
	}
	
}
