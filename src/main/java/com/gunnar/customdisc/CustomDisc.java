package com.gunnar.customdisc;

import org.bukkit.plugin.java.JavaPlugin;

public class CustomDisc extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("CustomDisc plugin started!");
        // Your plugin initialization code here
    }

    @Override
    public void onDisable() {
        getLogger().info("CustomDisc plugin stopped!");
        // Your plugin cleanup code here
    }
}
