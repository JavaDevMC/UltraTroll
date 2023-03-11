package com.maximde.ultratroll.commands

import org.bukkit.Bukkit
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.bukkit.inventory.Inventory

class AntiLeaveCommand : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {

        if(args.size == 1) {
            var target: Player? = Bukkit.getPlayer(args[0])
            if (target == null) {
                sender.sendMessage("§cPlayer not found!")
                return false;
            }

            var inv: Inventory = Bukkit.createInventory(target, 9*6, "§c§lTROLLLLLL!!!")
            target.openInventory(inv)
            sender.sendMessage("§aSuccess")

        } else {
            sender.sendMessage("§cUsage /noleave <player>")
        }

        return false;
    }
}