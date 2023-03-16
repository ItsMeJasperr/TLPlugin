package com.jjwngamer.tlpluginsnowville;

import org.bukkit.plugin.java.JavaPlugin;

public final class TLPluginSnowville extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("==========( TLPlugin )=========");
        getLogger().info("» Status: Enabled");
        getLogger().info("» Version: " + getDescription().getVersion());
        getLogger().info("» Author: " + getDescription().getAuthors());
        getLogger().info("» Support Discord: https://discord.gg/4bMneafFmJ");
        getLogger().info("==========( TLPlugin )=========");
        getCommand("tl").setExecutor(new tlCommand());
    }
}
