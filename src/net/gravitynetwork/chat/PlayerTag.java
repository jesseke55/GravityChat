package net.gravitynetwork.chat;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.metadata.MetadataValue;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Jesse on 20-12-2015.
 */
public class PlayerTag implements Listener {

    @EventHandler
    public void onTag(AsyncPlayerChatEvent e){
        String message = e.getMessage();

    String usernameStr = "@\\w*";
    Pattern usernamePattern = Pattern.compile(usernameStr);
    Matcher usernameMatcher = usernamePattern.matcher(message);
    String usernameResult = "";
    while (usernameMatcher.find())
    {
        usernameResult = usernameMatcher.group();
        usernameResult = usernameResult.replace(" ", "");

        String handle = usernameResult.replace("@", "");
        if (handle.length() <= 16)
        {
            String handleOutput = ChatColor.AQUA + "#" + handle + ChatColor.RESET;

            message = message.replace(usernameResult, handleOutput);
            if ((Bukkit.getPlayerExact(handle).isOnline()) || ((handle.length() >= 5) && (Bukkit.getPlayer(handle).isOnline())))
            {
                final Player recipient = Bukkit.getPlayer(handle);
                {

                    recipient.getWorld().playSound(recipient.getLocation(), Sound.NOTE_PIANO, 1.0F, 12.0F);
                    Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), new Runnable()
                    {
                        public void run()
                        {
                            recipient.getWorld().playSound(recipient.getLocation(), Sound.NOTE_PIANO, 1.0F, 10.0F);
                        }
                    }, 6L);

                }
            }
        }
    }
    e.setMessage(message);
   }
}
