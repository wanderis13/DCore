package com.ewoudje.bukkit.dcore;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

/**
 * Created by ewoud_000 on 21/07/2016.
 */
public class Main extends JavaPlugin {
    public static BukkitPrinter bp = new BukkitPrinter("DCore");

    @Override
    public void onEnable() {
        bp.normalBroadcast("DCore Enabled");
        getServer().getPluginManager().registerEvents(new PlayerEvent(), this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("money")) sender.sendMessage(ChatColor.GOLD + "" + MoneyHandler.getMoneyFormPlayer(((Player) sender)) + " Gold");
        return true;
    }
}
