package org.hexagonalmagmacube.frostcurse;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import static org.bukkit.Bukkit.getLogger;

public class FrostCursePlugin extends JavaPlugin {
    private static final String PLUGIN_NAME = "FrostCurse";

    private IceMachine iceMachine;

    @Override
    public void onEnable() {
        Bukkit.getLogger().info(PLUGIN_NAME + " has started");

        iceMachine = new IceMachine();
        Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(
                this, iceMachine, 500, 0);
    }

    public void onDisable( ) {
        Bukkit.getLogger().info(PLUGIN_NAME + " has stopped");

    }
}