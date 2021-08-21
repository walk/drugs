package me.brew.drugs.drug.data.impl.marijuana.strain

import me.brew.drugs.drug.data.impl.marijuana.MarijuanaStrain
import org.bukkit.ChatColor

object MauiWowie : MarijuanaStrain("maui-wowie","${ChatColor.GOLD}Maui Wowie") {

    override fun getTHCPercentage(): Double {
        return 17.0
    }

    override fun getType(): MarijuanaType {
        return MarijuanaType.SATIVA
    }

    override fun getDescription(): MutableList<String> {
        return mutableListOf(
            "Maui Wowie aka Mowie Wowie or Maui Waui is a classic sativa strain",
            "made from a cross of Hawaiian and an unknown strain."
        )
    }

}