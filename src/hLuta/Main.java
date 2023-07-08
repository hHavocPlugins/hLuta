package hLuta;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import hLuta.Config.hLocationCFG;
import hLuta.Config.hPlayerCFG;
import hLuta.Eventos.hBlockBreakListener;
import hLuta.Eventos.hJoinListener;
import hLuta.Eventos.hLutaCMDListener;
import hLuta.Eventos.hPlayerQuitEvent;
import hLuta.Eventos.hUpgradeClickEvent;
import hLuta.Player.hMoveInvListener;
import hLuta.Player.hPickupAndDropListener;
import hLuta.Player.hPlayerCommandCancelListener;
import hLuta.Player.hPlayerDeathListener;
import hLutaComandos.hLutaAdminCMD;
import hLutaComandos.hLutaCMD;

public class Main  extends JavaPlugin {

	public static PluginManager pm = Bukkit.getPluginManager();
	private static Main main;
	public static Main getInstance() {
		return main;
	}
	
	@Override
	public void onEnable() {
		main = this;
		Bukkit.getConsoleSender().sendMessage("");
		Bukkit.getConsoleSender().sendMessage("§9[hLuta] §ePlugin esta sendo iniciado");
		Bukkit.getConsoleSender().sendMessage("");
		
		Eventos();
		Comandos(); 
		saveDefaultConfig();
		hPlayerCFG.setup();
		hLocationCFG.setup();
		
	}
	
	void Comandos() {
		getCommand("luta").setExecutor(new hLutaCMD());
		getCommand("hlutaadmin").setExecutor(new hLutaAdminCMD());
	}
	
	void Eventos() {
		pm.registerEvents(new hJoinListener(), this);
		pm.registerEvents(new hLutaCMDListener(), this);
		pm.registerEvents(new hBlockBreakListener(), this);
		pm.registerEvents(new hPlayerQuitEvent(), this);
		pm.registerEvents(new hMoveInvListener(), this);
		pm.registerEvents(new hPickupAndDropListener(), this);
		pm.registerEvents(new hPlayerDeathListener(), this);
		pm.registerEvents(new hPlayerCommandCancelListener(), this);
		pm.registerEvents(new hUpgradeClickEvent(), this);
	}
	
	@Override
	public void onDisable() {
		main = null;
		Bukkit.getConsoleSender().sendMessage("");
		Bukkit.getConsoleSender().sendMessage("§9[hLuta] §ePlugin esta sendo desligado");
		Bukkit.getConsoleSender().sendMessage("");
	}
	
}
