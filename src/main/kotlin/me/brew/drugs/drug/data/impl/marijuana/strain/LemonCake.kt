package me.brew.drugs.drug.data.impl.marijuana.strain

import me.brew.drugs.drug.data.impl.marijuana.MarijuanaStrain
import org.bukkit.ChatColor

object LemonCake : MarijuanaStrain("lemon-cake","${ChatColor.YELLOW}Lemon Cake") {

    override fun getTHCPercentage(): Double {
        return 19.0
    }

    override fun getType(): MarijuanaType {
        return MarijuanaType.SATIVA
    }

    override fun getDescription(): MutableList<String> {
        return mutableListOf()
    }

}