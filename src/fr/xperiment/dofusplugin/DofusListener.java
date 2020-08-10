package fr.xperiment.dofusplugin;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import fr.xperiment.dofusplugin.constructors.CustomItems;

public class DofusListener implements Listener{
	
	@EventHandler
	public void onClick(InventoryClickEvent event) {
		Player player = (Player) event.getWhoClicked();
		ItemStack itemClicked = event.getCurrentItem();
		
		if (itemClicked == null) return;
		
		if (itemClicked.equals(CustomItems.getItem(Material.PAPER,"§2Certificat de Classe",Arrays.asList("§6[Dofus]")))) {
			event.setCancelled(true);
			return;
		}
		
		if (event.getView().getTitle().equalsIgnoreCase("§8Menu des classes disponibles")) {
			event.setCancelled(true);
			switch (itemClicked.getType()) {
				case ARROW:
					player.sendMessage("Vous avez choisi la classe §2Cra§r!");
					player.getInventory().setItem(9,CustomItems.getItem(Material.PAPER,"§2Certificat de Classe",Arrays.asList("§6[Dofus]")));
					player.closeInventory();
					break;
				case CHAIN:
					player.sendMessage("Vous avez choisi la classe §2Sacrieur§r!");
					player.getInventory().setItem(9,CustomItems.getItem(Material.PAPER,"§2Certificat de Classe",Arrays.asList("§6[Dofus]")));
					player.closeInventory();
					break;
				case IRON_SWORD:
					player.sendMessage("Vous avez choisi la classe §2Iop§r!");
					player.getInventory().setItem(9,CustomItems.getItem(Material.PAPER,"§2Certificat de Classe",Arrays.asList("§6[Dofus]")));
					player.closeInventory();
					break;
				case TNT:
					player.sendMessage("Vous avez choisi la classe §2Roublard§r!");
					player.getInventory().setItem(9,CustomItems.getItem(Material.PAPER,"§2Certificat de Classe",Arrays.asList("§6[Dofus]")));
					player.closeInventory();
					break;
				case SPAWNER:
					player.sendMessage("Vous avez choisi la classe §2Osamodas§r!");
					player.getInventory().setItem(9,CustomItems.getItem(Material.PAPER,"§2Certificat de Classe",Arrays.asList("§6[Dofus]")));
					player.closeInventory();
					break;
				case POTION:
					player.sendMessage("Vous avez choisi la classe §2Eniripsa§r!");
					player.getInventory().setItem(9,CustomItems.getItem(Material.PAPER,"§2Certificat de Classe",Arrays.asList("§6[Dofus]")));
					player.closeInventory();
					break;
				case WITHER_SKELETON_SKULL:
					player.sendMessage("Vous avez choisi la classe §2Sram§r!");
					player.getInventory().setItem(9,CustomItems.getItem(Material.PAPER,"§2Certificat de Classe",Arrays.asList("§6[Dofus]")));
					player.closeInventory();
					break;
				case CLOCK:
					player.sendMessage("Vous avez choisi la classe §2Xelor§r!");
					player.getInventory().setItem(9,CustomItems.getItem(Material.PAPER,"§2Certificat de Classe",Arrays.asList("§6[Dofus]")));
					player.closeInventory();
					break;					
				case BARRIER:
					player.sendMessage("Comming Soon, be patient !");
					player.closeInventory();
					break;
				default:
					break;
			}
				
		}
	}

}
