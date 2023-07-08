package hLutaComandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import hLuta.Main;
import hLuta.Config.hLocationCFG;

public class hLutaAdminCMD implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg, String[] args) {

		if (cmd.getName().equalsIgnoreCase("hlutaadmin")) {
			if (sender instanceof Player) {
				Player p = (Player) sender;
				
				if (!p.hasPermission("hluta.admin")) {
					p.sendMessage("§cVoce nao tem permissao para executar esse comando");
					return true;
				}
				
				if (args.length == 0) {
					p.sendMessage("§eLista de §6Comandos");
					p.sendMessage("");
					p.sendMessage("§e/hlutaadmin reload");
					p.sendMessage("§e/hlutaadmin set <mundo/saida>");
					p.sendMessage("§e/hlutaadmin addItem <nome>");
					p.sendMessage("");
					return true;
				}
				
				if (args.length == 1) {
					if (args[0].equalsIgnoreCase("reload")) {
						p.sendMessage("§eConfig foi recarregado com sucesso !");
						Main.getInstance().reloadConfig();
						return true;
					}else if (args[0].equalsIgnoreCase("set")) {
						p.sendMessage("§e/hlutaadmin set <mundo/saida>");
						return true;
					}
				}
				
				if (args.length == 2) {
					if (args[0].equalsIgnoreCase("set")) {
						if (args[1].equalsIgnoreCase("mundo")) {
							p.sendMessage("§eVoce setou o lugar 'mundo' com sucesso");
							hLocationCFG.get().set("Mundo.Setada", true);
							hLocationCFG.get().set("Mundo.Loc", p.getLocation());
							hLocationCFG.save();
							return true;
						}else if (args[1].equalsIgnoreCase("saida")) {
							p.sendMessage("§eVoce setou o lugar 'saida' com sucesso");
							hLocationCFG.get().set("Saida.Setada", true);
							hLocationCFG.get().set("Saida.Loc", p.getLocation());
							hLocationCFG.save();
							return true;
						}
					}else if (args[0].equalsIgnoreCase("addItem")) {
						String nome = args[1];
						if (Main.getInstance().getConfig().getString("Items.item." + nome) == null) {
							Main.getInstance().getConfig().set("Items.item." + nome, p.getItemInHand());
							Main.getInstance().saveConfig();
							p.sendMessage("§eVoce adicionou o '" + nome + "' com sucesso");
							return true;
						}else {
							p.sendMessage("§eO Item '" + nome + "' Ja existe na config !");
							return true;
						}
					}
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
