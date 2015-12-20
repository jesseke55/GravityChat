package net.gravitynetwork.chat;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Jesse on 20-12-2015.
 */
public class Main extends JavaPlugin implements Listener {

    private static Plugin plugin;

   public static Plugin getPlugin(){
       return plugin;
   }

    public void onEnable(){
        plugin = this;
        CONFIG();
        Bukkit.getPluginManager().registerEvents(new Chat(), this);
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    public void onDisable(){
        plugin = null;
    }

    private void CONFIG(){
        getConfig().addDefault("Chat.default", "&6%s &3>> &6%s");
        getConfig().addDefault("Chat.gravity", "&8&l[&9Gravity&8&l] &6&l%s &3>> &6%s");
        getConfig().addDefault("Chat.gravityvip", "&8&l[&9Gravity &6&lVIP&8&l] &6&l%s &3>> &6%s");
        getConfig().addDefault("Chat.gravityhero", "&8&l[&9Gravity &6&lHERO&8&l] &6&l%s &3>> &6%s");
        getConfig().addDefault("Chat.gravityelite", "&8&l[&9Gravity &6&lELTIE&8&l] &6&l%s &3>> &6%s");
        getConfig().addDefault("Chat.builder", "&8&l[&9Builder&8&l] &6&l%s &3>> &6%s");
        getConfig().addDefault("Chat.helper", "&8&l[&6Helper&8&l] &6&l%s &3>> &6%s");
        getConfig().addDefault("Chat.mod", "&8&l[&bMod&8&l] &6&l%s &3>> &6%s");
        getConfig().addDefault("Chat.admin", "&8&l[&4Admin&8&l] &6&l%s &3>> &6%s");
        getConfig().addDefault("Chat.dev", "&8&l[&e&lDeveloper&8&l] &6&l%s &3>> &6%s");
        getConfig().addDefault("Chat.sysadmin", "&8&l[&5&lSystem Administrator&8&l] &6&l%s &3>> &6%s");
        getConfig().addDefault("Chat.owner", "&8&l[&a&lOwner&8&l] &6&l%s &3>> &6%s");


        getConfig().options().copyDefaults(true);
        saveConfig();


    }
}
