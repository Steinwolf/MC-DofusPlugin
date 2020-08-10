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
	
	CustomItems it = new CustomItems();

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {
		if (!(sender instanceof Player || sender == null)) return false;
		
		Player player = (Player) sender;
		
		if (string.equalsIgnoreCase("class")){
			Inventory classMenu = Bukkit.createInventory(null, 27, "§8Menu des classes disponibles");
			
			classMenu.setItem(1, it.getItem(Material.ARROW,"§2Cra",Arrays.asList("§6[Dofus]","Cliquez pour choisir la classe §2Cra§r !")));
			classMenu.setItem(3, it.getItem(Material.SPAWNER,"§2Osamodas",Arrays.asList("§6[Dofus]","Cliquez pour choisir la classe §2Osamodas§r !")));
			classMenu.setItem(5, it.getItem(Material.TNT,"§2Roublard",Arrays.asList("§6[Dofus]","Cliquez pour choisir la classe §2Roublard§r !")));
			classMenu.setItem(7, it.getItem(Material.WITHER_SKELETON_SKULL,"§2Sram",Arrays.asList("§6[Dofus]","Cliquez pour choisir la classe §2Sram§r !")));
			
			classMenu.setItem(19, it.getItem(Material.CHAIN,"§2Sacrieur",Arrays.asList("§6[Dofus]","Cliquez pour choisir la classe §2Sacrieur§r !")));
			classMenu.setItem(21, it.getItem(Material.CLOCK,"§2Xelor",Arrays.asList("§6[Dofus]","Cliquez pour choisir la classe §2Xelor§r !")));
			classMenu.setItem(23, it.getItem(Material.POTION,"§2WIP",Arrays.asList("§6[Dofus]","Cliquez pour choisir la classe §2Eniripsa§r !")));
			classMenu.setItem(25, it.getItem(Material.IRON_SWORD,"§2Iop",Arrays.asList("§6[Dofus]","Cliquez pour choisir la classe §2Iop§r !")));
			
			player.openInventory(classMenu);
		}
		
		return false;
	}

}
