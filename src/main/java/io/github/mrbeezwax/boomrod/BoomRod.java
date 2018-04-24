package io.github.mrbeezwax.boomrod;

import org.bukkit.plugin.java.JavaPlugin;

public final class BoomRod extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("BoomRod").setExecutor(new BoomRodCommand());
        // A different way of implementing a listener
        // getServer().getPluginManager().registerEvents(new BoomRodListener(), this);
        new BoomRodListener(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
