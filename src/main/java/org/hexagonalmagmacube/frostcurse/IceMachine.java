package org.hexagonalmagmacube.frostcurse;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;

import static org.bukkit.Bukkit.getServer;

public class IceMachine implements Runnable {
    @Override
    public void run() {
        for (Player player : getServer().getOnlinePlayers()){
            Location location = player.getLocation();
            int x = location.getBlockX();
            int y = location.getBlockY();
            int z = location.getBlockZ();

            player.getWorld().getBlockAt(x+1, y-1, z).setType(Material.ICE);
            player.getWorld().getBlockAt(x-1, y-1, z).setType(Material.ICE);
            player.getWorld().getBlockAt(x, y-1, z+1).setType(Material.ICE);
            player.getWorld().getBlockAt(x, y-1, z-1).setType(Material.ICE);
        }
    }
}
