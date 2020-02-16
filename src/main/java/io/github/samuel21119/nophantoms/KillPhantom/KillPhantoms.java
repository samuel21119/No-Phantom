package io.github.samuel21119.nophantoms.KillPhantom;

import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Phantom;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class KillPhantoms implements Listener{
    @EventHandler
    public void onSpawn(CreatureSpawnEvent event) {
        if(event.isCancelled())
            return;
        LivingEntity creature = event.getEntity();
        if (creature instanceof Phantom) {
            creature.remove();
        }
    }
}
