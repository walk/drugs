package me.brew.drugs

import org.bukkit.plugin.java.JavaPlugin

/**
 * @author brew@atheist.com
 *
 * @date 8/19/2021
 * @project drugs
 */
class DrugsPlugin : JavaPlugin() {

    override fun onEnable() {
        instance = this

        this.saveDefaultConfig()
    }

    companion object {
        lateinit var instance: DrugsPlugin
    }

}