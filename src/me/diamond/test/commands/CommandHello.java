package me.diamond.test.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandHello implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;
                if(args.length == 1) switch (args[0]) {
                    case "m8":
                        player.sendMessage("Hello mate!");
                        break;

                    case "dude":
                        player.sendMessage("What's up dude!");
                        break;

                    default:
                        player.sendMessage("Invalid usage (Type m8 or dude for special message)");
                        break;
                }
                else {  player.sendMessage(ChatColor.YELLOW + "Hello, " + player.getDisplayName() + "!"); }
            }

        return true;
    }
}
