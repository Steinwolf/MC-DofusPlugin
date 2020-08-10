package fr.xperiment.dofusplugin;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import fr.xperiment.dofusplugin.constructors.CustomClasses;

public class DofusListener implements Listener{
	
	@EventHandler
	public void onClick(InventoryClickEvent event) {
		Player player = (Player) event.getWhoClicked();
		ItemStack itemClicked = event.getCurrentItem();
		
		if (itemClicked == null) return;
		
		if (itemClicked.getType()==Material.PAPER && itemClicked.getItemMeta().getDisplayName().equalsIgnoreCase("§2Certificat de Classe")) {
			event.setCancelled(true);
			return;
		}
		
		if (event.getView().getTitle().equalsIgnoreCase("§8Menu des classes disponibles")) {
			event.setCancelled(true);
			switch (itemClicked.getType()) {
				case ARROW:
					CustomClasses.setClass(player, Class.CRA);
					break;
				case CHAIN:
					CustomClasses.setClass(player, Class.SACRIEUR);
					break;
				case IRON_SWORD:
					CustomClasses.setClass(player, Class.IOP);
					break;
				case TNT:
					CustomClasses.setClass(player, Class.ROUBLARD);
					break;
				case SPAWNER:
					CustomClasses.setClass(player, Class.OSAMODAS);
					break;
				case POTION:
					CustomClasses.setClass(player, Class.ENIRIPSA);
					break;
				case WITHER_SKELETON_SKULL:
					CustomClasses.setClass(player, Class.SRAM);
					break;
				case CLOCK:
					CustomClasses.setClass(player, Class.XELOR);
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
