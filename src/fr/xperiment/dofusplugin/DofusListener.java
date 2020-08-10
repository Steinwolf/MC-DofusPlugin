package fr.xperiment.dofusplugin;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class DofusListener implements Listener{
	
	@EventHandler
	public void onClick(InventoryClickEvent event) {
		Player player = (Player) event.getWhoClicked();
		ItemStack itemClicked = event.getCurrentItem();
		
		if (itemClicked == null) return;
		
		if (event.getView().getTitle().equalsIgnoreCase("§8Menu des classes disponibles")) {
			event.setCancelled(true);
			switch (itemClicked.getType()) {
				case ARROW:
					player.sendMessage("Vous souhaitez devenir un §2Cra§r, seulement la classe n'existe pas encore...");
					//player.closeInventory();
					break;
				case CHAIN:
					player.sendMessage("Vous souhaitez devenir un §2Sacrieur§r, seulement la classe n'existe pas encore...");
					//player.closeInventory();
					break;
				case IRON_SWORD:
					player.sendMessage("Vous souhaitez devenir un §2Iop§r, seulement la classe n'existe pas encore...");
					//player.closeInventory();
					break;
				case TNT:
					player.sendMessage("Vous souhaitez devenir un §2Roublard§r, seulement la classe n'existe pas encore...");
					//player.closeInventory();
					break;
				case SPAWNER:
					player.sendMessage("Vous souhaitez devenir un §2Osamodas§r, seulement la classe n'existe pas encore...");
					//player.closeInventory();
					break;
				case POTION:
					player.sendMessage("Vous souhaitez devenir un §2Eniripsa§r, seulement la classe n'existe pas encore...");
					//player.closeInventory();
					break;
				case WITHER_SKELETON_SKULL:
					player.sendMessage("Vous souhaitez devenir un §2Sram§r, seulement la classe n'existe pas encore...");
					//player.closeInventory();
					break;
				case CLOCK:
					player.sendMessage("Vous souhaitez devenir un §2Xelor§r, seulement la classe n'existe pas encore...");
					//player.closeInventory();
					break;					
				case BARRIER:
					player.sendMessage("Comming Soon, sois patient !");
					//player.closeInventory();
					break;
				default:
					break;
			}
				
		}
	}

}
