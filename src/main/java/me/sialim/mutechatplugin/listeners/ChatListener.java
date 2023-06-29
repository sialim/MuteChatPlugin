package me.sialim.mutechatplugin.listeners;

import me.sialim.mutechatplugin.utils.MuteUtils;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatListener implements Listener {
    @EventHandler
    public void onChat(AsyncPlayerChatEvent e){
        Player p = e.getPlayer();
        e.setCancelled(MuteUtils.muteToggle);
    }
}
