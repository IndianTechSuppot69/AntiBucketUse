package me.indiantechsupport.antibucketuse;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Listener;
public final class AntiBucketUse extends JavaPlugin implements Listener{

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new BucketUsageListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin cleanup if needed
    }
}
