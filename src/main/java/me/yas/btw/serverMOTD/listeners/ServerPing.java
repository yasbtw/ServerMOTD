package me.yas.btw.serverMOTD.listeners;

import me.yas.btw.serverMOTD.ServerMOTD;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Server;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;
import org.bukkit.util.CachedServerIcon;

import static me.yas.btw.serverMOTD.ServerMOTD.getplugin;

public class ServerPing implements Listener {
    private FileConfiguration Config = getplugin().getConfig();
    private String Line1 = load("Server-MOTD.Line-1", "First line");
    private String Line2 = load("Server-MOTD.Line-2", "Second Line");
    private Boolean serverIcon = Config.getBoolean("Custom-Server-Icon.Enabled");

    public String load(String path, String def){
        return ChatColor.translateAlternateColorCodes('&',Config.getString(path,def));
    }

    @EventHandler
    public void onPing(ServerListPingEvent event){
        String Motd = Line1+"\n"+Line2;
        event.setMotd(Motd);
        if (serverIcon){
            event.setServerIcon(getplugin().getIconManager().getServerIcon());
        }

    }
}
