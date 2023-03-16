package com.jjwngamer.tlpluginsnowville;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class tlCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        double xLoc = p.getLocation().getX();
        double yLoc = p.getLocation().getY();
        double zLoc = p.getLocation().getZ();

        p.chat(ChatColor.WHITE + "Locatie: " + Math.round(xLoc) + ", " + Math.round(yLoc) + ", " + Math.round(zLoc));
        return false;
    }
}
