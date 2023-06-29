package me.sialim.mutechatplugin;

import me.sialim.mutechatplugin.commands.MuteCommand;
import me.sialim.mutechatplugin.listeners.ChatListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class MuteChatPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("mutechat").setExecutor(new MuteCommand());
        getServer().getPluginManager().registerEvents(new ChatListener(), this);
    }
}
