package com.ewoudje.bukkit.dcore;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

/**
 * Created by ewoud_000 on 21/07/2016.
 */
public class BukkitPrinter {

    private String name;

    public BukkitPrinter(String name) {
        this.name = name;
    }

    public void normalConsolePrint(String message) {
        System.out.println(ChatColor.GREEN + "[" + name + "] " + ChatColor.RESET + message);
    }

    public void normalBroadcast(String message) {
        Bukkit.getServer().broadcastMessage(ChatColor.GREEN + "[" + name + "] " + ChatColor.RESET + message);
    }

    public void errorBroadcast(String message) {
        Bukkit.getServer().broadcastMessage(ChatColor.RED + "[" + name + "] " + "/Error/" + ChatColor.RESET + message);
    }

    public void errorConsolePrint(String message) {
        System.out.println(ChatColor.RED + "[" + name + "] " + "/Error/" + ChatColor.RESET + message);
    }
}
