package me.indiantechsupport.antibucketuse;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class BucketUsageListener implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        ItemStack itemInHand = player.getInventory().getItemInMainHand();

        // Check if the player is holding a water or lava bucket
        if (itemInHand != null && (itemInHand.getType() == Material.WATER_BUCKET || itemInHand.getType() == Material.LAVA_BUCKET)) {
            // Check if the item is stacked
            if (itemInHand.getAmount() > 1) {
                // Create a new ItemStack with a stack size of 1
                ItemStack singleBucket = new ItemStack(itemInHand.getType(), 1);
                // Remove one item from the stack
                itemInHand.setAmount(itemInHand.getAmount() - 1);
                // Update the player's inventory with the modified ItemStacks
                player.getInventory().setItemInMainHand(singleBucket);
                player.getInventory().addItem(itemInHand);
            }
        }
    }
}
