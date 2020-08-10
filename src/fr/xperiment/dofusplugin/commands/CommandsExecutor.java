package fr.xperiment.dofusplugin.commands;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import fr.xperiment.dofusplugin.constructors.CustomItems;

public class CommandsExecutor implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {
		if (!(sender instanceof Player || sender == null)) return false;
		
		Player player = (Player) sender;
		
		if (string.equalsIgnoreCase("class")){
			if (player.getInventory().contains(CustomItems.getItem(Material.PAPER,"§2Certificat de Classe",Arrays.asList("§6[Dofus]")))) {
				player.sendMessage("Vous avez déjà une classe, vous pouvez quitter votre classe avec /rmclass");
				return true;
			}
			Inventory classMenu = Bukkit.createInventory(null, 27, "§8Menu des classes disponibles");
			
			classMenu.setItem(1, CustomItems.getItem(Material.CHAIN,"§2Sacrieur",Arrays.asList("§6[Dofus]","Cliquez pour choisir la classe §2Sacrieur§r !")));
			classMenu.setItem(3, CustomItems.getItem(Material.ARROW,"§2Cra",Arrays.asList("§6[Dofus]","Cliquez pour choisir la classe §2Cra§r !")));
			classMenu.setItem(5, CustomItems.getItem(Material.IRON_SWORD,"§2Iop",Arrays.asList("§6[Dofus]","Cliquez pour choisir la classe §2Iop§r !")));
			//classMenu.setItem(7, CustomItems.getItem(Material.CLOCK,"§2Xelor",Arrays.asList("§6[Dofus]","Cliquez pour choisir la classe §2Xelor§r !")));
			classMenu.setItem(7, CustomItems.getItem(Material.BARRIER,"§2Xelor",Arrays.asList("§6[Dofus]","Cliquez pour choisir la classe §2Xelor§r !")));
			
			classMenu.setItem(19, CustomItems.getItem(Material.WITHER_SKELETON_SKULL,"§2Sram",Arrays.asList("§6[Dofus]","Cliquez pour choisir la classe §2Sram§r !")));
			classMenu.setItem(21, CustomItems.getItem(Material.SPAWNER,"§2Osamodas",Arrays.asList("§6[Dofus]","Cliquez pour choisir la classe §2Osamodas§r !")));
			//classMenu.setItem(23, CustomItems.getItem(Material.POTION,"§2WIP",Arrays.asList("§6[Dofus]","Cliquez pour choisir la classe §2Eniripsa§r !")));
			classMenu.setItem(23, CustomItems.getItem(Material.BARRIER,"§2WIP",Arrays.asList("§6[Dofus]","Cliquez pour choisir la classe §2Eniripsa§r !")));
			//classMenu.setItem(25, CustomItems.getItem(Material.TNT,"§2Roublard",Arrays.asList("§6[Dofus]","Cliquez pour choisir la classe §2Roublard§r !")));
			classMenu.setItem(25, CustomItems.getItem(Material.BARRIER,"§2Roublard",Arrays.asList("§6[Dofus]","Cliquez pour choisir la classe §2Roublard§r !")));
			
			player.openInventory(classMenu);
		}
		
		if (string.equalsIgnoreCase("rmclass")){
			if (!(player.getInventory().contains(CustomItems.getItem(Material.PAPER,"§2Certificat de Classe",Arrays.asList("§6[Dofus]"))))) {
				player.sendMessage("Vous n'avez pas encore de classe, vous pouvez en choisir une avec /class");
				return true;
			}
			player.getInventory().remove(CustomItems.getItem(Material.PAPER,"§2Certificat de Classe",Arrays.asList("§6[Dofus]")));
			player.sendMessage("Votre classe a été retirée ! Vous pouvez en choisir une nouvelle avec /class");
		}
	
		return true;
	}

}
