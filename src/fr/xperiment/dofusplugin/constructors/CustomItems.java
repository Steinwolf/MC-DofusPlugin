package fr.xperiment.dofusplugin.constructors;

import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CustomItems {
	public ItemStack getItem(Material material, String customName, List<String> customLore) {
		ItemStack item = new ItemStack(material,1);
		ItemMeta itemMeta = item.getItemMeta();
		if (customName!=null) itemMeta.setDisplayName(customName);
		if (customLore.size()>0) itemMeta.setLore(customLore);
		itemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item.setItemMeta(itemMeta);
		return item;	
	}
}
