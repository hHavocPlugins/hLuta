package hLutaComandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import hLuta.Utils.Inventario;

public class hLutaCMD implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg, String[] args) {
		
		if (cmd.getName().equalsIgnoreCase("luta")) {
			
			if (sender instanceof Player) {
				Player p = (Player) sender;
				
				if (args.length == 0) {
					Inventario.Inventario_hLutaCMD(p);
					return true;
				}
				
				
			}else {
				Bukkit.getConsoleSender().sendMessage("");
				Bukkit.getConsoleSender().sendMessage("§9[hLuta] §eApenas jogadores pode executar esse comando");
				Bukkit.getConsoleSender().sendMessage("");
			}
			
		}
		
		return false;
	}

}
