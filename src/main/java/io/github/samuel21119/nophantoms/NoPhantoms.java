package io.github.samuel21119.nophantoms;

import io.github.samuel21119.nophantoms.KillPhantom.KillPhantoms;
import org.bukkit.plugin.java.JavaPlugin;

public final class NoPhantoms extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new KillPhantoms(), this);
        getLogger().info("NoPhantom Enabled!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("NoPhantom Disabled!");
    }
}
