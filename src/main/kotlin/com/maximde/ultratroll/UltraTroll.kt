package com.maximde.ultratroll

import com.maximde.ultratroll.commands.AntiLeaveCommand
import com.maximde.ultratroll.commands.CrashCommand
import com.maximde.ultratroll.commands.LaggCommand
import com.maximde.ultratroll.listeners.InventoryCloseListener
import org.bukkit.plugin.java.JavaPlugin

class UltraTroll : JavaPlugin() {

    override fun onEnable() {
        server.pluginManager.registerEvents(InventoryCloseListener(), this)
        getCommand("noleave")?.setExecutor(AntiLeaveCommand());
        getCommand("crash")?.setExecutor(CrashCommand());
        getCommand("lag")?.setExecutor(LaggCommand());
    }

    override fun onDisable() {

    }

}