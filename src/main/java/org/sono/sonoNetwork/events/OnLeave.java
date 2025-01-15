package org.sono.sonoNetwork.events;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class OnLeave implements Listener {

    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent event) {
        MiniMessage miniMessage = MiniMessage.miniMessage();
        String leavingPlayerName = event.getPlayer().getName();
        String formattedMessage = "<gradient:#33cfff:#ff5733><bold>" + leavingPlayerName + "</bold> hat den Server verlassen.</gradient>";
        Component messageComponent = miniMessage.deserialize(formattedMessage);
        event.setQuitMessage(null);
        Bukkit.getServer().sendMessage(messageComponent);
    }
}