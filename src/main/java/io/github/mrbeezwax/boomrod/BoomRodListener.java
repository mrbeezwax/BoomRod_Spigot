package io.github.mrbeezwax.boomrod;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public final class BoomRodListener implements Listener {
    public BoomRodListener(BoomRod plugin)
    {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
    @EventHandler
    public void onRightClick(PlayerInteractEvent event)
    {
        Action click = event.getAction();
        Player p = event.getPlayer();
        if (click == Action.RIGHT_CLICK_AIR || click == Action.RIGHT_CLICK_BLOCK) {
            if (p.getInventory().getItemInMainHand().getItemMeta().equals(BoomRodItem.getItem().getItemMeta()))
            {
                p.getWorld().createExplosion(p.getTargetBlock(null, 200).getLocation(), 5);
            }
        }
    }
}
