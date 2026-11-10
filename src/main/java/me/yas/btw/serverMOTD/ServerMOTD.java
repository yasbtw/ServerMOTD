package me.yas.btw.serverMOTD;
import me.yas.btw.serverMOTD.commands.MotdCommand;
import me.yas.btw.serverMOTD.listeners.PlayerJoin;
import me.yas.btw.serverMOTD.listeners.ServerPing;
import org.bukkit.plugin.java.JavaPlugin;
public final class ServerMOTD extends JavaPlugin {
    private static ServerMOTD plugin;
    public IconManager iconManager;
    public PluginConfig pluginConfig;
    @Override
    public void onEnable() {
        saveDefaultConfig();
        plugin = this;
        (pluginConfig = new PluginConfig()).reload();
        (iconManager = new IconManager()).loadIcon();
        getCommand("motd").setExecutor(new MotdCommand());
        getServer().getPluginManager().registerEvents(new ServerPing(),this);
        getServer().getPluginManager().registerEvents(new PlayerJoin(),this);
    }

    public static ServerMOTD getplugin(){return plugin;}
}
