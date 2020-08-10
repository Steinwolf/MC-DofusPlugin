package fr.xperiment.dofusplugin.constructors;

import java.text.MessageFormat;
import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.entity.Player;

import fr.xperiment.dofusplugin.Class;

public class CustomClasses {
	public static void setClass(Player player, Class classType) {
		player.sendMessage(MessageFormat.format("Vous avez choisi la classe §2{0}§r!",classType));
		player.getInventory().setItem(9,CustomItems.getItem(Material.PAPER,"§2Certificat de Classe",Arrays.asList("§6[Dofus]",MessageFormat.format("§2{0}",classType))));
		player.closeInventory();
	}
}
