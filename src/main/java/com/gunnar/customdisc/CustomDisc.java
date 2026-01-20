package com.gunnar.customdisc;

import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class CustomDisc extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("CustomDisc plugin started!");
        // Your plugin initialization code here
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        
        if(!(sender instanceof Player player)) {
            sender.sendMessage("Only players can use this command.");
            return true;
        }

        player.playSound(player.getLocation(), Sound.MUSIC_DISC_CAT, 1.0f, 1.0f);
        player.sendMessage("Playing custom disc sound!");
        return true;
    }

    // @Override
    // public void onDisable() {
    //     getLogger().info("CustomDisc plugin stopped!");
    //     // Your plugin cleanup code here
    // }    
}
