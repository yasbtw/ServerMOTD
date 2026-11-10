package me.yas.btw.serverMOTD;
import me.yas.btw.serverMOTD.listeners.ServerPing;
import org.bukkit.plugin.java.JavaPlugin;
public final class ServerMOTD extends JavaPlugin {
    private static ServerMOTD plugin;
    private IconManager iconManager;
    @Override
    public void onEnable() {
        saveDefaultConfig();
        plugin = this;
        iconManager = new IconManager();
        iconManager.loadIcon();
        getServer().getPluginManager().registerEvents(new ServerPing(),this);
    }

    public static ServerMOTD getplugin(){
        return plugin;
    }
    public IconManager getIconManager() {
        return iconManager;
    }
}
