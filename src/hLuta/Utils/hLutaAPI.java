package hLuta.Utils;

import org.bukkit.entity.Player;

import hLuta.Config.hPlayerCFG;

public class hLutaAPI {

	public static int hPlayer_Minerios_Quantidade(Player p) {
		return hPlayerCFG.get().getInt(p.getName() + ".minerios");
	}
	
	public static void hPlayer_Minerios_QuantidadeAdd(Player p,float quantidade) {
		hPlayerCFG.get().set(p.getName() + ".minerios", hPlayer_Minerios_Quantidade(p) + quantidade);
		hPlayerCFG.save();
	}
	
	public static void hPlayer_Minerios_QuantidadeSet(Player p,float quantidade) {
		hPlayerCFG.get().set(p.getName() + ".minerios", quantidade);
		hPlayerCFG.save();
	}
	
	public static void hPlayer_Minerios_QuantidadeRemove(Player p,float quantidade) {
		hPlayerCFG.get().set(p.getName() + ".minerios", hPlayer_Minerios_Quantidade(p) - quantidade);
		hPlayerCFG.save();
	}
	
	public static int hPlayer_Espada_Level(Player p) {
		return hPlayerCFG.get().getInt(p.getName() + ".espada.level");
	}
	
	public static void hPlayer_Espada_setLevel(Player p,float quantidade) {
		hPlayerCFG.get().set(p.getName() + ".espada.level", quantidade);
		hPlayerCFG.save();
	}
	
	public static int hPlayer_Picareta_Level(Player p) {
		return hPlayerCFG.get().getInt(p.getName() + ".picareta.level");
	}
	
	public static void hPlayer_Picareta_setLevel(Player p,float quantidade) {
		hPlayerCFG.get().set(p.getName() + ".picareta.level", quantidade);
		hPlayerCFG.save();
	}
	
	public static int hPlayer_Capacete_Level(Player p) {
		return hPlayerCFG.get().getInt(p.getName() + ".capacete.level");
	}
	
	public static void hPlayer_Capacete_setLevel(Player p,float quantidade) {
		hPlayerCFG.get().set(p.getName() + ".capacete.level", quantidade);
		hPlayerCFG.save();
	}
	
	public static int hPlayer_Peitoral_Level(Player p) {
		return hPlayerCFG.get().getInt(p.getName() + ".peitoral.level");
	}
	
	public static void hPlayer_Peitoral_setLevel(Player p,float quantidade) {
		hPlayerCFG.get().set(p.getName() + ".peitoral.level", quantidade);
		hPlayerCFG.save();
	}
	
	public static int hPlayer_Calças_Level(Player p) {
		return hPlayerCFG.get().getInt(p.getName() + ".calcas.level");
	}
	
	public static void hPlayer_Calças_setLevel(Player p,float quantidade) {
		hPlayerCFG.get().set(p.getName() + ".calcas.level", quantidade);
		hPlayerCFG.save();
	}
	
	public static int hPlayer_Botas_Level(Player p) {
		return hPlayerCFG.get().getInt(p.getName() + ".botas.level");
	}
	
	public static void hPlayer_Botas_setLevel(Player p,float quantidade) {
		hPlayerCFG.get().set(p.getName() + ".botas.level", quantidade);
		hPlayerCFG.save();
	}
	
}
