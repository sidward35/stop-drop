package me.sidward35;

/*import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;*/
import org.bukkit.plugin.java.JavaPlugin;

public class StopDrop extends JavaPlugin{
	@Override
	public void onEnable(){
		//getLogger().info("StopDrop enabled.");
		new PlayerListener(this);
	}
	
	@Override
	public void onDisable(){}
	
	/*public boolean onCommand(CommandSender sender, Command cmd, String label, String[]args){
		if(cmd.getName().equalsIgnoreCase("sneak") && sender instanceof Player){
			return true;
		}
		return false;
	}*/
}
