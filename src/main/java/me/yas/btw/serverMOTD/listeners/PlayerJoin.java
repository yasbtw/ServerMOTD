package me.yas.btw.serverMOTD.listeners;

import me.yas.btw.serverMOTD.PluginConfig;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import static me.yas.btw.serverMOTD.ServerMOTD.getplugin;

public class PlayerJoin implements Listener {
    PluginConfig pl = getplugin().pluginConfig;
    @EventHandler
    public void playerJoin(PlayerJoinEvent event){
        if (pl.joinEnabled){
            event.getPlayer().sendMessage(pl.joinMessage);
        }
    }
}
