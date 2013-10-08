package teamProject;

import java.util.logging.Logger;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class TeamProject extends JavaPlugin {
public final Logger logger = Logger.getLogger("Minecraft");
static Plugin plugin;

@Override
public void onEnable() {
	PluginDescriptionFile config = this.getDescription();
	this.logger.info(config.getName() + " Version "  + config.getVersion() + " Has been Enabled!");
	//I KICK ASS
}

@Override
public void onDisable() {
	PluginDescriptionFile config = this.getDescription();
	this.logger.info(config.getName() + " has Been Disabled!");
}

	
}
