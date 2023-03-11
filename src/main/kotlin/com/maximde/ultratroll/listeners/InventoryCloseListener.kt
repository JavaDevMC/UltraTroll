package com.maximde.ultratroll.listeners

import org.bukkit.Bukkit
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.inventory.InventoryCloseEvent
import org.bukkit.event.Listener
import org.bukkit.inventory.Inventory


class InventoryCloseListener : Listener {

    @EventHandler
    fun onClose(event: InventoryCloseEvent) {
        if(event.view.title.equals("§c§lTROLLLLLL!!!")) {
            var inv: Inventory = Bukkit.createInventory(event.player, 9*6, "§c§lTROLLLLLL!!!")
            event.player.openInventory(inv)
        }
    }
}