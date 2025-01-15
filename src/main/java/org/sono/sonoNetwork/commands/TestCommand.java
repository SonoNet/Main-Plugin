package org.sono.sonoNetwork.commands;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class TestCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        MiniMessage miniMessage = MiniMessage.miniMessage();

        String username = commandSender.getName();

        String formattedMessage = "<gradient:#ff5733:#33cfff>Hallo <bold>" + username + "</bold>!</gradient>";

        Component messageComponent = miniMessage.deserialize(formattedMessage);

        commandSender.sendMessage(messageComponent);

        return true;
    }
}