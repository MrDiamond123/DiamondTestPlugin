package me.diamond.test;

import me.diamond.test.commands.*;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable(){
        getServer().getPluginManager().registerEvents(new DiamondListener(),this);
        //  COMMANDS
        getCommand("hello").setExecutor(new CommandHello());
        getCommand("tps").setExecutor(new CommandTps());

    }

    @Override
    public void onDisable() {

    }


}
