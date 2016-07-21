package com.ewoudje.bukkit.dcore;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * Created by ewoud_000 on 21/07/2016.
 */
public final class PlayerEvent implements Listener{

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        MoneyHandler.addMoneyToPlayer(10, e.getPlayer());
    }
}
