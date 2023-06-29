package me.sialim.mutechatplugin.commands;

import me.sialim.mutechatplugin.utils.MuteUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MuteCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if(!(sender instanceof Player p)){
            System.out.println("Command can only be ran by player.");
        }else{
            p.sendMessage("Chat mute toggled! (" + MuteUtils.muteToggle + ")");
            MuteUtils.muteToggle= !MuteUtils.muteToggle;
        }
        return true;
    }
}
