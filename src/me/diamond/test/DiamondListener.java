package me.diamond.test;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class DiamondListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        event.setJoinMessage(ChatColor.BOLD + "" + ChatColor.GOLD + player.getDisplayName() + ChatColor.RESET + " has joined! Welcome!");

    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        event.setQuitMessage(ChatColor.BOLD + "" + ChatColor.GOLD + player.getDisplayName() + ChatColor.RESET + " has quited! Cya Later!");
    }



}
