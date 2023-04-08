package com.jjwngamer.tlplugin.utils;

import org.bukkit.ChatColor;

public class CC {
    public static String color(String msg) {
        return ChatColor.translateAlternateColorCodes('&', msg);
    }
}