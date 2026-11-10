package me.yas.btw.serverMOTD.listeners;

import me.yas.btw.serverMOTD.PluginConfig;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;
import static me.yas.btw.serverMOTD.ServerMOTD.getplugin;

public class ServerPing implements Listener {
    PluginConfig pl = getplugin().pluginConfig;
    @EventHandler
    public void onPing(ServerListPingEvent event){
        String Motd = pl.line1+"\n"+pl.line2;
        event.setMotd(Motd);
        if (pl.serverIcon){event.setServerIcon(getplugin().iconManager.Icon);}
        if (pl.maxPlayersModify){event.setMaxPlayers(pl.maxPlayers);}
    }
}
