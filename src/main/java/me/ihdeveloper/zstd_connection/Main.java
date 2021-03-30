package me.ihdeveloper.zstd_connection;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage("§eZstd Connection§a is enabled! §ePlugin By §3@iHDeveloper");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage("§eZstd Connection§c is disabled! §ePlugin By §3@iHDeveloper");
    }

}
