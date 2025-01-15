package org.sono.sonoNetwork.events;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class OnJoin implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        MiniMessage miniMessage = MiniMessage.miniMessage();
        String joiningPlayerName = event.getPlayer().getName();
        String formattedMessage = "<gradient:#ff5733:#33cfff>Willkommen <bold>" + joiningPlayerName + "</bold> auf dem Server!</gradient>";
        Component messageComponent = miniMessage.deserialize(formattedMessage);
        event.setJoinMessage(null);
        Bukkit.getServer().sendMessage(messageComponent);
    }
}