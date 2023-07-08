package hLuta.Utils;

import java.util.ArrayList;

import org.bukkit.entity.Player;

public class DataBaseArray {

	static ArrayList<String> DataBase_Array = new ArrayList<>();
	
	public static boolean containsPlayer(Player p) {
		return DataBase_Array.contains(p.getName());
	}
	
	public static void addPlayer(Player p) {
		
		if (!containsPlayer(p)) {
			DataBase_Array.add(p.getName());
		}else {
			
		}
		
	}
	
	public static void removePlayer(Player p) {
		
		if (containsPlayer(p)) {
			DataBase_Array.remove(p.getName());
		}else {
			
		}
		
	}
	
	
}
