package me.yas.btw.serverMOTD;

import org.bukkit.Bukkit;
import org.bukkit.util.CachedServerIcon;

import java.io.File;

import static me.yas.btw.serverMOTD.ServerMOTD.getplugin;

public class IconManager {
    public CachedServerIcon Icon;
    PluginConfig pl = getplugin().pluginConfig;
    public void loadIcon(){
        String path = pl.Icon;
        if (path != null){
            try {
                File iconFile = new File(getplugin().getDataFolder(), path);
                Icon = Bukkit.loadServerIcon(iconFile);
            } catch (Exception e) {
                getplugin().getLogger().info("couldn't find image");
            }
        }

    }
}
