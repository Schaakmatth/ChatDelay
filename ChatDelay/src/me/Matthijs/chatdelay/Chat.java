package me.Matthijs.chatdelay;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class Chat implements Listener {
	
	@EventHandler
	public void onChat(AsyncPlayerChatEvent e) {
		        Player p = e.getPlayer();
				if(e.getMessage().startsWith("red"));
				e.setCancelled(true);
				p.setDisplayName(ChatColor.AQUA + "%s");
				
				
			}
			
	}


