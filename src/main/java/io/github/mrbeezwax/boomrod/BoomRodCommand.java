package io.github.mrbeezwax.boomrod;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BoomRodCommand implements CommandExecutor
{
    // Command: /BoomRod
    // Description: Gives the player a BoomRod
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player)
        {
            Player player = (Player) sender;
            if (player.hasPermission("boomrod.boomrod"))
            {
                player.getInventory().setItemInMainHand(BoomRodItem.getItem());
                player.sendMessage("You have been blessed with a BoomRod.");
                return true;
            }
            return false;
        }
        else
        {
            sender.sendMessage("You must be a player!");
            return false;
        }
    }
}
