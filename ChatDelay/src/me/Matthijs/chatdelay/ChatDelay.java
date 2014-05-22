package me.Matthijs.chatdelay;

import java.util.logging.Logger;

import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class ChatDelay extends JavaPlugin implements Listener {
	public final Logger logger = Logger.getLogger("Minecraft");
	public static ChatDelay plugin;
	
	
	@Override
	public void onEnable() {
		this.logger.info("[ChatDelay] On!");
		getServer().getPluginManager().registerEvents(new Chat(), this);
	}
	
	
	@Override
	public void onDisable() {
		this.logger.info("[ChatDelay] Off!");
	}


	public static Plugin getMain() {
		return null;
	}

}
