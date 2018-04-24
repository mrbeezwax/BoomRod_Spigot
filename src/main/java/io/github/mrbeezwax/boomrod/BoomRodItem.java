package io.github.mrbeezwax.boomrod;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class BoomRodItem {
    private ItemStack BoomRod;
    public BoomRodItem()
    {
        BoomRod = new ItemStack(Material.BLAZE_ROD, 1);
        ItemMeta BoomRod_meta = BoomRod.getItemMeta();
        BoomRod_meta.setDisplayName(ChatColor.DARK_RED + "BoomRod");
        BoomRod.setItemMeta(BoomRod_meta);
    }

    public static ItemStack getItem()
    {
        return new BoomRodItem().BoomRod;
    }
}
