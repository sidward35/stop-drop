package me.sidward35;

import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class PlayerListener implements Listener{
	public PlayerListener(StopDrop plugin){
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onThrow(PlayerDropItemEvent event){
		Player player = event.getPlayer();
		Item item = event.getItemDrop();
		if(item.getType().equals(Material.ACACIA_STAIRS)){
			event.setCancelled(true);
			player.sendMessage("You cannot drop custom items!");
		}
	}
}
