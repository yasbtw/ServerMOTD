package me.yas.btw.serverMOTD.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

import static me.yas.btw.serverMOTD.ServerMOTD.getplugin;

public class MotdCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (args.length == 0){
            sender.sendMessage("/motd <edit/reload/idk>");
        }else{
            if (args[0].equals("reload")){
                getplugin().pluginConfig.reload();
                sender.sendMessage("Plugin reloaded");
            }
        }
        return true;
    }
}
