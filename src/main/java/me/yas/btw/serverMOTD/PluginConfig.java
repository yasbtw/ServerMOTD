package me.yas.btw.serverMOTD;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import static me.yas.btw.serverMOTD.ServerMOTD.getplugin;

public class PluginConfig {
    public String line1, line2, joinMessage, Icon;
    public boolean serverIcon, maxPlayersModify, joinEnabled;
    public int maxPlayers;
    public void reload() {
        getplugin().reloadConfig();
        FileConfiguration config = getplugin().getConfig();
        joinEnabled = config.getBoolean("Join-Message.Enabled");
        Icon = config.getString("Custom-Server-Icon.Image");
        joinMessage = ChatColor.translateAlternateColorCodes('&', config.getString("Join-Message.Messages","Welcome"));
        line1 = ChatColor.translateAlternateColorCodes('&', config.getString("Server-MOTD.Line-1", "First line"));
        line2 = ChatColor.translateAlternateColorCodes('&', config.getString("Server-MOTD.Line-2", "Second Line"));
        serverIcon = config.getBoolean("Custom-Server-Icon.Enabled", false);
        maxPlayersModify = config.getBoolean("Server-Maximum-Players.Modify", false);
        maxPlayers = config.getInt("Server-Maximum-Players.Maximum-Players", 20);
    }
}
