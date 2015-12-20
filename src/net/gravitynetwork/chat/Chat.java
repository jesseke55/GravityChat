package net.gravitynetwork.chat;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

/**
 * Created by Jesse on 20-12-2015.
 */
public class Chat implements Listener {

    @EventHandler
    public void onChat(AsyncPlayerChatEvent e){
        Player p = e.getPlayer();

            e.setFormat(ChatColor.translateAlternateColorCodes('&', Main.getPlugin().getConfig().getString("Chat.default")));

        if(p.hasPermission("gravity.chat.gravity")){
            e.setFormat(ChatColor.translateAlternateColorCodes('&', Main.getPlugin().getConfig().getString("Chat.gravity")));
        }
        if(p.hasPermission("gravity.chat.gravityvip")){
            e.setFormat(ChatColor.translateAlternateColorCodes('&', Main.getPlugin().getConfig().getString("Chat.gravityvip")));
        }
        if(p.hasPermission("gravity.chat.gravityhero")){
            e.setFormat(ChatColor.translateAlternateColorCodes('&', Main.getPlugin().getConfig().getString("Chat.gravityhero")));
        }
        if(p.hasPermission("gravity.chat.gravity")){
            e.setFormat(ChatColor.translateAlternateColorCodes('&', Main.getPlugin().getConfig().getString("Chat.gravityelite")));
        }
        if(p.hasPermission("gravity.chat.builder")){
            e.setFormat(ChatColor.translateAlternateColorCodes('&', Main.getPlugin().getConfig().getString("Chat.builder")));
        }
        if(p.hasPermission("gravitychat.helper")){
            e.setFormat(ChatColor.translateAlternateColorCodes('&', Main.getPlugin().getConfig().getString("Chat.helper")));
        }
        if(p.hasPermission("gravity.chat.mod")){
            e.setFormat(ChatColor.translateAlternateColorCodes('&', Main.getPlugin().getConfig().getString("Chat.mod")));
        }
        if(p.hasPermission("gravity.chat.admin")){
            e.setFormat(ChatColor.translateAlternateColorCodes('&', Main.getPlugin().getConfig().getString("Chat.admin")));
        }
        if(p.hasPermission("gravity.chat.dev")){
            e.setFormat(ChatColor.translateAlternateColorCodes('&', Main.getPlugin().getConfig().getString("Chat.dev")));
        }
        if(p.hasPermission("gravity.chat.owner") || (p.isOp())){
            e.setFormat(ChatColor.translateAlternateColorCodes('&', Main.getPlugin().getConfig().getString("Chat.owner")));
        }
    }
}
