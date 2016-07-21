package com.ewoudje.bukkit.dcore;

import org.bukkit.configuration.Configuration;
import org.bukkit.entity.Player;

/**
 * Created by ewoud_000 on 21/07/2016.
 */
public class MoneyHandler {
    private static PlayerDataHandler pdh = new PlayerDataHandler();

    public static void addMoneyToPlayer(int money, Player p) {
        Configuration c = pdh.getConfig();
        if (c.get(p.getUniqueId().toString()) == null) {
            c.set(p.getUniqueId().toString() + ".money", money);
            return;
        }
        c.set(p.getUniqueId().toString() + ".money", c.getInt(p.getUniqueId().toString() + ".money") + money);
        pdh.saveConfig();
    }

    public static boolean withdrawMoneyFormPlayer(int money, Player p) {
        Configuration c = pdh.getConfig();
        if (c.get(p.getUniqueId().toString()) == null || c.getInt(p.getUniqueId().toString() + ".money") - money < 0) return false;
        c.set(p.getUniqueId().toString() + ".money", c.getInt(p.getUniqueId().toString() + ".money") - money);
        pdh.saveConfig();
        return true;
    }

    public static int getMoneyFormPlayer(Player p) {
        Configuration c = pdh.getConfig();
        return c.getInt(p.getUniqueId().toString() + ".money");
    }
}
