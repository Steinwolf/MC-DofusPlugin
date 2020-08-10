package fr.xperiment.dofusplugin;

import org.bukkit.plugin.java.JavaPlugin;

import fr.xperiment.dofusplugin.commands.CommandsExecutor;

public class Main extends JavaPlugin{

	@Override
	public void onEnable() {
		System.out.println("[Dofus Plugin] Started");
		getCommand("class").setExecutor(new CommandsExecutor());
		getServer().getPluginManager().registerEvents(new DofusListener(), this);
	}
	
	@Override
	public void onDisable() {
		System.out.println("[Dofus Plugin] Stopped");
	}
}