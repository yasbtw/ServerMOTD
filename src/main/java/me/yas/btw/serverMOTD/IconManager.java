package me.yas.btw.serverMOTD;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.util.CachedServerIcon;

import java.io.File;

import static me.yas.btw.serverMOTD.ServerMOTD.getplugin;

public class IconManager {
    private CachedServerIcon Icon;
    ServerMOTD plugin = getplugin();

    public void loadIcon(){
        String path = getplugin().getConfig().getString("Custom-Server-Icon.Image");
        if (path != null){
            try {
                File iconFile = new File(plugin.getDataFolder(), path);
                Icon = Bukkit.loadServerIcon(iconFile);
                plugin.getLogger().info("works!!");
            } catch (Exception e) {
                plugin.getLogger().warning("Could not load server icon: " + e.getMessage());
            }
        }

    }

    public CachedServerIcon getServerIcon(){
        return Icon;
    }
}
